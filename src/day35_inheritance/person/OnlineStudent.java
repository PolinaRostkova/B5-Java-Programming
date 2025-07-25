package day35_inheritance.person;
// OnlineStudent IS-A Student
public class OnlineStudent extends Student {
    public void joinZoom(){
        System.out.println(name + " is joining Zoom meeting.");
    }
}
