package oop.classes;

public class Dog extends Animals{

    @Override
    public void voice(){
        System.out.println("Гав!");
    }

    public void voice(String v){
        System.out.println(v);
    }
}
