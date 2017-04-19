package com.zzgo.crm.staff.service;

import com.zzgo.crm.staff.dao.StaffDao;
import com.zzgo.crm.staff.domain.CrmStaff;
import com.zzgo.crm.utils.MyStringUtils;

import java.util.List;

/**
 * Created by ZzGo on 2017/4/7.
 */
public class StaffServiceImpl implements StaffService{
    private StaffDao staffDao;

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    public CrmStaff login(CrmStaff crmStaff) {
        String loginPwd = MyStringUtils.getMD5Value(crmStaff.getLoginPwd());
        return staffDao.find(crmStaff.getLoginName(),loginPwd);
    }

    @Override
    public List<CrmStaff> findAllStaff() {
        return staffDao.findAll();
    }
}
