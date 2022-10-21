import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Задание 1 урока 2.9 \"Коллекции\".");
        part01();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 2 урока 2.9 \"Коллекции\".");
        part02();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 3 урока 2.9 \"Коллекции\".");
//        part03();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 4 урока 2.9 \"Коллекции\".");
        part04();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 5 урока 2.9 \"Коллекции\".");
        part05();
    }

    public static void part01() {
        Map<String, String> phonebook = new HashMap<>();
        for (int i = 0; i < 21; i++) {
            phonebook.put("SecondName FirstName " + (int) (Math.random() * 100 + 1),
                    "+7" + (int) (Math.random() * 999_999_999 + 900_000_000));
        }
        System.out.println(phonebook);
    }

    public static void part02() {
        System.out.println("Для ознакомления с решением задачи прошу проследовать по этой ссылке -" +
                " https://github.com/Pavel1G/HomeWork_2_8/pull/1");
    }

    public static void part03() throws Exception {
        Map<String, Integer> randomMap = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            randomMap.put("str" + (int) (Math.random() * 4), (int) (Math.random() * 4));
        }
        System.out.println(randomMap);
        for (int i = 0; i < 4; i++) {
            Method.addData(randomMap);
            System.out.println(randomMap);
        }
    }

    public static void part04() {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("string" + (i + 1), generateRandom());
        }
        System.out.println("Созданная коллекция - " + map);

        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> str : map.entrySet()) {
//            Я не знаю как обработать коллекцию, чтобы получить сумму. Пытался вытащить коллекцию, а потом через
//            итератор посчитать сумму (даже метод отельный написал - строки 75 - 80.
            newMap.put(str.getKey(), sumOfValue(str.getValue()));
        }
        System.out.println("Новая коллекция - " + map);
    }

    public static void part05() {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < 11; i++) {
            map.put(i, ("str" + i));
        }
        System.out.println(map);
    }

    public static ArrayList<Integer> generateRandom() {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            randomNumbers.add((int) (Math.random() * 1000));
        }
        return randomNumbers;
    }

    public static int sumOfValue(ArrayList<Integer> values) {
        Integer sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }
}