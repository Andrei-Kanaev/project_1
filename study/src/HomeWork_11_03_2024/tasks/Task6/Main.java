package HomeWork_11_03_2024.tasks.Task6;

/*
Начинающий фотограф Алиса решила накопить на новый объектив. Она открыла вклад в банке на три года под 4% годовых.
В качестве стартового платежа Алиса внесла 5000 рублей и планирует каждый месяц пополнять счёт на 1000 рублей.
Помогите вычислить, сколько денег будет на вкладе Алисы к концу срока и хватит ли ей на объектив с учётом того, что он стоит 41000 рублей.
Вам нужно правильно расставить типы переменных и дополнить код необходимыми арифметическими операциями. Начисление
процентов по вкладу это регулярная процедура, число повторений которой заранее известно — используйте для вычислений
цикл for. Также учитывайте, что Алиса пополняет вклад после того, как начисляется доход от процентов.

* */

public class Main{

    public static void main(String[] args) {
        int roubles = 5000; // сумма на счету
        double yearRate = 4; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        int monthRefill = 1000; // ежемесячное пополнение

        double monthRate = Math.pow(1 + yearRate / 12, 1.0 / 12) - 1;

        for (int i = 0; i < numOfMonth; i++) {
            double depositInterest = roubles * monthRate;
            roubles += depositInterest;
            roubles += monthRefill;
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles >= 41000) {
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}

