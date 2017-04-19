package com.zzgo.crm.post.domain;

import com.zzgo.crm.department.domain.CrmDepartment;
import com.zzgo.crm.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZzGo on 2017/4/5.
 */
public class CrmPost {
    private String postId;
    private String postName;
    private CrmDepartment crmDepartment;
    private Set<CrmStaff> staffSet = new HashSet<CrmStaff>();

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public CrmDepartment getCrmDepartment() {
        return crmDepartment;
    }

    public void setCrmDepartment(CrmDepartment crmDepartment) {
        this.crmDepartment = crmDepartment;
    }

    public Set<CrmStaff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<CrmStaff> staffSet) {
        this.staffSet = staffSet;
    }
}
