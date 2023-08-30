package srikanth_assignment_8.com.coderscampus.assignment8.services;

import java.util.List;

import srikanth_assignment_8.com.coderscampus.assignment8.Assignment8;

// This Service is what talks to the outside "Assignment 8 API":
// My idea is to great like a Fetch API in javascript in some sense:
public class FetchingService {
	private final Assignment8 apiService;

	// Our service that communicates with Assignment 8 API:
	public FetchingService(Assignment8 url) {
		this.apiService = url;
	}

	// Calling our service's method:
	public List<Integer> callAPI() {
		return this.apiService.getNumbers();
	}

}
