public class TiposPrimitivos {
    // creation of a variable
    public static void main(String[] args) {   
        //variaveis 
        int age = 22; // an integer number (22) stored in the variable age
        double money = 2000.0;
        float moneyCents = 2500.0f; // casting = forçar um tipo pra dentro de outro por exemplo, (int) ***
        byte ageByte = 10;
        short ageShort = 20;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 'A';

        //casting
        int numeroGrande = (int) 10000000000L; // um número long em um int por casting
        float numeroDouble = (float) 2500.0;
        // o casting do float da o mesmo resultado 2500.0 por caber dentro do limite de espaço, o do int não ja que ele é um long

        //strings
        String frase = "algo aqui";
        System.out.println(frase);
        
    }
}