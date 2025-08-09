package day42_b_map.HashMapObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapObject {
    public static void main(String[] args) {
        // MAP - it works with KEY and VALUE pair - aka ENTRY

        // List sample
        List<String> list = new ArrayList<String>();

        // Map sample
        //    KEY       VALUE
        Map<Integer, String > map = new HashMap<>();
        // .add(elem) --> put(elem1, elem2)
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(0, "Zero");
        map.put(-1, "MinusOne");
        map.put(2, "SecondTwo");
        map.put(20, "SecondTwo");
        map.put(null, "null");
        map.put(30, null);
        map.put(null, null);
        map.put(1, "ONE");
        System.out.println(map);

        // {0=Zero, -1=MinusOne, null=null, 1=One, 2=SecondTwo, 3=Three, 4=Four, 20=SecondTwo, 30=null}
        /*
            MAP:
                - Random Order (order is based on the KEYs)
                - for the KEY null is accepted
                - for KEY does NOT allow duplicates
                    - if you add the duplicates KEYs then it will update the value for the last value this KEY has
                - for VALUES allows duplicates
         */

        System.out.println("--------------------------");
        // how do we get or retrieve elements from Map
        //map.get(KEY)
        //map.get("1") | not valid because all the keys are Integers
        System.out.println(map.get(1));
        System.out.println(map.get(null));

        System.out.println(map.size()); // how many value pair i have / how many entries i have

        System.out.println("--------------------------");
        // how can i remove
        map.remove(1);
        System.out.println(map);
        map.remove(9999); // if NO matching KEY to remove no changes will happen
        System.out.println(map);

        System.out.println("--------------------------");
        // How to check if specific KEY exist among all the KEYS
        System.out.println(map.containsKey("1")); // since datatype does not match it returns false
        System.out.println(map.containsKey(1)); // since it was removed it returns false
        System.out.println(map.containsKey(2)); // since we have this KEY it returns true

        System.out.println("--------------------------");
        // How to check if the specific value exist among all the values
        System.out.println(map.containsValue(null)); // true
        System.out.println(map.containsValue("ONE")); // false because it was removed
        System.out.println(map.containsValue("Three")); // true we have this value
        System.out.println(map.containsValue("THree")); // we need exact match for this to be true and it is not an exact match

        System.out.println("--------------------------");
        Map<String, String> cartoonCharacters = new HashMap<>();
        // for the keys i want to have the first names and for the vlaues i want to have last names
        // KEY --> First name
        // Value -> Last name
        cartoonCharacters.put("Tom", "Jerry");
        cartoonCharacters.put("Winnie", "Pooh");
        System.out.println(cartoonCharacters);

        System.out.println("--------------------------");
        Map<String, String> movieStars = new HashMap<>();
        movieStars.put("James", "Bond");
        movieStars.put("John", "Doe");
        movieStars.put("Harry", "Potter");
        System.out.println(movieStars);

        System.out.println("--------------------------");
        Map<String, Map<String, String>> allGroups = new HashMap<>();
        allGroups.put("Cartoon Characters", cartoonCharacters);
        allGroups.put("Movie Stars", movieStars);
        System.out.println(allGroups);
        System.out.println(cartoonCharacters);
        System.out.println(movieStars);

        System.out.println("--------------------------");
        // Q: get me the cartoon characters
        allGroups.get("Cartoon Characters"); // returns Map <String, String>
        allGroups.get("Movie Stars"); // returns Map <String, String>

        System.out.println("--------------------------");
        // Q: get me the last name for Tom inside Movie Stars KEY inside the allGroups
        System.out.println(allGroups.get("Movie Stars").get("James")); // {James=Bond, Harry=Potter, John=Doe}

    }
}
