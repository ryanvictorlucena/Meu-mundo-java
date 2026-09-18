public class Arrays {
    public static void main(String[] args) {
        int[] lista = new int[3];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        System.out.println(lista[2]);

        String[] nomes = new String[3];
        nomes[0] = "Jane";
        nomes[1] = "Lisbon";
        nomes[2] = "RedJohn";

        for (int i = 0; i < nomes.length; i++)
            System.out.println(nomes[i]);
    }
}
