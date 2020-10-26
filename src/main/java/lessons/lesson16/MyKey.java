package lessons.lesson16;


import java.util.Objects;
import java.util.Random;

public class MyKey {
    private String name;
    private int id;

    public MyKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //standard getters and setters

    @Override
    public boolean equals(Object o) {
        System.out.println("Calling equals() for key: " + o);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return id == myKey.id &&
                Objects.equals(name, myKey.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Calling hashCode()");

        Random rand = new Random();
        return id;

//        return id + rand.nextInt(50);
    }



}