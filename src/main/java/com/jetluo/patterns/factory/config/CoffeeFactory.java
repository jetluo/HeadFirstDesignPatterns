package com.jetluo.patterns.factory.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName CoffeeFactory
 * @Description 简单工厂模式
 * @Author jet
 * @Date 2022/4/11 23:48
 * @Version 1.0
 **/
public class CoffeeFactory {
    private static Map<String,Coffee> map=new HashMap<String,Coffee>();

    static {
        Properties properties = new Properties();

        // 读取配置文件
        InputStream inputStream = Coffee.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);

            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
               String className =  properties.getProperty((String) key);
               Class clazz = Class.forName(className);
               Coffee coffee= (Coffee) clazz.newInstance();
               map.put((String)key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
