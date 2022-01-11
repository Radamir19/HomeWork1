package ru.geekbrains;

import java.util.Random;

public class Work {
    public static void main(String[] args) {
        //Human human = new Human();
        //human.run();
        //human.jump();
        //Robot robot = new Robot();
        //robot.run();
        //robot.jump();

        //Cat cat = new Cat();
        //cat.run();
        //cat.jump();

        Random rand = new Random();
        Actions[] act = new Actions[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);
        act[0] = new Human("Sasha", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        act[1] = new Cat("Myrzik", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        act[2] = new Robot("100010010", distance, height);

        Barrirer[] bar = new Barrirer[6];

        boolean doRoad;

        for (int i = 0; i < bar.length; i++) {
            distance = rand.nextInt(10);
            doRoad = rand.nextBoolean();

            if (doRoad) {
                bar[i] = new Treadmill("Road" + i, distance);
            } else {
                bar[i] = new Wall("Wall" + i, distance);
            }
        }
        for (int i = 0; i < act.length; i++) {
            boolean result = true;
            for (int j = 0; j < bar.length; j++) {
                result = bar[j].moving(act[i]);


                if (!result) {
                    break;
                }
            }

            if(result){
                System.out.println("Успех");
            }else{
                System.out.println("Неудача");
            }
        }
    }
}
