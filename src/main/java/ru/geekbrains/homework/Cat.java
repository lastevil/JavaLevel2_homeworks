package ru.geekbrains.homework;

public class Cat implements Action{
    @Override
    public void jump(Wall w) {
        System.out.println("Кот прыгнул через стену");
    }

    @Override
    public void run(Road r) {
        System.out.println("Кот побежал по дороге");
    }
    @Override
    public String info() {
        return "Кот";
    }
}
