package user.com.mydagger2demo;

import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * 1.类的用途
 * 2.@author:zhaoxinjun
 * 3.@  2016/12/21.
 */

public class Person {

    private String name;
    private int age;
    public Gson gson;


    public Person(){
        name="张三";
        age=22;
    }

    @Inject
    public Person(String name,int age,Gson gson){
        this.name=name;
        this.age=age;
        this.gson = gson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
