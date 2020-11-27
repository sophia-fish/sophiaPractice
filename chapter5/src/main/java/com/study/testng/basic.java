package com.study.testng;

import org.testng.annotations.*;

public class basic {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是BeforeMethod在测试方法前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是AfterMethod测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是BeforeClass在类运行前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是AfterClass在类运行后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是AfterSuite测试套件");
    }



}
