package day44_map_and_functions.functional_interface;
/*
        <E>, <T>, <> ---> generic type (can accept any type of data)
 */
@FunctionalInterface
public interface DynemicFunctionalInterface<T> {
    void test(T t);
}
