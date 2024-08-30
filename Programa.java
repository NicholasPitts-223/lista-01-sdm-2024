public class Programa {
    public static void main(String[] args) {
        
        Universidade universidade = new Universidade(
            "Universidade Exemplo",
            "12.345.678/0001-90",
            "Rua Exemplo, 123",
            20
        );

        
        universidade.imprimirDados();
    }
}