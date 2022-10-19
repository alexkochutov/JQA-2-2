public class Main {
    public static void main(String[] args) {
        int currentBalance = 250;
        int payment = 1250;
        int bonusCost = 100;
        int bonusCount = 0;

        if (payment <= 1000) {
            currentBalance = currentBalance + payment;
        } else {
            bonusCount = payment / bonusCost;
            currentBalance = currentBalance + payment + bonusCount;
        }

        System.out.println("Итоговый счет = " + currentBalance);
        System.out.println("Количество бонусов = " + bonusCount);
    }
}