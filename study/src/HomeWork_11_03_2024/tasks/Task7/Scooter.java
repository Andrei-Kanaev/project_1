package HomeWork_11_03_2024.tasks.Task7;

class Scooter {
    int availableScooters;
    int scootersInUse;
    static int defaultPrice = 8;
    static int additionalPrice = 5;

    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if (availableScooters == 0) {
            System.out.println("Нет доступных самокатов.");
        } else {
            int currentPrice = (((scootersInUse + 1) * additionalPrice) / availableScooters) + defaultPrice;
            System.out.println("Текущая стоимость проката: " + currentPrice + " руб/мин");
        }
    }

    void rentScooter() {
        if (availableScooters == 0) {
            System.out.println("Доступных самокатов не осталось.");
        } else {
            scootersInUse += 1;
            int currentPrice = (((scootersInUse) * additionalPrice) / availableScooters) + defaultPrice;
            availableScooters -= 1;
            System.out.println("Выдайте самокат по цене " + currentPrice + " руб/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }

    void returnScooter() {
        if (scootersInUse == 0) {
            System.out.println("Все самокаты уже возвращены.");
        } else {
            scootersInUse -= 1;
            availableScooters += 1;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }
}