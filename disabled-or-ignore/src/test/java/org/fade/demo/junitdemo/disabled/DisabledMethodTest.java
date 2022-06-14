package org.fade.demo.junitdemo.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMethodTest {

    @Test
    public void testMethodA() {
        System.out.println("A ......");
    }

    @Test
    @Disabled
    public void testMethodB() {
        throw new RuntimeException("B ......");
    }

}
