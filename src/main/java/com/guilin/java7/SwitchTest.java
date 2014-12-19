package com.guilin.java7;

import org.junit.Test;

/**
 * 字符串可以 switch
 *
 * @author guilin
 */
public class SwitchTest {

    /**
     * 编译器在编译时先做处理： ①case只有一种情况，直接转成if； ②如果只有一个case和default，则直接转换为if...else...；
     * ③有多个case，先将String转换为hashCode，然后对应的进行处理，JavaCode在底层兼容Java7以前版本。
     */
    @Test
    public void testSwitch() {
        String str = "hello";
        switch (str) {
            case "hehe":
                System.out.println("呵呵");
                break;
            case "hello":
                System.out.println("哈喽");
                break;
            case "xiaoming":
                System.out.println("小明");
                break;
            default:
                System.out.println("默认");
        }
    }
}
