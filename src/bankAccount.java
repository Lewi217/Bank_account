public class bankAccount {

   private String accountNumber;
   private double balance;
   private String customerName;
   private String customerEmail;
   private String customerPhoneNumber;

   public bankAccount(){
       System.out.println("Empty constructor called");
   }

   public bankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber){
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.customerName = customerName;
       this.customerEmail = customerEmail;

   }
   
   public void deposit(double depositAmount){
       this.balance += depositAmount;
       System.out.println("Deposit of " + depositAmount + "made. New balance is "+ this.balance);
   }
   public void withdrawal(double withdrawalAmount){
       if(balance - withdrawalAmount <=0){
           System.out.println("Only" + this.balance + "available.Withdrawal not processed");
       }else{
           balance -= withdrawalAmount;
           System.out.println("Withdrawal of "+ withdrawalAmount + "processed. Remaining balance= "+ this.balance);
       }
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
