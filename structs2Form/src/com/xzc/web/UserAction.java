package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzc.domain.User;
import com.xzc.service.UserSerivce;
import org.apache.struts2.ServletActionContext;


/**
 * @author xzc
 * @date 2024/10/10 15 25:31
 * @description
 */
public class UserAction extends ActionSupport  implements ModelDriven<User> {
    public User user = new User();

    public String login() throws Exception {
        System.out.println("我被执行了");
        System.out.println(user.getUsername());
        UserSerivce userSerivce = new UserSerivce();
        System.out.println("session域"+ActionContext.getContext().getSession().get("mysession"));
        System.out.println("application域"+ActionContext.getContext().getApplication().get("myapplication"));
        boolean success = userSerivce.findUser(user);
        if(success){
            ActionContext.getContext().getSession().put("user",user);
            return SUCCESS;
        }
        else {
            ActionContext.getContext().put("error","用户名或密码错误!!!");
            return ERROR;
        }
    }

    public String register() throws Exception {
        System.err.println("register方法被执行了");
        return null;
    }


    @Override
    public User getModel() {
        return user;
    }
}
