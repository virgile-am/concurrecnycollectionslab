package com.concurrecnycollectionslab.concurrencylab.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PerformanceService {

    public void comparePerformance() {
        int size = 1000000;

        // Benchmark for ArrayList (non-concurrent collection)
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endTime - startTime) + " ms");

        // Benchmark for CopyOnWriteArrayList (concurrent collection)
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            copyOnWriteArrayList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("CopyOnWriteArrayList time: " + (endTime - startTime) + " ms");
    }
}
