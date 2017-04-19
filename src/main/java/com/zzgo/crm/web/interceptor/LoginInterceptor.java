package com.zzgo.crm.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;

/**
 * Created by ZzGo on 2017/4/12.
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        Object loginStaff = session.get("loginStaff");
        if(loginStaff == null) {
            Object action = actionInvocation.getAction();
            if(action instanceof ActionSupport) {
                ActionSupport actionSupport = (ActionSupport) action;
                actionSupport.addFieldError("","请登录");
            }
            return "login";
        }
        return actionInvocation.invoke();
    }
}
