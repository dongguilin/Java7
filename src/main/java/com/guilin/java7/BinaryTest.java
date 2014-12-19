package com.guilin.java7;

import org.junit.Test;

/**
 * 支持二进制语法和单位级别的数字表示方式
 *
 * @author guilin
 */
public class BinaryTest {

    /**
     * Java7前支持十进制（123）、八进制（0123）、十六进制（0X12AB）
     * Java7增加二进制表示（0B11110001、0b11110001）, 数字中可添加分隔符,
     * 下划线只能在数字中间，编译时编译器自动删除数字中的下划线
     */
    @Test
    public void testBinary() {
        // java7前
        int a = 012;// 10
        int b = 0x21;// 33;
        System.out.println(a + "," + b);
        // java7
        // 32位的整形的二进制表示方法
        int c = 0B10100001010001011010000101000101; // 最高位为1 负数
        // 64位的long型也是一样，不过就要注意后边的字母后缀L了
        long d = 0b1010000101000101101000010100010110100001010001011010000101000101L;
        System.out.println(c + "," + d);
        int e = 123_456_7;
        int f = 0b11_00_10_111_0;
        System.out.println(e + "," + f);

        // 8位byte
        byte aByte = (byte) 0b00100001;
        // 16位short
        short aShort = (short) 0b1010000101000101;
        // 32位int
        int anInt1 = 0b10100001010001011010000101000101;
        System.out.println(aByte + "," + aShort + "," + anInt1);

    }
}
