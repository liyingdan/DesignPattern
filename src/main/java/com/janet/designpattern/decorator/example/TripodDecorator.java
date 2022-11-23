package com.janet.designpattern.decorator.example;

/**
 * 三脚架装饰类
 * @author Janet Li
 * @createTime 2022/11/23
 */
public class TripodDecorator extends CameraDecorator {

    public TripodDecorator(CameraInterface camera) {
        super(camera);
    }

    @Override
    public void takePicture() {
        tripod();
        super.takePicture();
    }

    @Override
    public void takeVideo() {
        super.takeVideo();
    }

    /**
     * 新增的本类的私有方法
     */
    private void tripod(){
        System.out.println("架三脚架");
    }
}