package day34_b_encapsulation;

import my_util.StringUtil;

public class DebitCard {
    // Instance var
    private long carNumber;
    String holderName;
    private String cardType;
    private int pin;
    double balance;

    static String accountType;
    static {
        accountType = "Debit";
    }

    public DebitCard(long carNumber, String holderName, double balance){
        //this.carNumber = carNumber; // check is the card num has 16 char long then i will assign it
        this.holderName = StringUtil.fixFormatForFullName(holderName); // here we used Utility class to fix the format in case it is NOT in the right format
        this.balance = balance;
        setCardNumber(carNumber);
    }

    public DebitCard(long carNumber, String holderName, String cardType, int pin, double balance) {
        this(carNumber, holderName, balance);
        setPin(pin);
        setCardType(cardType);
    }

    public void setCardNumber(long carNumber){
        if ((carNumber + "").length() == 16){
            this.carNumber = carNumber;
        } else {
            System.out.println("Invalid card number " + holderName);
        }
    }

    public void setCardType(String cardType){
        if (cardType.equalsIgnoreCase("master") || cardType.equalsIgnoreCase("visa")){
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type for" + holderName);
        }
    }

    public void setPin(int pin){
        if ((pin + "").length() == 4){
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN length for " + holderName);
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "carNumber=" + carNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
