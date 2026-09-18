public class Condicionais {
    
    public static void main(String[] args) {
        int idadeMinima = 18;
        int minhaIdade = 18;

        String mensagem1 = "Você tem a idade necessária para frequentar o local!";
        String mensagem2 = "Você pode frequentar acompanhado com um responsável maior de idade!";
        String mensagem3 = "Você não tem a idade minima necessaria!";
        String resultado = "";

        if (minhaIdade >= idadeMinima) {
            resultado = mensagem1;
        } else if (minhaIdade < idadeMinima && minhaIdade >= 15) {
            resultado = mensagem2;
        } else {
            resultado = mensagem3;
        }

        //com operador ternario

        //String resultado = (minhaIdade >= idadeMinima) ? mensagem1 : (minhaIdade < idadeMinima && minhaIdade >= 15) ? mensagem2 : mensagem3; 

        System.out.println(resultado);
    }
}
