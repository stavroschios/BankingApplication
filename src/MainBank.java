public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank ("BMO");
        bank.addBranches("Laval");
        bank.addCustomer("Laval", "Alexandra", 100000.98);
        bank.addCustomer("Laval", "Jamie", 19212.928);
        bank.addCustomer("Laval", "George", 12223.98);

        bank.addBranches("Montreal");
        bank.addCustomer("Montreal", "Paul", 25000.87);
        bank.addCustomer("Montreal", "Maria", 2220000.12);
        bank.addCustomer("Montreal", "Jasmine", 150000.76);


        bank.addCustomerTransaction("Laval", "Alexandra", 10);
        bank.addCustomerTransaction("Montreal", "Maria", 200);

        bank.listCustomer("Laval", true);

        

    }
}
