package com.jetluo.patterns.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName ProxyFactory
 * @Description 代理对象工厂
 * @Author jet
 * @Date 2022/5/6 22:28
 * @Version 1.0
 **/
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        //1.创建Enhancer 对象，类似于JDK代理中的proxy类
        Enhancer enhance = new Enhancer();
        //2.设置父类的字节码对象
        enhance.setSuperclass(TrainStation.class);
        //3.设置回调函数
        enhance.setCallback(this);
        //4.创建代理对象
        TrainStation proxyObject = (TrainStation) enhance.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取手续费CGLIB代理");
        // 调用方法
        Object obj = method.invoke(trainStation, objects);

        return obj;
    }
}
