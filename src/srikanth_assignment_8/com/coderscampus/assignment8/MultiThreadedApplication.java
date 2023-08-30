package srikanth_assignment_8.com.coderscampus.assignment8;

import srikanth_assignment_8.com.coderscampus.assignment8.services.ThreadService;

public class MultiThreadedApplication {

	public static void main(String[] args) {
		// Connect to "Assignment 8 API", call it's API, then print results:
		ThreadService threadService = new ThreadService();
		threadService.callAPI();
		threadService.printHashMap();

	}

}
