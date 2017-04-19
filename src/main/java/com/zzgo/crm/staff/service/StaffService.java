package com.zzgo.crm.staff.service;

import com.zzgo.crm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by ZzGo on 2017/4/7.
 */
public interface StaffService {
    CrmStaff login(CrmStaff crmStaff);
    List<CrmStaff> findAllStaff();
}
