package ru.geekbrains;

public abstract class Barrirer {
private String name;

public Barrirer(String name){
    this.name = name;
}

protected abstract boolean moving(Actions actions);

public String getName(){
    return name;
}

}
