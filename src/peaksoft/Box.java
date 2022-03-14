package peaksoft;

import java.util.Iterator;
import java.util.Objects;

public class Box <T>{
    private T name;

    public Box() {

    }

    public Box(T name) {
        this.name = name;
    }

    public static <T> void printBox(Box<T> arg) {
        System.out.println(arg);
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(name, box.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                '}';
    }
}
