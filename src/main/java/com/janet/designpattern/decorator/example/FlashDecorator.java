package com.janet.designpattern.decorator.example;

/**
 * 闪光灯的具体装饰类
 * @author Janet Li
 * @createTime 2022/11/23
 */
public class FlashDecorator extends CameraDecorator {
    public FlashDecorator(CameraInterface camera) {
        super(camera);
    }

    //需要先实现相机原本的接口，这样该装饰类才会有相机原本的功能
    @Override
    public void takePicture() {
        flash();
        super.takePicture();
    }

    @Override
    public void takeVideo() {
        super.takeVideo();
    }

    /**
     * 新增的本类的私有方法
     */
    private void flash(){
        System.out.println("开闪光灯~");
    }
}
