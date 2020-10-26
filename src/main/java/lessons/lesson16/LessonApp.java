package lessons.lesson16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LessonApp {
    public static void main(String[] args) {


        HashMap<MyKey, String> map = new HashMap<>();
        MyKey k1 = new MyKey(1 , "firstKey");
        MyKey k2 = new MyKey(2 , "secondKey");
        MyKey k3 = new MyKey(3 , "thirdKey");
        MyKey k4 = new MyKey(4 , "KEY k4");
        MyKey k5 = new MyKey(5 , "KEY k5");
        MyKey k6 = new MyKey(6 , "KEY k6");
        MyKey k7 = new MyKey(7 , "KEY k7");
        MyKey k8 = new MyKey(8 , "KEY k8");
        MyKey k9 = new MyKey(9 , "KEY k9");
        MyKey k10 = new MyKey(10, "KEY k10");
        MyKey k11 = new MyKey(11, "KEY k11");
        MyKey k12 = new MyKey(12, "KEY k12");
        MyKey k13 = new MyKey(13, "KEY k12");
        MyKey k14 = new MyKey(14, "KEY k12");

        System.out.println("storing value for k1");
        map.put(k1, "firstValue");
        System.out.println("storing value for k2");
        map.put(k2, "secondValue");
        System.out.println("storing value for k3");
        map.put(k3, "thirdValue");
//        map.put(k5, "thirdValue");
//        map.put(k6, "thirdValue");
//        map.put(k7, "thirdValue");
//        map.put(k8, "thirdValue");
//        map.put(k9, "thirdValue");
//        map.put(k10, "thirdValue");
//        map.put(k11, "thirdValue");
//        map.put(k12, "thirdValue");
//        map.put(k4, "thirdValue");
//        map.put(k13, "thirdValue");
//        map.put(k14, "thirdValue");


        System.out.println("retrieving value for k1");
        String v1 = map.get(k1);
        System.out.println("retrieving value for k2");
        String v2 = map.get(k2);
        System.out.println("retrieving value for k3");
        String v3 = map.get(k3);

        map.compute(k2, (a,b) ->  b+", крутой чувак");
//        map.compute("Философия Java", (a,b) -> b+", крутой чувак");



        String test = "В процессе написания или чтения кода тебе часто будут попадаться выражения, в которых одновременно выполняются несколько операций. Очень важно понимать, в каком порядке они будут выполнены, иначе результат может быть неожиданным.";

        Map<String, Integer> resultMap = new HashMap<>();
        Arrays.stream(test.split("")).forEach(e -> {
            resultMap.computeIfAbsent(e,b -> 1);
            resultMap.computeIfPresent(e , (a,b) -> b+1);
        });


        Arrays.stream(test.split("")).forEach(e -> {
            if (resultMap.containsKey(e)){
                resultMap.put(e, resultMap.get(e) + 1);
            } else {
                resultMap.put(e, 1);
            }
        });

        resultMap.entrySet().forEach(e -> System.out.println("letter " + e.getKey() + " founded " + e.getValue() + " times"));


    }
}
