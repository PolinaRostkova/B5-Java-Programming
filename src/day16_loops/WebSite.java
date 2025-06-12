package day16_loops;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

/*Task

ask the user to enter a url
find and print the website from the url

assume your url always starts with www.
assume your url always ends with .com

www.google.com

        --> google
 */
public class WebSite {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String url = key.next();

        if (!url.startsWith("www.") || !url.endsWith(".com")){
            System.out.println("Not valid URL");
        } else {
            System.out.println(url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")));
        }
    }
}
