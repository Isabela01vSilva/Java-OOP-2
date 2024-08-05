public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Deadpool 3";
        meuFilme.anoDeLancamento = 2024;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
    }
}
