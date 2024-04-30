package ClassWork.work_29_04_24.Task3;

public class Car {
    String carBrand;
    String carModel;
    String colour;
    String carNumber;

    public Car(String carBrand, String carModel, String colour, String carNumber){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.colour = colour;
        this.carNumber = carNumber;
    }

    public String toString(){
        return
                "марка " + carBrand + " " +
                        "модель " + carModel + " " +
                        "цвет " + colour + " " +
                        "номер " + carNumber + " ";
    }
}


