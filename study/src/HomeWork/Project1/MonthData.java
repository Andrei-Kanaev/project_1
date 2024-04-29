package HomeWork.Project1;

import java.util.Arrays;

public class MonthData {

    private int[] days;

    public int[] getDays() {
        return days;
    }

    public MonthData() {
        days = new int[30]; // Integer[30] = [null,null,null,null,null...]
        Arrays.fill(days, 0);
    }

    public int getMaxSteps() {
        int maxSteps = 0;
        int maxDay = 0;
        
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
                maxDay = i;
            }
        }
        return maxDay;
        
    }

    public double getAverage(){
        int counter = getSumDays();
        return (double) counter / days.length;
    }

    public int getSumDays() {
        int counter = 0;
        for(int i = 0; i < days.length; i ++){
            counter += days[i];  // 0,1,2,3,4... 30 = всегда один и тот же результат.
        }
        return counter;
    }
}
