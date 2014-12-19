package com.guilin.java7;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.net.URL;

/**
 * 动态资源管理
 *
 * @author guilin
 */
public class AutoCloseTest {

    /**
     * Java7之前需要在finally中关闭socket、文件、数据库连接等资源；
     * Java7中在try语句中申请资源，实现资源的自动释放（资源类必须实现java
     * .lang.AutoCloseable接口，一般的文件、数据库连接等均已实现该接口，close方法将被自动调用）
     *
     * @throws IOException
     */
    @Test
    public void testAutoClose() {
        BufferedReader bufferedReader = null;
        try {
            String path = this.getClass().getResource("/AutoCloseTest_testAutoClose.txt").getPath();
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(
                    file));
            StringBuilder builder = new StringBuilder();
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
                builder.append(String.format("%n"));
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedReader.close();
            System.out.println(bufferedReader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO没有自动关闭，不明白
    @Test
    public void testWrite() throws Exception {
        File file = null;
        try {
            String path = this.getClass().getResource("/").getPath();
            file = new File(path + "AutoCloseTest_testWrite.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("file:" + file.getAbsolutePath());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("AutoCloseTest_testWrite");
//            writer.close();
        } finally {
//            Assert.assertEquals(23,file.length());
        }
    }

}
