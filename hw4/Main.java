public class Main {
    public static void main(String[] args) {
        try {
            Account account1 = new Account("Петр", "7343", 15000);
            Account account2 = new Account("Славик", "3423", 168249);
            Account account3 = new Account("Дмитрий", "7544", 16666);

            account1.deposit(5000);
            account2.deposit(-1000);
            account3.deposit(854);

            account1.withdrawMoney(904);
            account2.withdrawMoney(6814);
            account3.withdrawMoney(97);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Account account4 = new Debit("Некит", "9867", 500);
            Account account5 = new Debit("Кирил", "2567", 1500);

            account4.deposit(500);
            account5.deposit(1);

            account4.withdrawMoney(100);
            account5.withdrawMoney(100);

            System.out.println(account4.getBalance());

            Transaction.transfer(account4, account5, 500);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}