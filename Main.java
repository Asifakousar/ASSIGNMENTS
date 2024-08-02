public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1000);
            double withdrawalAmount = 30000;
            account.withdraw(withdrawalAmount);
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

