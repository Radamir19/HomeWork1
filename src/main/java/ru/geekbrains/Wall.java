package ru.geekbrains;

public class Wall extends Barrirer{
    private int height;

    public Wall(String name,int height) {
        super(name);

        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    protected boolean moving(Actions actions){
        System.out.println("Эта стена: "+ super.getName()+" высота: "+height);

        actions.jump();

        if(getHeight() <= actions.getJumpHeight()){
            System.out.println("Прыжок выполнен успешно!!");
            return true;
        }else{
            System.out.println("Прыжок не удался(");
            return false;
        }

    }
}
