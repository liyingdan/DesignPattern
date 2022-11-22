package com.janet.designpattern.decorator.example;

/**
 * @Description 佳能相机实现类
 * @Author Janet
 * @Date 2022-11-16
 */
public class CanonCamera implements CameraInterface {
    @Override
    public void takePicture() {
        System.out.println("佳能相机拍照");
    }

    @Override
    public void takeVideo() {
        System.out.println("佳能相机录视频");
    }
}
