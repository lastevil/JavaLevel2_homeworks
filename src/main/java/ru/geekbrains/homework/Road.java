package ru.geekbrains.homework;

public class Road implements Complexity{
    private int length;

    public void Road(){
        length = 1;
    }

    @Override
    public void complex(int c) {
        length = c;
    }
}
