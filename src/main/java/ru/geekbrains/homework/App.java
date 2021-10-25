package ru.geekbrains.homework;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        Action[] members ={cat,human,robot};
        Road road = new Road();
        Wall wall = new Wall();
        Complexity[] obstacles = {road,wall,wall,road,road,wall,road};
//пробежка всех по полосе препятствий
        for (Action m: members
             ) {
            for (Complexity obs: obstacles
                 ) {
                if (obs.equals(road)){
                    m.run(road);
                }
                else
                    m.jump(wall);
            }
            System.out.println(m.info()+" закончил полосу");
        }
    }
}
