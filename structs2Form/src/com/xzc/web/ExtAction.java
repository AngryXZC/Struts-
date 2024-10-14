package com.xzc.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author xzc
 * @date 2024/10/12 15 22:22
 * @description
 */
public class ExtAction extends ActionSupport {

    public String register() throws Exception {
       System.err.println("这是一个继承ActionSupport的Action");
       return null;
    }
    public String login() throws Exception {

        return null;
    }
}
