public class Foreach {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 3;

        dias[2][0] = 15;
        dias[2][1] = 5;
        dias[2][2] = 25;

        /*for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }*/

        for (int[] d : dias) {
            for (int num : d) {
                System.out.println(num);
            }
        }

        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.print(num);
        }
    }
}
