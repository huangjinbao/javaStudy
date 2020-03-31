package cn.herman.demo;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* 定义框架类
*
* */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建poperties对象
        Properties pro = new Properties();
        //1.2加载配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //1.3获取类名和方法名
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //2.通过配置信息获取class,obj
        Class aClass = Class.forName(className);
        Object obj = aClass.newInstance();

        //3.通过class获取方法
        Method method = aClass.getMethod(methodName);

        //4.执行方法
        method.invoke(obj);


    }
}
