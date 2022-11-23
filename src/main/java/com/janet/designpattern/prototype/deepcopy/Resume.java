package com.janet.designpattern.prototype.deepcopy;

import lombok.Data;

/**
 * 简历类
 *
 * @author Janet Li
 * @createTime 2022/11/22
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    //引用工作对象
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        //“简历”实例化时同时实例化“工作经历”
        work = new WorkExperience();
    }

    /**
     * 设置个人信息
     */
    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExperience(String workDate, String company) {
        //调用此方法时，给对象的两个属性赋值
        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    public void display() {
        System.out.println(name + ", " + sex + ", " + age);
        System.out.println("工作经历：" + work.getWorkDate() + " " + work.getCompany());
    }

    /**
     * 重写 clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        // work克隆
        clone.work = (WorkExperience) this.work.clone();

        return clone;

    }
}
