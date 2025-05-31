package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.02; //%2
        double federalTaxRate = 0.22; //%22

        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;

        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        String taxInfo = " Tax Info: \n\tBase Salary\t\t\t$" + salary + "\n\tState Tax Rate:\t\t"+stateTaxRate + "\n\tFederal Tax Rate: \t"+ federalTaxRate;
        String taxAmountReport = "Tax Amounts: \n\tState Tax Amount: \t$"+ stateTax + "\n\tFederal Tax Amount:\t$"+federalTax + "\n\tSalary After Tax:\t$"+salaryAfterTax;

        System.out.println(taxInfo);
        System.out.println(taxAmountReport);
    }
}
