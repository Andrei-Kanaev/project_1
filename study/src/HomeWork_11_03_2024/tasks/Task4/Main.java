package HomeWork_11_03_2024.tasks.Task4;

/*
 Кота Пикселя на вечер субботы оставили бабушке. Она приготовила ему на выбор говядину и курицу, а перед сном налила
 молока и поставила блюдце сливок. Пиксель внимательно следит за питанием и в обоих случаях выбрал наименее калорийную еду.
 Вычислите, сколько всего ккал съел Пиксель за день, и проверьте, уложился ли питомец в свой лимит в 100 ккал.
 Чтобы код сработал, вам также нужно найти и исправить ошибки, касающиеся типов.
* */

public class Main {
    public static void main(String[] args) {
        double pixelKcalDay = 43; // столько калорий съел Пиксель до похода к бабушке
        double beefKcal = 30.2; // калорийность говядины
        double chickenKcal = 23.8; // калорийность курицы
        double creamKcal = 32.1; // калорийность сливок
        double milkKcal = 13.5; // калорийность молока

        double pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        double totalKcal = pixelKcalDay + pixelChoice;
        checkKcal(totalKcal);
    }

    private static double getMinKcalsSum(double firstDishKcal, double secondDishKcal, double firstDesert, double secondDesert) {
        double minDishKcal = Math.min(firstDishKcal, secondDishKcal);
        double minDesertKcal = Math.min(firstDesert, secondDesert);
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(double catKcal) {
        if (catKcal == 0) {
            System.out.println("Что-то пошло не так");
        }
        else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            }
            else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}

