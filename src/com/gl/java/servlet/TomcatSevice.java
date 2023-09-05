package com.gl.java.servlet;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

/**
 * web 服务器开发团队
 */
public class TomcatSevice {

    public static void main(String[] args) throws Exception {
        // 接收用户请求，根据请求路径调用对应的 Servlet 来执行业务逻辑
        // 1. 接收用户请求
        String url = getUserInputUrl();
        // 2. 根据请求路径调用对应的 Servlet
        Servlet servlet = getServlet(url);
        // 3. 执行业务逻辑
        servlet.service();
    }

    private static String getUserInputUrl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入请求路径:");
        String url = scanner.nextLine();
        return url;
    }

    private static Servlet getServlet(String url) throws Exception {
        // 解析配置文件
        // 1. 解析配置文件
        FileReader reader = new FileReader("src\\com\\gl\\java\\servlet\\web.properties");
        // 2. 读取配置文件中的内容
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        String className = properties.getProperty(url);
        // 3. 根据请求路径获取对应的 Servlet 类名
        Class clazz = Class.forName(className);
        Object obj = clazz.newInstance();
        return (Servlet) obj;

    }
}
