package oo.heranca;

public class CircleTeste {
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(8);

        //IMPRIMI OS ID's das instancias
        //System.out.println(c1);
        //System.out.println(c2);

        //IMPRIMI Os raios
        //System.out.println(c1.raio);
        //System.out.println(c2.raio);

        System.out.println("A área de C1 vale = " + c1.area());
        System.out.println("A área de C2 vale = " + c2.area());
    }
}
