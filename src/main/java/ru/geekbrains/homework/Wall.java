package ru.geekbrains.homework;

public class Wall implements Complexity{
    private int height;

    public void Wall(){
        height = 1;
    }

    @Override
    public void complex(int a) {
            height=a;
    }
}
