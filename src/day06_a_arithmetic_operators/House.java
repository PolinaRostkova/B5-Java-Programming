package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3

 */
public class House {
    public static void main(String[] args) {
        //Single house, apartment, town house, penthouse
        String houseType = "Single house", address = "123, Test Street, Fairfax, VA";

        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfTheKitchens =2;
        int zipCode = 22033;

        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean forSale = true;
        boolean hasParkNearby=true;


        double costOfTheHouse = 675_000.99;
        double schoolRating=4.5;

        System.out.println("The "+houseType+" is located at "+address+" "+zipCode+".");
        System.out.println("This house has following info: \n\tCosts $"+costOfTheHouse+"\n\tHas attic: "+hasAttic+"\n\tHas pool: "+hasPool+"\n\tIs for sale: "+forSale+"\n\tHas basement: "+hasBasement+ "\n\tIs park nearby: "+hasParkNearby+"\n\tSchool ratings: "+schoolRating);






    }
}
