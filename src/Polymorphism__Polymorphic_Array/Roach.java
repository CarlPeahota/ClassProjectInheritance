package Polymorphism__Polymorphic_Array;

public class Roach  extends Insect {
    
    @Override
    void eat() {
    System.out.println("The Roach already ate"); //This will override the superclass method
    }
}
