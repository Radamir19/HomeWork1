package ru.geekbrains;

public class Robot implements Running,Jumping{
    @Override
    public void run(){
        System.out.println("Robot run");
    }
    @Override
    public void jump(){
        System.out.println("Robot jump");
    }
}
