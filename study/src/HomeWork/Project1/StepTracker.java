package HomeWork.Project1;

import java.util.Scanner;

public class StepTracker {

    public Scanner scanner;
    private MonthData[] months;
    int target;

    public StepTracker() {
        scanner = new Scanner(System.in);
        target = 1000;

        months = new MonthData[12];
        for (int i = 0; i < months.length; i++) {
            months[i] = new MonthData();
        }
    }

    public void writeStepsToDay() {
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();

        System.out.println("Введите номер дня: ");
        int dayNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12 || dayNumber < 1 || dayNumber > 30) {
            System.out.println("Неверный номер месяца или дня!");
            return;
        }
        System.out.println("Введите кол-во шагов: ");
        int steps = scanner.nextInt();

        MonthData month = months[monthNumber - 1];
        month.getDays()[dayNumber - 1] = steps;

        getRecommendation(steps);
        System.out.println("Данные сохранены!");

        Main.printLine();
    }

    public void showStatistic() {
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Неверный номер месяца!");
            return;
        }
        MonthData month = months[monthNumber - 1];

        System.out.println("Количество сожжённых калорий: " + Converter.getCalories(month.getSumDays()));
        System.out.println("Расстояние пройденное в километрах: " + Converter.convertSteps(month.getSumDays()) + " км");
        System.out.println("Среднее количество шагов: " + month.getAverage());
        System.out.println("--------------------------------------");
    }

    public void getRecommendation(int steps) {
        if (target <= steps) {
            System.out.println("Вы достигли своей цели!");
        } else {
            int result = target - steps;
            System.out.println("До достижения цели осталось: " + result + " шага/шагов");
            Main.printLine();
        }
    }

    public void setTarget() {
        System.out.println("Введите цель по количеству шагов: ");
        this.target = scanner.nextInt();
        Main.printLine();
    }

    public void showMaxDay() {
        for (int i = 0; i < months.length; i++) {
            int maxDayIndex = months[i].getMaxSteps();
            int maxSteps = months[i].getDays()[maxDayIndex];
            System.out.println("Максимальное количество шагов за месяц " + (i + 1) + " составило: " + maxSteps);

                 //              0         1         2          3        4
                // months = [MonthData,MonthData,MonthData,MonthData,MonthData...]
               //               100        200      300      50        550
        }
        Main.printLine();
    }
}
