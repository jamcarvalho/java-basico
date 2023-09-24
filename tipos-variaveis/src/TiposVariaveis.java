public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Jorge!");
        String nomeCompleto = "jorge" + " " + "Carvalho";
        System.out.println(nomeCompleto);

        int numero = 1;

        System.out.println("numero " + numero++);
        System.out.println("numero " + ++numero);

        boolean isAlive = true;
        System.out.println(!isAlive);
// 
        int a = 6;
        int b = 5;
        String resultado = "";

        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        // operador ternario

        String resultado2 = a==b ? "verdadeiro" : "falso"; 
        System.out.println(resultado2);

        String texto1 = "jorge";
        String texto2 = "Carvalho";

        System.out.println(texto1.equals(texto2));

    }
}
