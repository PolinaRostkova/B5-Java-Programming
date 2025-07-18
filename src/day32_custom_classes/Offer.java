package day32_custom_classes;

// custom class
/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO

    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    - method:

        toString()
            print all the employees information

 */
public class Offer {
    // instance variables
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int ptoDays;

    // constructor with 2 info - company, location
    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    // constructor with 3 info - company, location, salary
    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    // constructor with 5 info - company, location, salary, isFullTime, numberOfPTO
    public Offer(String location, String company, double salary, boolean isFullTime, int ptoDays) {
        this.location = location;
        this.company = company;
        this.salary = salary;
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
