public class Main {

    public static void main(String[] args) {
        int InitAccount = 70; // исходный баланс счета
        int deposit = 1198; // сумма пополнения
        int DepositForBonus = 1000; // сумма, больше которой нужно пополнить, чтобы получить бонус
        int DepositFor1Bonus = 100; // количество рублей пополнения для 1 рубля бонуса
        int MinBonus = 1; // количество бонусов за пополнение на каждые 100 рублей

        if (deposit > DepositForBonus) {
            MinBonus = 1;
        } else {
            MinBonus = 0;
        }

        int Bonus = deposit / DepositFor1Bonus * MinBonus;
        int TotalAccount = InitAccount + deposit + Bonus;

        System.out.println("Итоговый счет: " + TotalAccount + "; Количество бонусных рублей: " + Bonus);
    }
}

