package com.zzgo.crm.staff.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import com.zzgo.crm.staff.domain.CrmStaff;
import com.zzgo.crm.staff.service.StaffService;

import java.util.List;

/**
 * Created by ZzGo on 2017/4/12.
 */
public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
    private CrmStaff crmStaff = new CrmStaff();
    public CrmStaff getModel() {
        return crmStaff;
    }
    private StaffService staffService;

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }

    /**
     * 登录
     * @return
     */
    public String login() {
        CrmStaff findStaff = staffService.login(crmStaff);
        if(findStaff != null) {
            ActionContext.getContext().getSession().put("loginStaff",findStaff);
            return SUCCESS;
        }
        this.addFieldError("","用户名与密码不匹配");
        return "login";
    }

    /**
     * 前往首页
     * @return
     */
    public String goHome() {
        return "home";
    }

    /**
     * 查询所有
     * @return
     */
    public String findAll() {
        List<CrmStaff> allStaff = staffService.findAllStaff();
        ActionContext.getContext().put("allStaff",allStaff);
        return "findAll";
    }
}
