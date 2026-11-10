package tn.esprit.gestionzoo.entities;

public class Animal {
     String family;
     String name;
     int age;
     boolean isMammal;

    // Constructeur par défaut
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }



    @Override
    public String toString() {
        return "Family: " + family + ", Name: " + name + ", Age: " + age + ", Mammal: " + isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
