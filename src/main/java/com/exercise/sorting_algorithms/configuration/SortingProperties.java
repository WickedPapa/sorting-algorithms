package com.exercise.sorting_algorithms.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sorting")
public record SortingProperties(SortingImplementation implementation) {}