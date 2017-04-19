package com.zzgo.crm.coursetype.domain;

import com.zzgo.crm.classes.domain.CrmClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZzGo on 2017/4/5.
 */
public class CrmCourseType {
    private String courseTypeId;
    private String courseCost;
    private String total;
    private String courseName;
    private String remark;
    private Set<CrmClasses> crmClasses = new HashSet<CrmClasses>();

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(String courseCost) {
        this.courseCost = courseCost;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Set<CrmClasses> getCrmClasses() {
        return crmClasses;
    }

    public void setCrmClasses(Set<CrmClasses> crmClasses) {
        this.crmClasses = crmClasses;
    }
}
