package ru.geekbrains;

public class Human implements Actions{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name,int runDistance,int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump() {
        System.out.println("Human jump");
    }

    @Override
    public int getRunDistance() {
        return 0;
    }

    @Override
    public int getJumpHeight() {
        return 0;
    }

    public Human(){}

}
