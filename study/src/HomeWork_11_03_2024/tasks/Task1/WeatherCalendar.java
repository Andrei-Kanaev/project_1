package HomeWork_11_03_2024.tasks.Task1;

class WeatherCalendar {
    String month = "Октябрь";
    int numberOfDays = 31;
    int rainyDays = 0;
    int year = 2020;
    boolean isRainyMonth = false;

    public WeatherCalendar(String monthName, int monthNumberOfDays){
        month = monthName;
        numberOfDays = monthNumberOfDays;
    }
    public void addRainyDay() {
        rainyDays += 1;
    }
}
