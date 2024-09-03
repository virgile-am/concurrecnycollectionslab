package com.concurrecnycollectionslab.concurrencylab.util;

public class TaskUtil {


    public static Runnable createSimpleTask(int taskId) {
        return () -> {
            System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task " + taskId + " was interrupted.");
            }
            System.out.println("Task " + taskId + " completed.");
        };
    }

    public static Runnable createCollectionTask(Iterable<Integer> collection, int start, int end) {
        return () -> {
            for (int i = start; i <= end; i++) {
                if (collection instanceof java.util.List) {
                    ((java.util.List<Integer>) collection).add(i);
                }
                System.out.println("Added " + i + " to collection on thread " + Thread.currentThread().getName());
                try {
                    // Simulate processing time
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Task adding " + i + " was interrupted.");
                }
            }
        };
    }
}
