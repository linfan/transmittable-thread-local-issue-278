package com.alibaba.demo.cases;

import java.util.concurrent.CompletableFuture;

public class TestService {

    public int test1(int a) {
        CompletableFuture<Integer> testFuture = CompletableFuture.supplyAsync(() -> test2(a));
        return testFuture.join();
    }

    private int test2(int a) {
        return a;
    }
}
