package com.xzc.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import java.util.Map;

/**
 * @author xzc
 * @date 2024/10/12 15 18:09
 * @description
 */
public class ImplAction  implements Action
{
    @Override
    public String execute() throws Exception {
        System.err.println("这是一个实现Action接口的Action");
        return "default";
    }
    public String login() throws Exception {
        //得到原生的request对象
        ServletActionContext.getRequest().setAttribute("username","123");
        ServletActionContext.getRequest().setAttribute("password","123");
        ActionContext.getContext().put("username","123");
        ActionContext.getContext().put("password","123");
        Map<String,Object> session = ActionContext.getContext().getSession();
        session.put("mysession","这是session域");
        Map<String,Object> application = ActionContext.getContext().getApplication();
        application.put("myapplication","这是application与");
        return "toLogin";
    }
}
