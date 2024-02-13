package oo.lp2;

public class Musician extends Person{
    public boolean playClassicalMusic;
    public boolean canimprovise;
    public boolean canCompose;

    public Musician(){
        if(this.playClassicalMusic){
            System.out.println("Playing classical music");
        }
        else{
            System.out.println("Playing other music");
        }

        if(this.canimprovise){
            System.out.println("Can improvise");
        }
        else{
            System.out.println("Can't improvise");
        }

        if(this.canCompose){
            System.out.println("Can compose");
        }
        else{
            System.out.println("Can't compose");
        }
    }

    void play(){
        System.out.println("Playing music");
    }
}
