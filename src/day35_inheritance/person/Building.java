package day35_inheritance.person;

public class Building {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tom";
        person.age = 12;
        person.talk();
        // parent does not have access to the child info

        System.out.println("----------------");

        Student student = new Student();
        student.name = "Jerry";
        student.age = 15;
        student.hasUniform = true;
        student.talk();
        student.wears();

        System.out.println("----------------");

        InPersonStudent ips1 = new InPersonStudent();
        ips1.name = "James";
        ips1.age = 11;
        ips1.hasUniform = true;
        ips1.talk();
        ips1.wears();
        ips1.schoolBus();

        System.out.println("----------------");

        OnlineStudent os1 = new OnlineStudent();
        os1.name = "Winnie";
        os1.age = 13;
        os1.hasUniform = false;
        os1.talk();
        os1.wears();
        os1.joinZoom();
    }
}
