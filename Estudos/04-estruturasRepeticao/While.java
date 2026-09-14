public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Loop " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("2Loop " + j);
            j++;
        } while(j > 10); //J = 0 então não é maior que 10, não vai executar a partir desta linha.
    }
}
