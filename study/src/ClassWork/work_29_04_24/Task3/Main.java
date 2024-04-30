package ClassWork.work_29_04_24.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        selectMenu();
    }

    public static void selectMenu() {
        ParkingLot parkingLot = new ParkingLot();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            printLine();
            System.out.println("Введите команду: ");
            int command = scanner.nextInt();

            if (command == 1) {
                scanner.nextLine();
                System.out.println("Введите марку автомобиля");
                String carBrand = scanner.nextLine();
                System.out.println("Введите модель автомобиля");
                String carModel = scanner.nextLine();
                System.out.println("Введите цвет автомобиля");
                String colour = scanner.nextLine();
                System.out.println("Введите номер автомобиля");
                String carNumber = scanner.nextLine();
                System.out.println("Введите час, в который Вы планируете уехать: ");
                int time = scanner.nextInt();
                if (time > 24 || time < 0){
                    System.out.println("Время введено неверно! ");
                } else {
                    int index = parkingLot.parkingCar(carBrand, carModel, colour, carNumber);
                    System.out.println("Вы получили пропуск с номером " + index + ". Используйте его при выезде");
                    parkingLot.setTimeToLeave(time, index);
                }
                printLine();
            } else if (command == 2) {
                System.out.println("Введите номер пропуска: ");
                int index = scanner.nextInt();
                if(!parkingLot.leaveTime.containsKey(index)){
                    parkingLot.leaveParking(index);
                } else{
                    System.out.println("Неверный номер пропуска!");
                }
                printLine();
            } else if (command == 3) {
                parkingLot.checkFreePlaces();
                printLine();
            } else if (command == 4) {
                parkingLot.getTimeToLeave();
                printLine();
            } else if (command == 0) {
                printLine();
                System.out.println("ПРОГРАММА ЗАВЕРШИЛА РАБОТУ");
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("1 - припарковать автомобиль");
        System.out.println("2 - выезд с парковки");
        System.out.println("3 - проверить наличие свободных мест");
        System.out.println("4 - расписание занятости парковки");
        System.out.println("0 - выход");
    }

    public static void printLine(){
        System.out.println("-----------------------------------------------");
    }
}
