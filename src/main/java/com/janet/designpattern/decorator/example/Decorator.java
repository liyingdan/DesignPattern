package com.janet.designpattern.decorator.example;

/**
 * @Description 装饰类
 * @Author Janet
 * @Date 2022-11-16
 */
public class Decorator implements CameraInterface {
    private CameraInterface camera;

    public Decorator(CameraInterface camera) {
        this.camera = camera;
    }

    @Override
    public void takePicture() {
        camera.takePicture();
    }

    @Override
    public void takeVideo() {
        camera.takeVideo();
    }

    public void flash(){
        System.out.println("开闪光灯~");
    }

}
