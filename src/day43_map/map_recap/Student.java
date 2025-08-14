package day43_map.map_recap;
// custom class
public class Student {
    String name;
    int age;
    String id;


    // once there is constructor there is no default constructor anymore
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{\t" +
                "name='" + name + '\'' +
                ", \tage=" + age +
                ", \tid='" + id + '\'' +
                '}';
    }
}
