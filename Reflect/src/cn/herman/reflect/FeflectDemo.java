package cn.herman.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FeflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class a = Class.forName("cn.herman.domain.Person");
        Field[] fields = a.getDeclaredFields();
        Method[] methods = a.getMethods();
        Constructor constructors = a.getConstructor(String.class ,int.class);

        Object instance = constructors.newInstance("张三", 22);
        System.out.println(instance);
        for (Method method : methods) {
            String name = method.getName();

            System.out.println(name);
        }
        System.out.println("------------");
        Method method = a.getMethod("eat",String.class);
        method.invoke(instance,"adsfa");
        for (Field field : fields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            Object o = field.get(instance);
            o.toString();
        }





    }
}
