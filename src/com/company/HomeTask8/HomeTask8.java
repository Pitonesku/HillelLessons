package com.company.HomeTask8;

 class Dog {
    private String name;

    public Dog (){

    }

    public Dog(String name){
        this.name = name;
    }

    public void setDogName (String name) {
        this.name = name;
    }

    public String getDogName () {
        return this.name;
    }

    public void bark () {
        System.out.println("Гав");
    }

    public void givePaw () {
        System.out.println("Собака " + this.name + " подала лапу!");
    }

}

public class HomeTask8 {

     public static void main (String[] args) {
         Dog dog1 = new Dog("Jack");
         Dog dog2 = new Dog();
         dog2.setDogName("Laika");

         dog1.bark();
         dog2.givePaw();
         System.out.println(dog1.getDogName());

     }
}
