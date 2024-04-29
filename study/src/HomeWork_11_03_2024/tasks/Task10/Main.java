package HomeWork_11_03_2024.tasks.Task10;


public class Main {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[]{
                new Hamster("Пушок", 150.5, 2, "Белый", true, false),
                new Hamster("Корочка", 120, 3, "Рыжий", false, false),
                new Hamster("Шалун", 199.9, 4, "Чёрный", false, false),
                new Hamster("Снежинка", 175.9, 4, "Рыжий", false, false),
                new Hamster("Штучка", 199.9, 7, "Чёрный", true, true),
                new Hamster("Баранка", 173.8, 5, "Рыже-белый", true, false),
                new Hamster("Ниндзя", 168, 3, "Рыже-белый", true, false),
        };

        System.out.println("В конкурсе «Рыжий хомяк года» смогут участвовать:");
        for (Hamster hamster : hamsters) {
            boolean isColor = hamster.color.equals("Рыжий") || (hamster.color.equals("Рыже-белый") && hamster.isFluffy);
            boolean isWeight = hamster.weight >= 150 && hamster.weight <= 200;
            boolean isAge = hamster.age >= 2;
            boolean isWinner = hamster.isWinner;

            if (isColor && (isWeight || hamster.isFluffy) && isAge && !isWinner) {
                System.out.println(" - " + hamster.name);
            }
        }
    }
}
