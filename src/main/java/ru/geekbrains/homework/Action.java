package ru.geekbrains.homework;
//действия
public interface Action {
    void jump(Wall w);
    void run(Road r);
    String info();
}
