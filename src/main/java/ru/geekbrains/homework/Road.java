package ru.geekbrains.homework;

public class Road implements Complexity{
    private int length;

    @Override
    public void complex(int c) {
        length = c;
    }

    public int getLength() {
        return length;
    }
}
