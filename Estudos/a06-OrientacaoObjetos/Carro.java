public class Carro {
    private String nome;
    private String modelo;
    private int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {return this.nome;}
    public String getModelo() {return this.modelo;}
    public int getAno() {return this.ano;}

    public static void main(String[] args) {
        Carro c = new Carro("Renault Boreal", "Evolution", 2026);
        System.out.println(c.getNome() + " " + c.getModelo() + " " + c.getAno());
    }
}
