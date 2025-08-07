package day40_exception.pereson;
// custom class
public class Person {
   private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // make sure it is not empty("") or bot blank ("    ")
        if (name.isEmpty() || name.isBlank()) {
            //System.out.println("Invalid Input");
            throw new RuntimeException("Invalid name input"); // manually causing an exception / RunTimeException specifically
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 100) {
            throw new Exception("Invalid age input");
        } else {
            this.age = age;
        }
    }
}
