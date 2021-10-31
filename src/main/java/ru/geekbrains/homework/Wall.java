package ru.geekbrains.homework;

public class Wall implements Complexity{
    private int height;

    @Override
    public void complex(int a) {
            height=a;
    }

    public int getHeight() {
        return this.height;
    }
}
