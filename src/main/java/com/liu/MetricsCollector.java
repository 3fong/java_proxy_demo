package com.liu;

/**
 * @author liulei
 * @Description
 * @create 2022/1/8 15:27
 */
public class MetricsCollector {
    public void recordRequest(RequestInfo requestInfo) {
        System.out.println(requestInfo.toString());
    }
}
