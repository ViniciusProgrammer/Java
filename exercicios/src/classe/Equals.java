package classe;

public class Equals {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Andre";
        usuario1.email = "andre@ezemail.com.br";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Andre";
        usuario2.email = "andre@ezemail.com.br";

        System.out.println(usuario1.equals(usuario2));
    }
}
