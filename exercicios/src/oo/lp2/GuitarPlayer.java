package oo.lp2;

public class GuitarPlayer extends Musician{
    public int howManyYears;
    public boolean playELectricGuitar;
    public boolean playAcousticGuitar;

    public GuitarPlayer(){
        if(this.playELectricGuitar){
            System.out.println("Playing electric guitar");
        }
        else{
            System.out.println("Playing acoustic guitar");
        }

        System.out.println("Playing for " + this.howManyYears + " years");
    }

    void play(){
        System.out.println("Playing guitar");
    }
}
