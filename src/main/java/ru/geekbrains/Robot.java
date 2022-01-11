package ru.geekbrains;

public class Robot implements Actions{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name,int runDistance,int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(){
        System.out.println("Robot run");
    }
    @Override
    public void jump(){
        System.out.println("Robot jump");
    }

    @Override
    public int getRunDistance() {
        return 0;
    }

    @Override
    public int getJumpHeight() {
        return 0;
    }

    public Robot(){

    }
}
