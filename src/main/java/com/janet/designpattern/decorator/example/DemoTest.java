package com.janet.designpattern.decorator.example;

/**
 * @Description 客户端代码
 * @Author Janet
 * @Date 2022-11-16
 */
public class DemoTest {
    public static void main(String[] args) {
        Decorator newCanonCamera = new Decorator(new CanonCamera());
        newCanonCamera.takePicture();
        newCanonCamera.takeVideo();
        newCanonCamera.flash();
    }
}
