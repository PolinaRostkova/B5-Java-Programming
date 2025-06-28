package day24_methods;

public class OurArrayClass {
    public static void arrayFirstLetter(String[] arr) {
        System.out.println("First element in array: " + arr[0]);
    }

    public static void arrayLastLetter(String[] arr){
        System.out.println("First element in array: " + arr[arr.length-1]);
    }

    public static void arrMiddle(String[] arr){

        if (arr.length % 2 == 0){ // check if even num of elements
            System.out.println(arr[arr.length / 2 - 1]);
            System.out.println(arr[arr.length / 2]);
        } else {
            System.out.println(arr[arr.length / 2]);
        }

    }

    public static void main(String[] args) {
        String[] strArr = {"java", "selenium", "API", "db", "jira", "aws"};
        arrayFirstLetter(strArr);
       arrayLastLetter(strArr);

       arrMiddle(strArr);
    }
}
