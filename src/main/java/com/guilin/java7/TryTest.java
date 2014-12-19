package com.guilin.java7;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * try子句中可以管理多个资源
 *
 * @author guilin
 */
public class TryTest {

    @Test
    public void testTry() {
        String fromPath = "d:/config.xml";
        String toPath = "d:/test.xml";
        try (InputStream input = new FileInputStream(fromPath);
             OutputStream output = new FileOutputStream(toPath)) {
            byte[] buffer = new byte[8192];
            int len = -1;
            while ((len = input.read(buffer)) != -1) {
                output.write(buffer, 0, len);
            }
        } catch (Exception ex) {

        }
    }

}
