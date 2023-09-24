public class NotaEscolar {
    public static void main(String[] args) {

        double nota = 6.0;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
