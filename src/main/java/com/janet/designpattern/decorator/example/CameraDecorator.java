package com.janet.designpattern.decorator.example;

/**
 * @Description 相机装饰类，实现相机的抽象接口，从而扩展现有相机的功能
 * @Author Janet
 * @Date 2022-11-16
 */
public abstract class CameraDecorator implements CameraInterface {
    private CameraInterface camera;

    public CameraDecorator(CameraInterface camera) {
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

}
