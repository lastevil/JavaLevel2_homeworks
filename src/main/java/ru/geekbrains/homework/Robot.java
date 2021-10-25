package ru.geekbrains.homework;

public class Robot implements Action{
    @Override
    public void run(Road r) {
        System.out.println("Робот побежал по дороге");
    }

    @Override
    public void jump(Wall w) {
        System.out.println("Робот прыгнул через стену");
    }
    @Override
    public String info() {
        return "Робот";
    }
}
