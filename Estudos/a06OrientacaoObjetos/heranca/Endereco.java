package heranca;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    public void imprime() {
        System.out.println("rua: " + this.rua);
        System.out.println("cep: " + this.cep);
    }

    public String getRua() {return this.rua;}

    public void setRua(String rua) {this.rua = rua;}

    public String getCep() {return this.cep;}
    
    public void setCep(String cep) {this.cep = cep;}
}
