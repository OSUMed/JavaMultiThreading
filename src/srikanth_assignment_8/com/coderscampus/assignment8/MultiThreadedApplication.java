package srikanth_assignment_8.com.coderscampus.assignment8;

import srikanth_assignment_8.com.coderscampus.assignment8.services.ThreadService;

public class MultiThreadedApplication {

	public static void main(String[] args) {
		// Connect to NumbersAPI, call it's API, then print results to console:
		ThreadService threadService = new ThreadService();
		threadService.callAPI();
		threadService.printHashMap();
		threadService.shutdown();
	}

}
