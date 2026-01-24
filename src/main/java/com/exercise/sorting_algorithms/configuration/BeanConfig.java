package com.exercise.sorting_algorithms.configuration;

import com.exercise.sorting_algorithms.service.BubbleSortEarlyStopServiceImpl;
import com.exercise.sorting_algorithms.service.BubbleSortServiceImpl;
import com.exercise.sorting_algorithms.service.InsertionSortServiceImpl;
import com.exercise.sorting_algorithms.service.SortingService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SortingProperties.class)
public class BeanConfig {

    @Bean
    public SortingService sortingService(SortingProperties properties) {
        return switch (properties.implementation()) {
            case INSERTION_SORT -> new InsertionSortServiceImpl();
            case BUBBLE_SORT -> new BubbleSortServiceImpl();
            case BUBBLE_SORT_EARLY_STOP -> new BubbleSortEarlyStopServiceImpl();
        };
    }
}
