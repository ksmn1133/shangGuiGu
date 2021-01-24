package day_17.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xiaoxia
 * @create 2021/1/2 1:23 下午
 */
public class Jdbc {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("password.properties");
        Properties properties = new Properties();
        //加载对应流文件
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");

    }
}
