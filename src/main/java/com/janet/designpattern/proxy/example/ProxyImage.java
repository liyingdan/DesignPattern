package com.janet.designpattern.proxy.example;

/**
 * @Description TODO
 * @Author Janet
 * @Date 2022-11-23
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
