package IntList_Interface;

import java.util.Arrays;
import java.util.List;

public class IntArrayList implements IntList {

    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10]; // Default initial size
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newSize = array.length / 2;
            array = Arrays.copyOf(array, newSize);
        }
        array[size++] = number;
    }

    @Override
    public  int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid ID: " + id);
        }
        return array[id];
    }
}