package com.janet.designpattern.proxy.example;

/**
 * @Description RealImage 实体类，实现Image接口
 * @Author Janet
 * @Date 2022-11-23
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        //实例化的时候加载图片
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
