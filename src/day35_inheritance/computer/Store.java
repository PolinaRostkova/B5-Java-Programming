package day35_inheritance.computer;

import day17_loops.MaxAndMin;

public class Store {
    public static void main(String[] args) {
        Computer computer1 = new Computer("General OS", 0);

        Windows windows1 = new Windows("Windows", 512);
        Mac mac1 = new Mac("IOS", 124);
    }
}
