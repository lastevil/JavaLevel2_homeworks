package ru.geekbrains.homework;

public interface Action {
    void jump(Wall w);
    void run(Road r);
    String info();
}
