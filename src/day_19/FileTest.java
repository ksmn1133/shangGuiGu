package day_19;

import org.junit.Test;

import java.io.File;

/**
 * @author xiaoxia
 * @create 2021/1/13 1:10 下午
 */
public class FileTest {
    @Test
    public void testFile(){
        File file = new File("123.txt");
        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        System.out.println("=========================");
        System.out.println(file.length());
        System.out.println("this is my first time use vcs in idea");
    }
}
