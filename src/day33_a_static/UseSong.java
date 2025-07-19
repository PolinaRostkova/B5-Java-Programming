package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class UseSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka Waka");
        System.out.println(song1);

        Song song2 = new Song("Jingle Bells", 3.4);
        System.out.println(song2);

        Song song3 = new Song("Animals", 4.5, "Imminence", "Rock");
        System.out.println(song3);

        System.out.println("====================================================================");

        String str1 = "One";
        String str2 = new String("Two");

        String[] strArr = {str1, str2}; // str1 and str2 are non-primitive(String data type)
        // Array holds multiple Strings
        // Array can hold  non-primitive and primitive data type

        Song[] songArr = {song1, song2, song3}; // storing all song objects in Array
        System.out.println(Arrays.toString(songArr));

        // get me the first Song object from Song arr
        System.out.println(songArr[0]); // 1st array elements which is 1st song
        System.out.println("Num of songs: " + songArr.length);

        // give me all songs one by one loop through
        for (Song eachSong : songArr){

            System.out.println(eachSong);
        }

        // get me each song's name

        for (Song eachSong : songArr){
            System.out.println(eachSong.name);
        }

        System.out.println("-----------------------------");
        // get me each song which has length more than 4

        for (Song eachSong: songArr){
            if (eachSong.length > 4){
                System.out.println(eachSong);
            }
        }

        Song song4 = new Song("Apt", 3.5, "Bruno Mars", "Hip Hop");

        System.out.println("====================================================================");
        // ArrayList
        String word1 = "Hi";
        String word2 = "Bye";
        ArrayList<String> allWords = new ArrayList<>();
        allWords.add(word1);
        allWords.add(word2);
        System.out.println(allWords);

        System.out.println();
        ArrayList<Song> allSongs = new ArrayList<>();
        allSongs.addAll(Arrays.asList(song1, song2,song3,song4));
        System.out.println(allSongs);

        System.out.println();

        for (Song each : allSongs){
            System.out.println(each);
        }



    }
}
