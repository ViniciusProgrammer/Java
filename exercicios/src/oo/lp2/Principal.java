package oo.lp2;

public class Principal {
    public static void main(String[] args){
        Person person = new Person();

        person.name = "John";
        person.hometown = "New York";

        System.out.println("Name: " + person.getName(person.name));
        System.out.println("Hometown: " + person.getHometown(person.hometown));

        Musician musician = new Musician();
        musician.playClassicalMusic = true;

        GuitarPlayer guitarPlayer = new GuitarPlayer();
        guitarPlayer.playELectricGuitar = true;
        guitarPlayer.howManyYears = 10;

        musician.play();
        guitarPlayer.play();

        Person person2 = new Person();

        person2.name = "Paul";
        person2.hometown = "London";

        System.out.println("Name: " + person2.getName(person2.name));
        System.out.println("Hometown: " + person2.getHometown(person2.hometown));
    }
}
