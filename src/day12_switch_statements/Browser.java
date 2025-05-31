package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your browser name: ");
        String browserName = keyboard.nextLine();

        System.out.print("Which web page you want to navigate: ");
        String webPageURL = keyboard.next();

//        System.out.println("Browser: " + browserName);
//        System.out.println("Webpage: " + webPageURL);

        //Opening $webPageURL in $browser

        switch (browserName){
            case "Chrome":
                System.out.println("Opening " + webPageURL + " in " + browserName);
                //break;
            case "Safari":
                System.out.println("Opening " + webPageURL + " in " + browserName);
        }

    }
}
