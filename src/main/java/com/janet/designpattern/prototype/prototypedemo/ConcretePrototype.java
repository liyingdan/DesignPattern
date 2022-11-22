package com.janet.designpattern.prototype.prototypedemo;

import lombok.Data;

/**
 * 创建当前对象的浅表副本。方法是创建一个新对象，然后将当前对象的非静态字段复制到该新对象。
 * 如果字段是值类型的，则对改字段执行逐位复制。如果字段是引用类型，则复制引用但不复制引用的对象；因此，原始对象及其副本引用同一个对象。
 * @author Janet Li
 * @createTime 2022/11/21
 */

@Data
public class ConcretePrototype implements Cloneable{
    private String id;

    public ConcretePrototype(String id){
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
