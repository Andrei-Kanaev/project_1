package ClassWork.work_29_04_24.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    int parkingSpaces = 10;

    ArrayList<Car> parkingList = new ArrayList<>(parkingSpaces);
    HashMap<Integer, Integer> leaveTime = new HashMap<>();

    public int parkingCar(String carBrand, String carModel, String colour, String carNumber){
        Car car = new Car(carBrand, carModel, colour, carNumber);
        parkingList.add(car);
        int index = parkingList.size() - 1;

        return index;
    }

    public void leaveParking(int index){
        parkingList.remove(index);
    }

    public void checkFreePlaces(){
        int length = parkingSpaces - parkingList.size();
        if(length == 0){
            System.out.println("Свободных мест нет!");
        }
        else {
            System.out.println("Количество свободных мест: " + length);
        }
    }

    public void setTimeToLeave(int time, int index) {
        leaveTime.put(time, index);
        System.out.println("Время выезда для пропуска " + index + " установлено на " + time + " часов");
    }

    public void getTimeToLeave() {
        System.out.println("Расписание времени выезда:");
        for (Map.Entry<Integer, Integer> entry : leaveTime.entrySet()) {
            System.out.println("Пропуск " + entry.getValue() + " - время выезда: " + entry.getKey() + " часов");
        }
    }
}
