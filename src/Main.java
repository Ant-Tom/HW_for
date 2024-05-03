//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(" " + i);
        }

        System.out.println("\nTask 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(" " + i);
        }

        System.out.println("\nTask 8");
        int moneyToMonth = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total += moneyToMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Task 9");
        int savingsPerMonth = 29000;
        double interestRate = 0.12 / 12;
        double totalSavings = savingsPerMonth;
        for (int month = 1; month <= 12; month++) {
            totalSavings += totalSavings * interestRate;
            totalSavings += savingsPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + Math.round(totalSavings) + " рублей");
        }

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}