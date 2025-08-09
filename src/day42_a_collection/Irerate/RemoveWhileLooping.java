package day42_a_collection.Irerate;

import java.util.*;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list1);

        // 1 - Remove with traditional loop > it will cause skipping some of the elements
        for (int i = 0; i < list1.size(); i++) {
            //System.out.println(list1.get(i));
            if (list1.get(i)< 6) {
                list1.remove(i);
            }
        }

        System.out.println(list1);
        /*
    elements: 2, 3, 5, 6, 12, 54, 23, 65, 3, 6      - size 10
    index:    0  1  2  3   4   5   6   7  8  9
    i=0
         elements: 3, 5, 6, 12, 54, 23, 65, 3, 6      - size 10
         index:    0  1  2  3   4   5   6   7  8  9

    i=1
         elements: 3, 5, 6, 12, 54, 23, 65, 3, 6      - size 9 ---> after removing all element SHIFTED to the left, causing missing
         index:    0  1  2  3   4   5   6   7  8  9
     */

        try {
            List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
            // 2 - remove with foreach loop
            for(Integer each : list2){ // when the loop starts my size is fixed to 10 > after removing our size is 9
                if (each< 6) { // since size changes forEach loop with throw exception > ConcurrentModificationException
                    list2.remove(each);
                }
            }
            System.out.println(list2);
        } catch (RuntimeException e) {
            System.out.println("There was a problem removing the list");
        }

        System.out.println("---------------------------------------------");
        // 3 - Third way > removeIf
        List<Integer> list3 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list3);
        list3.removeIf(each -> each < 6);
        System.out.println(list3);
        /*
        default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        final Iterator<E> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }
         */

        System.out.println("---------------------------------------------");
        // 4 - Iterator
        List<Integer> list4 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        Iterator<Integer> iterator = list4.iterator();
        System.out.println(list4);// to be able to use hasNext(), next(), remove() method we created this object
        while (iterator.hasNext()) {
            if (iterator.next() < 6) {
                iterator.remove();
            }
        }

        System.out.println(list4);

        /*
                               v
                                2, 3, 5, 6, 12, 54, 23, 65, 3, 6
                                3, 5, 6, 12, 54, 23, 65, 3, 6
                                5, 6, 12, 54, 23, 65, 3, 6
                            6, 12, 54, 23, 65, 3, 6
                        6, 12, 54, 23, 65, 3, 6
                    6, 12, 54, 23, 65, 3, 6
                6, 12, 54, 23, 65, 3, 6
             6, 12, 54, 23, 65, 3, 6
             6, 12, 54, 23, 65, 6

             and while loop ends
         */
    }

}
