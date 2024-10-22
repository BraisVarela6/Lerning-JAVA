package com.campusdual.abstractclass;

public class Zoo {
    public static void main(String[] args) {
        //Animal a = new Animal("Cat");
        Fox f = new Fox("Fox");
        Cat c = new Cat("Cat");
        AngoraCat ac = new AngoraCat("Angora Cat");

        c.sleep();
        f.sleep();
        ac.sleep();

        c.wakeUp();
        f.wakeUp();
        ac.wakeUp();

        f.makeSound();
        c.makeSound();
        ac.makeSound();





    }
}
