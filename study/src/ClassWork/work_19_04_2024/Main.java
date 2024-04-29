package ClassWork.work_19_04_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        optional();
        streamApi();
    }

    private static void streamApi() {
    /*
    interface BaseStream<T, S extends BaseStream<T,S>>

    interface Stream<T>

    Заключительные:
    collect() - накапливает элементы, возвращает их
    long count() - подсчитывает кол-во элементов
    void forEach - аналог цикла
    Optional<T> max - возвращает максимальное значение
    Optional<T> min - возвращает минимальное значение
    Optional<T> findFirst - возвращает первый элемент
    List<T> toList - создает неизменяемый список

    Промежуточные:
    Stream<T> map() - создает ноый массив на основе передаваемых объектов
    Stream<T> filter() - создает ноый массив фильтруя старый по условию
    Stream<T> sorted() - сортирует поток

    Если к потоку применился заключительный метод, то повторно поток использовать нельзя
    * */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);

        System.out.println("Исходный массив: " + numbers);

        Stream<Integer> myStream = numbers.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);

        if (minVal.isPresent()) {
            System.out.println("Мин: " + minVal.get());
        }

        myStream = numbers.stream();

        Optional<Integer> maxVal = myStream.max(Integer::compare);

        if (maxVal.isPresent()) {
            System.out.println("Макс: " + maxVal.get());
        }

        Stream<Integer> sortedVals = numbers.stream().sorted();

        sortedVals.forEach(value -> {
            System.out.print(value + " ");
        });
        System.out.println();

        Stream<Integer> oddVals = numbers.stream()
                .sorted()
                .filter(value -> value % 2 == 1);

        System.out.println("нечетные значения: ");
        oddVals.forEach(value -> {
            System.out.print(value + " ");
        });

        System.out.println();

        Stream<String> newOddVals = numbers.stream()
                .sorted()
                .filter(value -> value % 2 == 1 && value > 10)
                .map(value -> value + " это строка");

        System.out.println("Новый строчный массив нечетных элементов больше 10,  значения: ");
        newOddVals.forEach(value -> {
            System.out.print(value + " ");
        });

        System.out.println();
    }

    private static void optional() {
        // Optional
        /*
        class Optional<T>
        Может содержать значение типа Т или быть пустым
         - не имеет конструктора
         - имеет методы, которые возвращают экземпляр

        Методы класса:
        T get() - возвращает значение объекта, если значение нет, то ошибка
        boolean isPresent() - возвращает true, если значения есть, иначе false
        T orElse(T defVal) - если  значение null, то возвращается дефолтоное значение
        T orElseThrow() - если  значение null, то возникает исключение

        static <T> Optional<T> of(T val) - создает экземпляр класса, который содерожит значение. Значение не должно быть null.
        static <T> Optional<T> ofNullable(T val) - создает экземпляр класса, который содерожит значение. Если Null то пустой экземпляр.
        static <T> Optional<T> empty() - создает экземпляр класса, с пустым значением

        * */

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("Значение");

        if (noVal.isPresent()) {
            System.out.println("Не выведем");
        }
        if (hasVal.isPresent()) {
            System.out.println(hasVal.get());
        }

        String defResult = noVal.orElse("Дефолтное значение");
        System.out.println(defResult);
    }
}
