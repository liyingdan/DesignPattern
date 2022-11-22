package com.janet.designpattern.factory.factorymethod;

import com.janet.designpattern.factory.simplefactory.Operation;
import com.janet.designpattern.factory.simplefactory.oper.impl.OperationAdd;

/**
 * 加法类工厂
 * @author Janet Li
 * @createTime 2022/11/18
 */
public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
