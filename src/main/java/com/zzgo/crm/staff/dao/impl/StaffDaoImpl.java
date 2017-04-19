package com.zzgo.crm.staff.dao.impl;

import com.zzgo.crm.staff.dao.StaffDao;
import com.zzgo.crm.staff.domain.CrmStaff;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by ZzGo on 2017/4/7.
 */
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {
    public CrmStaff find(String loginName, String loginPwd) {
        List<CrmStaff> list = this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd = ?", loginName, loginPwd);
        if(list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CrmStaff> findAll() {
        return this.getHibernateTemplate().find("from CrmStaff ");
    }
}
