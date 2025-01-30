package Generics.UsingGenerics;

import java.util.ArrayList;

public class List<T> {
    private java.util.List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public T get(int i) {
        return list.get(i);
    }
}
