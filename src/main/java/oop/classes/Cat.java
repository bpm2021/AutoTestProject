package oop.classes;

public class Cat extends Animals{

    @Override
    public void voice(){
        System.out.println("Мяу!");
    }

    public void voice(String v){
        System.out.println(v);
    }
}
