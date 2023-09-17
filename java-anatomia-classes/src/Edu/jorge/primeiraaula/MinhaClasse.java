package Edu.jorge.primeiraaula;
public class MinhaClasse {

    // a classe pode ser executável neste caso precisa do método main
    public static void main (String [] args) {

        String  nome = "Jorge";
        String  sobrenome = "Carvalho";
        int     anoNascimento = 1963;
        String  [] emails = {"jorge.carvalho@yahoo.com", "jamcarvalho@gmail.com"};
        boolean isAlive = true;

        System.out.print (nomeCompleto(nome, sobrenome) + " nascido em " + anoNascimento);
    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
    
}
