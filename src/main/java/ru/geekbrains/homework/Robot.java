package ru.geekbrains.homework;

public class Robot implements Action{
    private int jumps=0;
    private int steps=0;

    @Override
    public void jump(Wall w) {
        this.jumps = this.steps - w.getHeight();
        System.out.println("Робот прыгнул через стену");
    }

    @Override
    public void run(Road r) {
        this.steps = this.steps - r.getLength();
        System.out.println("Робот побежал по дороге");
    }
    @Override
    public String info() {
        return "Робот";
    }

    public int getJumps() {
        return jumps;
    }

    public int getSteps() {
        return steps;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
