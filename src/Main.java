public class Main {
    public static void main(String[] args) {
        double base = 100; //начальный счёт
        double amount = 1345.75; // суммы пополнения
        int bonus = (int) amount / 100;// количество бонусных рублей

        if (amount > 1000) {
            double newAmount = base + amount + bonus;
            System.out.println("Начальный счет");
            System.out.println(base);
            System.out.println("Сумма пополнения");
            System.out.println(amount);
            System.out.println("Сумма бонусных рублей");
            System.out.println(bonus);
            System.out.println("Итоговый счет");
            System.out.println(newAmount);
        } else {
            double newAmount = base + amount;
            System.out.println("Начальный счет");
            System.out.println(base);
            System.out.println("Сумма пополнения");
            System.out.println(amount);
            System.out.println("Итоговый счет");
            System.out.println(newAmount);
        }
    }
}
