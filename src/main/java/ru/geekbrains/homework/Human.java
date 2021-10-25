package ru.geekbrains.homework;

public class Human implements Action{
    @Override
    public void run(Road r) {
        System.out.println("Человек побежал по дороге");
    }

    @Override
    public void jump(Wall w) {
        System.out.println("Человек прыгнул через стену");
    }

    @Override
    public String info() {
        return "Человек";
    }
}
