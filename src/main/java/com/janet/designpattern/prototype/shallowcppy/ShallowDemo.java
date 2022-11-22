package com.janet.designpattern.prototype.shallowcppy;

/**
 * @author Janet Li
 * @createTime 2022/11/22
 */
public class ShallowDemo {
    public static void main(String[] args) {
        Resume a = new Resume("Janet");
        a.setPersonInfo("女", "18");
        a.setWorkExperience("2001-2005", "XX公司");

        //只要调用clone方法就可以实现新简历的生成，并且可以更新简历的细节
        Resume b = (Resume) a.clone();
        b.setWorkExperience("2001-2008", "YY公司");

        Resume c = (Resume) a.clone();
        c.setPersonInfo("女", "24");

        a.display();
        System.out.println();
        b.display();
        System.out.println();
        c.display();

    }

}
