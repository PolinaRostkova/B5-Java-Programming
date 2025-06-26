package day22_arrays;

public class LongestString {
    public static void main(String[] args) {
        String[] words = {"java", "softskills", "selenium"};
        String longest = words[0];
        String shortest = words[0];

        for (String eachElem: words){
            if (eachElem.length() > longest.length()){
                longest = eachElem;
            }

            if (eachElem.length() > shortest.length()){
                shortest = eachElem;
            }
        }
    }
}
