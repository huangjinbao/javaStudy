package cn.herman.domain;
/*
* 案例：
*   需求：写一个框架，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象以及使用任意类的方法
*   实现：
*       1.配置文件
*       2.反射
*   步骤：
*       1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
*       2.在程序中加载读取配置文件
*       3.使用反射技术来加载类文件进内存
*       4.创建对象
*       5.执行方法
*
*
* */
public class Student {
    public  void sleep(){
        System.out.println("睡觉");
    }
}
