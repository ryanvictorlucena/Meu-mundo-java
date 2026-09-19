package dominio;

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

    
}