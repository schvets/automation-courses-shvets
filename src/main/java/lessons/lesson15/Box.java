package lessons.lesson15;

//public class Box {
//    private Object item;
//
//    public Object getItem() {
//        return item;
//    }
//
//    public void setItem(Object item) {
//        this.item = item;
//    }
//}


//public class Box<T> {
//    private T item;
//
//    public T getItem() {
//        return item;
//    }
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//}

 class Box<T > {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

 class BigBox<K, T> extends Box {
    private T item;

    public T getItem() {
        return item;
    }

    public void setBigItem(K item, T item2) {
//        this.item = item;
    }
}