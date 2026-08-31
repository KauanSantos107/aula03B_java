public class Computador {
    // 1. Atributos (características do computador)
    private String marca;
    private String processador;
    private int memoriaRAM; // em GB
    private boolean ligado;

    // 2. Construtor Padrão (sem parâmetros)
    public Computador() {
        this.marca = "Genérica";
        this.processador = "Intel Core i3";
        this.memoriaRAM = 8;
        this.ligado = false;
    }

    // 3. Construtor com Parâmetros (permite personalizar ao instanciar)
    public Computador(String marca, String processador, int memoriaRAM) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.ligado = false;
    }

    // 4. Métodos de Ação (Comportamentos)
    public void ligar() {
        this.ligado = true;
        System.out.println("O computador " + marca + " está sendo ligado...");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O computador " + marca + " foi desligado.");
    }

    public void exibirInformacoes() {
        System.out.println("--- Dados do Computador ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória RAM: " + this.memoriaRAM + " GB");
        System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado"));
        System.out.println("---------------------------");
    }

    // 5. Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean isLigado() {
        return ligado;
    }
}