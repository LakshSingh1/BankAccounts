
public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount lakshs_account= new BankAccount();
        BankAccount richards_account= new BankAccount();
        BankAccount carters_account= new BankAccount();
        
        System.out.println(BankAccount.getAccounts());

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        carters_account.checkingdeposit(1000);
        System.out.println(carters_account.getCheckingBalance());

        richards_account.savingsdeposit(2000);
        System.out.println(richards_account.getSavingsBalance());

        lakshs_account.checkingdeposit(1500);
        System.out.println(lakshs_account.getCheckingBalance());

        System.out.println(BankAccount.getTotalMoney());

        lakshs_account.deposit(4000, "Savings");
        System.out.println(lakshs_account.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        carters_account.withdraw(600, "checking");
        System.out.println(carters_account.getCheckingBalance());
        System.out.println(BankAccount.getTotalMoney());
        // Static Test (print the number of bank accounts and the totalMoney)
    }
}