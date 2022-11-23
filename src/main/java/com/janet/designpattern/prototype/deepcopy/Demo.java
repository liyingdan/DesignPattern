package com.janet.designpattern.prototype.deepcopy;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-11-22
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("Janet001");
        a.setPersonInfo("女","18");
        a.setWorkExperience("2001-2005", "XX公司");

        //只要调用clone方法就可以实现新简历的生成，并且可以更新简历的细节
        Resume b = (Resume) a.clone();
        b.setWorkExperience("2001-2008", "YY公司");

        Resume c = (Resume) a.clone();
        c.setPersonInfo("女", "24");
        c.setWorkExperience("2001-2010", "ZZ企业");

        a.display();
        System.out.println();
        b.display();
        System.out.println();
        c.display();

    }
}
