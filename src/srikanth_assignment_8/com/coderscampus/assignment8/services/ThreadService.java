package srikanth_assignment_8.com.coderscampus.assignment8.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import srikanth_assignment_8.com.coderscampus.assignment8.Assignment8;

// Service provides ways for threads to do CPU tasks and call API for IO-tasks:
public class ThreadService {
	FetchingService fetchingService;
	ExecutorService cpuBoundTask = Executors.newFixedThreadPool(5);
	ExecutorService ioBoundTask = Executors.newCachedThreadPool();
	ConcurrentHashMap<Integer, AtomicInteger> results = new ConcurrentHashMap<>();

	public ThreadService() {
		// Creates FetchingService which creates a connection to Assignment8:
		fetchingService = new FetchingService(new Assignment8());
	}

	// Service that connects to API for IO based tasks:
	public void callAPI() {
		List<CompletableFuture<Void>> futures = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			CompletableFuture<Void> future = CompletableFuture

					// ioBoundTask for calling APIs. Returns a CompletableFuture<List<Integer>>:
					.supplyAsync(() -> fetchingService.callAPI(), ioBoundTask)

					// cpuBoundTask for regular computations:
					.thenAcceptAsync(item -> updateIntegerCounts(item), cpuBoundTask);

			futures.add(future);
		}

		boolean allDone = false;
		while (!allDone) {
			allDone = futures.stream().allMatch(CompletableFuture::isDone);

		}
	}

	// Provided Thread Service that does CPU-based tasks:
	private void updateIntegerCounts(List<Integer> numbers) {
		for (Integer number : numbers) {
			AtomicInteger count = results.computeIfAbsent(number, k -> new AtomicInteger(0));
			count.incrementAndGet();
		}
	}
	
	// Provided Thread Service that does CPU-based tasks:
	public void printHashMap() {
		results.forEach((key, value) -> {
			System.out.println("Integer: " + key + ", Count: " + value);
		});
	}

}
