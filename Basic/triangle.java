package Basic;

public class triangle {
    public static void main(String[] args) {
        int count = 0;
        String line = "";
        int i = 0;

        while (count < 10) {
            while (i <= count) {
                line = line + '*';
                i++;
            }

            System.out.println(line); // Imprime o valor de count
            count++;
        }
    }
}
