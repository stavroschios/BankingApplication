import java.util.ArrayList;

public class Bank {

     private String name;
     private ArrayList<Branches> braches;

     public Bank(String name) {
         this.name = name;
         this.braches = new ArrayList<Branches>();
     }

     public boolean addBranches(String branchName){
         if(findBranch(branchName) == null){
             this.braches.add(new Branches(branchName));
             return true;
         }
         return false;
     }

     private Branches findBranch(String branchName) {
         for (int i = 0; i < this.braches.size(); i++) {
             Branches branchChecked = this.braches.get(i);
             if (branchChecked.getName().equals(branchName)) {
                 return branchChecked;
             }
         }
         return null;

     }

     public boolean listCustomer(String branchName, Boolean transaction) {
         Branches branch = findBranch(branchName);
         if (branch != null) {
             System.out.println("Customers details for branch " + branch.getName());
             ArrayList<Customer> branchCustomers = branch.getCustomers();
             for (int i = 0; i < branchCustomers.size(); i++) {
                 Customer branchCustomer = branchCustomers.get(i);
                 System.out.println("Customer " + branchCustomer.getName() + " [" + (i + 1) + "]");
                 if (transaction) {
                     System.out.println("Transactions :");
                     ArrayList<Double> transactions = branchCustomer.getTransactions();
                     for (int j = 0; j < transactions.size(); j++) {
                         System.out.println("[" + (j + 1) + "]" + " Amount: " + transactions.get(j)+ "$");
                     }
                 }
             }  return true;
         } else return false;

     }






     public boolean addCustomer(String branchName, String CustomerName, double initialTransaction){
        Branches newBranch = findBranch(branchName);
        if(branchName != null){
            return newBranch.newCustomer(CustomerName, initialTransaction);
        }
        return false;
     }

     public boolean addCustomerTransaction(String branchName, String customerName, double amount){
         Branches branch = findBranch(branchName);
         if(branch != null) {
             return branch.addCustomerTransaction(customerName,amount);
         }
         return false;
     }
}
