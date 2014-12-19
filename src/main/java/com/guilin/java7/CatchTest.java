package com.guilin.java7;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: guilin
 * Date: 14-4-3
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public class CatchTest {
    @Test
    public void testCatch() {
        try {
            int a = 1 / 0;
            Class.forName("com.guilin.test.java7.CatchTest");
        } catch (ArithmeticException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
