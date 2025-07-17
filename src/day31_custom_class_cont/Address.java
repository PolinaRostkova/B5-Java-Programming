package day31_custom_class_cont;

public class Address {
    String street;
    String city;
    String state;
    int ZipCode;

    public Address(String street, String city, String state, int ZipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.ZipCode = ZipCode;

    }

    @Override
    public String toString() {
        return "Address Info" +
                "\n\tStreet: " + street +
                "\n\tCity: " + city +
                "\n\tState: " + state +
                "\n\tZip Code: " + ZipCode;
    }
}


class Runner{
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St.", "Wake Forest", "NC", 27577);
        System.out.println(address1);
    }
}
