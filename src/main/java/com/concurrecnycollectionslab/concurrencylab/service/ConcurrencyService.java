package com.concurrecnycollectionslab.concurrencylab.service;

import com.concurrecnycollectionslab.concurrencylab.util.TaskUtil;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ConcurrencyService {

    public void demonstrateConcurrency() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executor.submit(TaskUtil.createSimpleTask(i));
        }
        executor.shutdown();
    }

    public void demonstrateMultithreading() {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(TaskUtil.createSimpleTask(i));
            thread.start();
        }
    }
}
