//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of the bankAccount class
        bankAccount bobsAccount = new bankAccount();

        // Set account details
        bobsAccount.setAccountNumber("1234567890");
        bobsAccount.setCustomerName("Bob");
        bobsAccount.setCustomerEmail("bob@example.com");
        bobsAccount.setCustomerPhoneNumber("123-456-7890");
        bobsAccount.setBalance(1000.0);

        // Deposit some money
        bobsAccount.deposit(500.0);

        // Withdraw some money
        bobsAccount.withdrawal(200.0);

        // Example of accessing account information
        System.out.println("Account Number: " + bobsAccount.getAccountNumber());
        System.out.println("Customer Name: " + bobsAccount.getCustomerName());
        System.out.println("Current Balance: " + bobsAccount.getBalance());
    }
}
