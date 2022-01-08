package com.liu;

/**
 * @author liulei
 * @Description
 * @create 2022/1/8 15:30
 */
public class Application {

    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        Service customService = (Service)proxy.createProxy(new CustomService());
        customService.say("hello");
    }
}
