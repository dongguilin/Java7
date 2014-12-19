package com.guilin.java7;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 菱形语法（泛型实例化类型自动推断）
 *
 * @author guilin
 */
public class GenericityTest {

    @Test
    public void testGenericity() {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);
    }

}
