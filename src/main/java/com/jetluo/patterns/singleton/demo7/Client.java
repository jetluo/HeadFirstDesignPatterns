package com.jetluo.patterns.singleton.demo7;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName Client
 * @Description
 *   反射破坏单例模式
 * @Author jet
 * @Date 2022/4/13 23:13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) throws Exception {
        writeObject2File();

        readObjectFromFile();
        readObjectFromFile();

    }
    public static void readObjectFromFile() throws  Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/jet/Downloads/Client.java"));
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }

    public static void writeObject2File() throws Exception{
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/jet/Downloads/Client.java"));

        oos.writeObject(instance);

        oos.close();
    }

}
