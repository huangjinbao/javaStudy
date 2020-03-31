package cn.herman.junit;


import cn.herman.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo {

    @Before
    public void init() {
        System.out.println("init...");
    }
    @Test
    public void test01(){
        Student s = new Student();
        s.sleep();
    }


    @After
    public void close(){
        System.out.println("close...");
    }
}
