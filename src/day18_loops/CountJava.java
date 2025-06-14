package day18_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "sdfsijavafjdsfojjavafjdkdjavajfjdjava";
        int javaWords = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String each4Letters = str.substring(i,i+4);

            if (each4Letters.equalsIgnoreCase("java")){
                javaWords++;
            }
        }
        System.out.println("Java words count: " + javaWords);
    }
}
