package com.janet.designpattern.factory.factorymethod;

import com.janet.designpattern.factory.simplefactory.Operation;

/**
 * 工厂接口
 * @author Janet Li
 * @createTime 2022/11/18
 */
public interface IFactory {
    Operation createOperation();
}