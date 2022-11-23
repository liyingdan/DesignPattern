package com.janet.designpattern.prototype.deepcopy;

import lombok.Data;

/**
 * 工作经历类
 *
 * @author Janet Li
 * @createTime 2022/11/23
 */
@Data
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
