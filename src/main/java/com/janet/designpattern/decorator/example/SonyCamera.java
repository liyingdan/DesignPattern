package com.janet.designpattern.decorator.example;

/**
 * @Description 索尼相机实现类
 * @Author Janet
 * @Date 2022-11-16
 */
public class SonyCamera implements CameraInterface {
    @Override
    public void takePicture() {
        System.out.println("索尼相机拍照");
    }

    @Override
    public void takeVideo() {
        System.out.println("索尼相机录视频");
    }
}
