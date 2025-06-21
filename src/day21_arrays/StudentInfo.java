package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String[] student1 = {"IDB#5S#1", "Tom", "Jerry", "B#5"};
        System.out.println(Arrays.toString(student1));


        System.out.println("------------------------------------");

        String[] student2 = new String[4]; // for now it is empty so [null, null, null, null]
        // "ID#B#5S#2", "Winnie", "Pooh", "B#5"
        student2[0] = "ID#B#5S#2";
        student2[1] = "Winnie";
        student2[2] = "Pooh";
        student2[3] = "B#5";
        String str = Arrays.toString(student2);
        System.out.println(str);

        System.out.println("------------------------------------");

        // give me the first name of the second student
        System.out.println(student2[1]);
        System.out.println("------------------------------------");
//
//        String[] student3 = new String[4];
//        System.out.print("Enter your ID: ");
//        //String userID = key.nextLine();
//        student3[0] = key.nextLine();
//        System.out.print("Enter first name: ");
//        student3[1] = key.nextLine();
//        System.out.print("Enter last name: ");
//        student3[2] = key.nextLine();
//        System.out.println("Enter your Batch Number: ");
//        student3[3] = key.nextLine();
//
//        System.out.println(Arrays.toString(student3));
//
        System.out.println("***************************************");
        String[] questions = {"Enter your ID: ", "Enter first name: ", "Enter last name: ", "Enter your Batch Number: "};
//
//        String[] student4 = new String[4];
//        System.out.print(questions[0]);
//        //String userID = key.nextLine();
//        student4[0] = key.nextLine();
//        System.out.print(questions[1]);
//        student4[1] = key.nextLine();
//        System.out.print(questions[2]);
//        student4[2] = key.nextLine();
//        System.out.print(questions[3]);
//        student4[3] = key.nextLine();
//
//        System.out.println(Arrays.toString(student4));
        System.out.println("***************************************");

        String[] student5 = new String[4];
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            student5[i] = key.nextLine();
        }
        System.out.println(Arrays.toString(student5));
    }
}
