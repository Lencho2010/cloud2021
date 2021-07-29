package com.lencho.springcloud.filter;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Lencho
 * @create 2021-07-28 19:37
 */
public class TestData {

    /*public void test() throws MalformedURLException {
        URL url = new URL("http://www.baidu.com");
        HttpURLConnection conn = url.openConnection();
    }*/

    public void add(String str) {
        System.out.println("hello" + str);
    }
}
