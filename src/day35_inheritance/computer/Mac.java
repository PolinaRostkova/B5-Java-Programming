package day35_inheritance.computer;

public class Mac extends Computer{
    String swimingCar;
    public Mac(String os, int memory) {
        super(os, memory);
    }

    public Mac(String os, int memory, String swimingCar){
        super(os,memory);
        this.swimingCar = swimingCar;
    }
}
