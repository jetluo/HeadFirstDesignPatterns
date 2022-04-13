package com.jetluo.patterns.observer.demo2.after;

/**
 * @ClassName Square
 * @Description 正方形
 * @Author jet
 * @Date 2022/4/4 23:27
 * @Version 1.0
 **/
public class Square implements Quadrilateral{
   private double side;

   public double getSide(){
       return  side;
   }
   public void setSide(){
       this.side = side;
   }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
