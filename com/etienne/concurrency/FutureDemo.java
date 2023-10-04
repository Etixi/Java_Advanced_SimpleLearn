package com.etienne.concurrency;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Task still in progress ... wait");
                Thread.sleep(500);
            }
            System.out.println("Task Completed");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);

            executorService.shutdown();
        }
        catch (InterruptedException | ExecutionException | TimeoutException e){
            future.cancel(true);
            future.isDone();
            future.isCancelled();
        }
    }
}
