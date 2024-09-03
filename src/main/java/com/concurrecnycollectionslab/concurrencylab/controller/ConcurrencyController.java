package com.concurrecnycollectionslab.concurrencylab.controller;

import com.concurrecnycollectionslab.concurrencylab.service.ConcurrencyService;
import com.concurrecnycollectionslab.concurrencylab.service.ConcurrentCollectionsService;
import com.concurrecnycollectionslab.concurrencylab.service.PerformanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concurrency")
public class ConcurrencyController {

    private final ConcurrencyService concurrencyService;
    private final ConcurrentCollectionsService collectionsService;
    private final PerformanceService performanceService;

    public ConcurrencyController(ConcurrencyService concurrencyService,
                                 ConcurrentCollectionsService collectionsService,
                                 PerformanceService performanceService) {
        this.concurrencyService = concurrencyService;
        this.collectionsService = collectionsService;
        this.performanceService = performanceService;
    }

    @GetMapping("/demo-concurrency")
    public String demoConcurrency() {
        concurrencyService.demonstrateConcurrency();
        return "Concurrency demonstration completed.";
    }

    @GetMapping("/demo-multithreading")
    public String demoMultithreading() {
        concurrencyService.demonstrateMultithreading();
        return "Multithreading demonstration completed.";
    }

    @GetMapping("/demo-concurrent-collections")
    public String demoConcurrentCollections() {
        collectionsService.useConcurrentHashMap();
        collectionsService.useCopyOnWriteArrayList();
        return "Concurrent collections demonstration completed.";
    }

    @GetMapping("/compare-performance")
    public String comparePerformance() {
        performanceService.comparePerformance();
        return "Performance comparison completed.";
    }
}
