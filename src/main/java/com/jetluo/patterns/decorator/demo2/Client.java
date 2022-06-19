package com.jetluo.patterns.decorator.demo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Client
 * @Description TODO
 * @Author jet
 * @Date 2022/6/2 16:40
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try{
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/jet/Downloads/abc.txt")));
            while ((c = in.read())>= 0){
                System.out.print((char) c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (in !=null){
                in.close();
            }
        }

    }
}
