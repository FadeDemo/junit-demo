package org.fade.demo.junitdemo.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledClassTest {

    @Test
    public void testMethodA() {
        System.out.println("A ......");
    }

    @Test
    public void testMethodB() {
        System.out.println("B ......");
    }

    @Test
    public void testMethodC() {
        throw new RuntimeException("C ......");
    }

}
