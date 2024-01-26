package fundamentos;

public class primitivovsobjeto {
   public static void main(String[] args){
        String s = "Texto";
        s.toUpperCase();

        System.out.println(s);

        //Wappers são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);
   }
}
