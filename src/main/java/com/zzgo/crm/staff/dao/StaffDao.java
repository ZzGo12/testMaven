package com.zzgo.crm.staff.dao;

import com.zzgo.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by ZzGo on 2017/4/7.
 */
public interface StaffDao {
    CrmStaff find(String loginName, String loginPwd);
    List<CrmStaff> findAll();
}
