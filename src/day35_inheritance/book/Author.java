package day35_inheritance.book;

import my_util.StringUtil;

// custom class
public class Author {
    private String name;
    private int age;
    //String nationality;

    public Author(String name, int age) {
       setName(name);
        setAge(age);
    }

    public void setName(String name){
        name = name.trim();
        if (name.contains(" ")){
            this.name = StringUtil.fixFormatForFullName(name);
        }
    }

    public void setAge(int age){
        if (age > 3 ){
            this.age = age;
        }
    }

    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
