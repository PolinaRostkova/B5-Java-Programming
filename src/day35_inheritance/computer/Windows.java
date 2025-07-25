package day35_inheritance.computer;

public class Windows extends Computer{
    String flyingCarModel;
    public Windows(String os, int memory) {
        super(os, memory);
    }

    public Windows(String os, int memory, String flyingCarModel){
        //super(os, memory);
        this(os, memory);
        this.flyingCarModel = flyingCarModel;
    }

}
