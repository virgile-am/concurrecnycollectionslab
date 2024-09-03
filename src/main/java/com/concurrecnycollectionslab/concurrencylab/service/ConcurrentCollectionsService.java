package com.concurrecnycollectionslab.concurrencylab.service;

import com.concurrecnycollectionslab.concurrencylab.util.TaskUtil;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ConcurrentCollectionsService {

    public void useConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task1 = TaskUtil.createCollectionTask(map.values(), 1, 5);
        Runnable task2 = TaskUtil.createCollectionTask(map.values(), 6, 10);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final map: " + map);
    }

    public void useCopyOnWriteArrayList() {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        Runnable task1 = TaskUtil.createCollectionTask(list, 1, 5);
        Runnable task2 = TaskUtil.createCollectionTask(list, 6, 10);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final list: " + list);
    }
}
