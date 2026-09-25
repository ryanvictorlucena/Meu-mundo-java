public class Switch {
    public static void main(String[] args) {
        byte dia = 0;
        String resultado = "";
        
        switch (dia) {
            case 1:
                resultado = "domingo";
                break;
            case 2:
                resultado = "segunda";
                break;
            case 3:
                resultado = "terça";
                break;
            case 4:
                resultado = "quarta";
                break;
            case 5:
                resultado = "quinta";
                break;
            case 6:
                resultado = "sexta";
                break;
            case 7:
                resultado = "sábado";
                break;
            default:
                resultado = "opção inválida!";
                break;
        } 
        System.out.println(resultado);
    }
}
