package day32_custom_classes;

public class OfferV2 {
    // instance variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int ptoDays;

    // constructor with 2 info - company, location
    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    // constructor with 3 info - company, location, salary
    public OfferV2(String company, String location, double salary) {
//        this.company = company;
//        this.location = location;

        this(company, location);
        this.salary = salary;
    }

    // constructor with 5 info - company, location, salary, isFullTime, numberOfPTO
    public OfferV2(String location, String company, double salary, boolean isFullTime, int ptoDays) {
//        this.location = location;
//        this.company = company;
//        this.salary = salary;
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.ptoDays = ptoDays;
    }

    // instance special method
    public String toString() {
        String msg = "Offer Info: ";
        msg += company + ", " + location;

        if (salary != 0.0){
            msg += ", " + salary;
        }

        if (isFullTime != false){
            msg +=", " + isFullTime;
        }

        msg += ptoDays != 0 ? (", " + ptoDays) : "";
//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", ptoDays=" + ptoDays +
//                '}';

        return msg;
    }
}
