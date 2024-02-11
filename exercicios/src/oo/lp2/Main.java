package oo.lp2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, Color.RED);
        Circle c2 = new Circle(2.5, Color.BLUE);
        Circle c3 = new Circle(1, Color.GREEN);

        Circle c4 = new Circle();

        System.out.println("Utilizando Circle 4 com o construtor padrão onde ele não passa nenhum parametro");
        System.out.println(c4.getRadius());
        System.out.println(c4.getColor());
        System.out.println("O valor da área do Circle 4 é = " + c4.getArea());

        System.out.println("\nCicle 1");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println("O valor da área do Circle 1 é = " + c1.getArea());

        System.out.println("\nCircle 2");
        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());
        System.out.println("O valor da área do Circle 1 é = " + c2.getArea());

        System.out.println("\nCircle 3");
        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());
        System.out.println("O valor da área do Circle 1 é = " + c3.getArea());
        System.out.println();

        Color red = Color.valueOf("RED");
        System.out.println("O código hexa de cor " + red + " é " + red.getHexCode() + " e o nome da cor em português é = " + red.getPtValue());
    }
}
