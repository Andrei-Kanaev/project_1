package ClassWork.work_12_04_2024;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        /*
        Ключевые слова для оброаботки:
        try, catch, throw, throws, finally

        try{
            блок кода, где отслеживаются ошибки
        } catch(ТипИсключения1 объект исключения){
            обработчик исключений для ТипИсключений1
        } catch(ТипИсключения2 объект исключения){
            обработчик исключений для ТипИсключений2
        } catch(ТипИсключения3 объект исключения){
            обработчик исключений для ТипИсключений3
        }... и т.д.
        finally{
             блок  окда, подлежащий выполнению после окончания блока  try
        }

        * */

        /*

                        Error
         Throwable ->
                        Exception -> RuntimeException -> CustomException

        * */


//        ex();
//        tryCatch(args);
//        tryInTry(args);
//        demoExDub();
        error();

    }
    public static void error(){
        Scanner scanner = new Scanner(System.in);
        try{
            int number = scanner.nextInt();
            int result = 100/number;
        }catch (InputMismatchException exeption){
            System.out.println("Вы ввели значение string");
        }catch (ArithmeticException exception){
            System.out.println("На ноль делить нельзя");
        }



    }

    private static void demoExDub() throws IllegalAccessException {
        try {

            demoEx();
        }catch (NullPointerException e){
            System.out.println("Повторно перехвачена");
        }
        throw new IllegalAccessException("демонстрация  IllegalAccessException");
    }

    private static void demoEx() {
        try{
            List<String> strs = new ArrayList<>();
            strs.add("1");
            strs.add("2");
            if(strs.contains("3")){
                System.out.println("происходит какой-то код");
            }else{
                throw new NullPointerException("Демонстрация");
            }
        }catch (NullPointerException e){
            System.out.println("перехват внутри метода: " + e);
            throw e;
        }
    }

    private static void tryInTry(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;

            try {
                int[] c = {1};
                c[42] = 99;
                System.out.println("Не выполнится");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Вышли за пределы массива: " + exception);
            }

            System.out.println("код после  2 ошибки");
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль. Опасно: " + exception);
        }

        System.out.println("остальной код");
    }

    private static void tryCatch(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }
//        catch (ArithmeticException exception){
//            System.out.println("Деление на ноль. Опасно: " +  exception);
//        }catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("Вышли за пределы массива: " +  exception);
//        }
        catch (Exception e) {

            System.out.println("другая ошибка: " + e);
        }

        System.out.println("код после ошибки");
    }

    private static void ex() {
        try {
            int d = 0;
            int a = 42 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль. Опасно");
        }

        System.out.println("код после ошибки");
    }

    private static void ex1() {
        int d = 0;
        int a = 42 / 0;
    }
}
