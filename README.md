# Java Multi-Threading Project with NumbersAPI

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Contribute](#contribute)
- [License](#license)

## Introduction

This project is designed to demonstrate the usage of multi-threading in Java, specifically to fetch and process large sets of data asynchronously. It leverages Java's `CompletableFuture` for asynchronous operations and uses the Executor framework for thread management.

## Features

- Asynchronously fetches data from a simulated API called `NumbersAPI`.
- Counts the frequency of each unique integer in the dataset.
- Efficiently handles both I/O and CPU-bound tasks.

## Requirements

- Java 8 or higher
- Maven for dependency management (Optional)

## Installation

Clone this repository and navigate into the project directory. Run the following command to compile the code:

```bash
javac *.java
```

## Usage

Run MultiThreadedApplication.java as a Java application. The program will fetch the data, process it, and print the frequency count of each unique number to the console.

## Expected Output
For a data list like 1, 5, 10, 3, 1, 2, 9, 4, 6, 1, 9, 10, 5, the output should be: 1=3, 2=1, 3=1, 4=1, 5=2, 6=1, 7=0, 8=0, 9=2, 10=2

## Code Overview

## FetchingService
A service class that communicates with the NumbersAPI class to fetch numbers.

public class FetchingService {
    private final NumbersAPI apiService;
    // ... methods
}

## ThreadService
A class that provides methods for CPU and I/O bound tasks, leveraging

## NumbersAPI
This class simulates an API by reading numbers from a text file and providing them in small batches.

## Author
Srikanth Medicherla

