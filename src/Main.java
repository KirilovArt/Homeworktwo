public class Main {
    public static void main(String[] args) {
        int amount = 1500;
        int balance = 150;

        if (amount > 1000) {
            int percent = 1;
            int bonus = amount / 100 * percent;
            int result = amount + balance + bonus;
            System.out.println("Бонус за пополнение " + bonus);
            System.out.println("Итоговый баланс" + result);
        } else {
            int result = amount + balance;

            System.out.println("Итоговый баланс" + result);
        }

    }
}