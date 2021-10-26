package ru.geekbrains.homework;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setJumps(3);
        cat.setSteps(2);
        Human human = new Human();
        human.setSteps(4);
        human.setJumps(3);
        Robot robot = new Robot();
        robot.setJumps(2);
        robot.setSteps(6);
        Action[] members ={cat,human,robot};
        Road road = new Road();
        road.complex(1);
        Wall wall = new Wall();
        wall.complex(1);
        //массив препятствий
        Complexity[] obstacles = {road,wall,wall,road,road,wall,road};
//пробежка всех по полосе препятствий
        for (Action m: members
             ) {
            for (Complexity obs: obstacles
                 ) {
                if (obs.equals(road)){
                    if (m.getSteps()<=0){
                        System.out.println(m.info()+" не может продолжать");
                        break;
                    }
                    m.run(road);
                }
                else
                {
                    if (m.getJumps()<=0){
                        System.out.println(m.info()+" не может продолжать");
                        break;
                    }
                    m.jump(wall);
                }
            }
            System.out.println(m.info()+" звершил писпытание");
        }
    }
}
