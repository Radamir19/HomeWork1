package ru.geekbrains;

public class Human implements Running,Jumping{
    @Override
    public void run(){
        System.out.println("Human run");
    }
    @Override
    public void jump(){
        System.out.println("Human jump");
    }
}
