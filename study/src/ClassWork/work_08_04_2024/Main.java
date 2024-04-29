package ClassWork.work_08_04_2024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<String, String> countriesAndContinents = new HashMap<>();
//
//        countriesAndContinents.put("Россия", "Евразия");
//        countriesAndContinents.put("Монголия", "Евразия");
//
//        countriesAndContinents.put("Морокко", "Африка");
//        countriesAndContinents.put("Танзания", "Африка");
//
//        countriesAndContinents.put("США", "Северная Америка");
        String[] evr = new String[]{"Россия", "Монголия"};

        Map<String, String[]> countriesAndContinents = new HashMap<>();

        countriesAndContinents.put("Евразия", evr);
        countriesAndContinents.put("Африка", new String[]{"Морокко", "Танзания"});
        countriesAndContinents.put("Северная Америка", new String[]{"США"});

        //System.out.println(countriesAndContinents.containsKey("Африка")); // true
        ///ystem.out.println(countriesAndContinents.containsKey("Не Африка")); // false

//        System.out.println(countriesAndContinents.containsValue(evr)); //true
//        System.out.println(countriesAndContinents.containsValue(new String[]{"Морокко", "Танзания"})); //false

//        String[] newEvr = countriesAndContinents.get("Евразия"); // new String[]{"Россия", "Монголия"}
//        String[] newOtherEvr = countriesAndContinents.get("Не Евразия"); // null


//        Map<String, String> countryAndContinents = new HashMap<>();
//
//        countryAndContinents.put("Евразия", "Россия");
//        countryAndContinents.put("Африка", "Морокко");
//        countryAndContinents.put("Северная Америка", "США");
//
//
//        for(String country :countryAndContinents.values()) {
//            System.out.println(country);
//        }
//
//        for(String Continent :countryAndContinents.keySet()) {
//            System.out.println(Continent);
//        }

        /*

        Реализация Хэш-таблиц


                               Iterable
        Java collections ->
                               Map  -> AbstractMap -> HashMap -> LinkedHashMap
                                        TreeMap
        */

        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Миша", new Double(99.22));
        map.put("вася", new Double(105.22));
        map.put("вася2", new Double(115.22));
        map.put("вася3", new Double(145.22));

        Set set = map.entrySet();
        Iterator i =  set.iterator();

        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

    }
}
