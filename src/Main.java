public class Main {

    public static void main(String[] args) {
        int initAccount = 70; // исходный баланс счета
        int deposit = 1198; // сумма пополнения
        int depositForBonus = 1000; // сумма, больше которой нужно пополнить, чтобы получить бонус
        int depositFor1Bonus = 100; // количество рублей пополнения для 1 рубля бонуса
        int minBonus = 1; // количество бонусов за пополнение на каждые 100 рублей

        if (deposit > depositForBonus) {
            minBonus = 1;
        } else {
            minBonus = 0;
        }

        int bonus = deposit / depositFor1Bonus * minBonus;
        int totalAccount = initAccount + deposit + bonus;

        System.out.println("Итоговый счет: " + totalAccount + "; Количество бонусных рублей: " + bonus);
    }
}

