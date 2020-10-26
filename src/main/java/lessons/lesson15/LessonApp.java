package lessons.lesson15;

import infrastusture.data.UserFileDataMapper;

import java.util.HashMap;
import java.util.Map;

public class LessonApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("test", "terst");
        UserFileDataMapper mapper = new UserFileDataMapper();
        System.out.println(mapper.getAll());
//
//        User user = mapper.findUserByEmail("test745@gmail.com");
//        System.out.println(user.getUserName() + "  :  "+ user.getPassword() );

//        Developer developer = new JavaTeamLead(new JavaDeveloper());
//        System.out.println(developer.makeJob());

//        Box box = new Box();
//        box.setItem(new Integer(5));
//        box.setItem(new String("test"));
////        box.getItem() instanceof Integer ? ((Integer) box.getItem()) : ((String) box.getItem());
//
//        Box <Integer> box1 = new Box<Integer>();
//        box1.setItem(new Integer(5));
//        box1.setItem(new String("test"));
//
//        Box <String> box2 = new Box<String>();
//        box2.setItem(new Integer(5));
//        box2.setItem(new String("test"));
//
//        Box <Number> box3 = new Box<Number>();
//        Box <Integer> box4 = new Box<Integer>();
//        box3.setItem(5.0);
//        box4.setItem(5.0);
////        sum(Box<Number> a)
////        sum(Box<Integer> a)
//
////        wildeCards
//        Box <Number> box5 = new Box<Number>();
//        Box <Integer> box6 = new Box<Integer>();
//        Box <Short> box7 = new Box<Short>();
////        Box <String> box8 = new Box<String>();
//        Box <Object> box8 = new Box<Object>();
//
//
//        sum(box6);
//
//        sumSuper(box8);

//        test2(new Integer(2), new Integer(5));
//
//        BigBox<String, Integer> box = new BigBox<>();
//        box.setI;
    }

    public static void sum(Box<? extends Number> box){

    }

    public static void sumSuper(Box<? super Number> box){

    }

//    public <T,K,M>  T test(K item1, M item2){
//        return item1 + item2
//    }

//    public static <T extends String,K extends Number,M extends Integer>  T test2(K item1, M item2){
//        String s = String.valueOf((Integer) item1 + item2);
//        return s;
//    }


}
