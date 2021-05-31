package com.alibaba.demo.cases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServiceTest {

    private TestService testService = new TestService();

    @Test
    public void case1() {
        assertEquals(1, testService.test1(1));
    }

    @Test
    public void case2() {
        assertEquals(2, testService.test1(2));
    }
}
