package com.study.testng;

import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1开始执行啦！");
    }

    @Test(enabled=false)
    public void ignore2(){
        System.out.println("ignore2开始执行啦！");
    }

    @Test(enabled=true)
    public void ignore3(){
        System.out.println("ignore3开始执行啦！");
    }
}
