package ru.geekbrains;

public class Treadmill extends Barrirer{
private int distance;

    public Treadmill(String name,int distance) {
        super(name);
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Эта дорожка: " + super.getName() + " длина: " + distance);

        actions.jump();

        if (getDistance() <= actions.getJumpHeight()) {
            System.out.println("Прыжок выполнен успешно!!");
            return true;
        } else {
            System.out.println("Прыжок не удался(");
            return false;
        }
    }
}
