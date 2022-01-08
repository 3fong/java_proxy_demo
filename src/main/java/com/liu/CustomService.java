package com.liu;

/**
 * @author liulei
 * @Description
 * @create 2022/1/8 15:27
 */
public class CustomService implements Service {
    @Override
    public void say(String msg) {
        System.out.println("say: "+msg);
    }
}
