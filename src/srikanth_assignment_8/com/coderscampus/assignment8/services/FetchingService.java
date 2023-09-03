package srikanth_assignment_8.com.coderscampus.assignment8.services;

import java.util.List;

import srikanth_assignment_8.com.coderscampus.assignment8.NumberAPI;

// This Service is what talks to the outside Number API:
// My idea is to great like a Fetch API in javascript in some sense:
public class FetchingService {
	private final NumberAPI apiService;

	// Our service that communicates with the Number API:
	public FetchingService(NumberAPI url) {
		this.apiService = url;
	}

	// Calling our service's method:
	public List<Integer> callAPI() {
		return this.apiService.getNumbers();
	}

}
