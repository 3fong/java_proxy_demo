package com.liu;

/**
 * @author liulei
 * @Description
 * @create 2022/1/8 15:29
 */
public class RequestInfo {
    public RequestInfo(String apiName, Long responseTime, Long startTimestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }

    private String apiName;
    private Long responseTime;
    private Long startTimestamp;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "apiName='" + apiName + '\'' +
                ", responseTime='" + responseTime + '\'' +
                ", startTimestamp='" + startTimestamp + '\'' +
                '}';
    }
}
