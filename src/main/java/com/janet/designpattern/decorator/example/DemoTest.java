package com.janet.designpattern.decorator.example;

/**
 * @Description 客户端代码
 * @Author Janet
 * @Date 2022-11-16
 */
public class DemoTest {
    public static void main(String[] args) {

        System.out.println("原相机-----------");
        CanonCamera canonCamera = new CanonCamera();
        canonCamera.takePicture();
        canonCamera.takeVideo();

        System.out.println();

        System.out.println("加了闪光灯的相机-----------");
        FlashDecorator flashDecorator = new FlashDecorator(canonCamera);
        flashDecorator.takePicture();
        flashDecorator.takeVideo();


        System.out.println();

        System.out.println("加了闪光灯和三脚架的相机-----------");
        TripodDecorator tripodDecorator = new TripodDecorator(flashDecorator);
        tripodDecorator.takePicture();
        tripodDecorator.takeVideo();

    }
}
