package day43_map.map_recap;

import java.util.*;

// runner class
public class Classroom {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 20, "ID#001");
        Student student2 = new Student("Jerry", 30, "ID#002");
        Student student3 = new Student("Winnie", 40, "ID#003");
        Student student4 = new Student("Pooh", 50, "ID#004");
        Student student5 = new Student("Zayec", 60, "ID#005");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for (Student student : studentList) {
            System.out.println(student);
        }

        /*
            KEY     Value
            1       Student1
            2       Student2
            3       Student3
            4       Student4
            5       Student5

         */

        System.out.println("---------------------------------------------------------------");
        Map<Integer, Student> studentMap = new LinkedHashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);
        studentMap.put(5, student5);

        System.out.println("---------------------------------------------------------------");
        // get me the student at the key 2
        System.out.println(studentMap.get(3));

        System.out.println("---------------------------------------------------------------");
        studentMap.put(3, new Student("Nupogodi", 45, "ID#020"));
        // KEYs cannot be duplicate when adding it checks if there is existing KEY and if yes update VALUE linked to that one, and if not ADD NEW pair
        studentMap.remove(3); // we removed 3 and in line 49 we substituted for other object. so now after removing we don't have 3 KEY at all
        System.out.println(studentMap.get(3)); // null --> no existing KEY anymore

        System.out.println(studentMap);
        System.out.println("---------------------------------------------------------------");
        System.out.println(studentMap.size());

        System.out.println("---------------------------------------------------------------");
        System.out.println(studentMap.containsKey("1")); // we don't have any String in our KEYs so false
        System.out.println(studentMap.containsKey(1)); // true
        System.out.println(studentMap.containsValue(student5)); // true, it is among the values

        System.out.println();
        System.out.println(studentMap.containsValue(new Student("Mick Mick", 55, "ID#060"))); // false, we don't have this object as a value

        System.out.println("---------------------------------------------------------------");

        List<String> group2 = new ArrayList<>(Arrays.asList("Nina", "Savlat", "Suidum"));
        List<String> group3 = new ArrayList<>(Arrays.asList("Polina", "Jane", "Veronika", "Asia"));
        System.out.println(group2);
        System.out.println(group3);

        // group2 as the KEY, list of group2
        // group3 as the KEY, list of group3

        System.out.println();
        Map<String, List<String>> loopcampGroups = new HashMap<>();
        loopcampGroups.put("group2", group2);
        loopcampGroups.put("group3", group3);
        System.out.println(loopcampGroups);

        // can you find me the names from group2 which contains 'n'
        for (String eachName : loopcampGroups.get("group2")){
            if (eachName.contains("n")){
                System.out.println(eachName);
            }
        }
    }
}
