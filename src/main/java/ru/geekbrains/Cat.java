package ru.geekbrains;

public class Cat implements Running,Jumping{
    @Override
    public void run(){
        System.out.println("Cat run");
    }
    @Override
    public void jump(){
        System.out.println("Cat jump");
    }
}
