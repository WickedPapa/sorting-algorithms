package com.exercise.sorting_algorithms;

import com.exercise.sorting_algorithms.configuration.SortingImplementation;
import com.exercise.sorting_algorithms.service.SortingService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SortingAlgorithmsApplication {

	private final SortingService sortingService;

	public static void main(String[] args) {
		SpringApplication.run(SortingAlgorithmsApplication.class, args);
	}

	@Bean
	public ApplicationRunner startupRunner() {
		char[] arrayToSort = {'d', 'a', 'c', 'b', 'e', 'h', 'g', 'f', 'j', 'i', 'm', 'l', 'k', 'o', 'n', 'q', 'p', 's', 'r', 't', 'w', 'v', 'y', 'x', 'z', '1', '9', '5', '3', '7', '2', '8', '4', '6', '0'};
		char[] arrayAlreadySorted = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		return args -> {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("WELCOME TO SORTING ALGORITHM IMPLEMENTATION");
			System.out.println("Using implementation: " + sortingService.implementationName());
			System.out.println("You can change the implementation in the application.yaml");
			System.out.println("------------------------------------------------------------------------");
			sortingService.printInfoSort(arrayToSort);
			System.out.println();
			sortingService.printInfoSort(arrayAlreadySorted);
		};

	}

}
