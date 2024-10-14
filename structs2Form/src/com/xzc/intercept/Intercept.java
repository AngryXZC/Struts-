package com.xzc.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author xzc
 * @date 2024/10/15 01 25:28
 * @description
 */
//第二种创建拦截器的方法
public class Intercept implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //放行方法
        return actionInvocation.invoke();
    }
}
