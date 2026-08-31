public class CriaComputador {

    public static void main(String[] args) {
        // 1. Instanciando o primeiro objeto do tipo Computador
        Computador c1 = new Computador();
        
        // 2. Instanciando o segundo objeto (caso sua classe aceite parâmetros no construtor)
        // Computador c2 = new Computador("Dell", "Intel i7", 16);

        // 3. Chamando métodos da classe Computador para testar seu funcionamento
        // Exemplo: chamando um método de exibição de dados ou alteração de atributos
        c1.exibirInformacoes(); 
        
        System.out.println("Testes executados com sucesso!");
    }
}