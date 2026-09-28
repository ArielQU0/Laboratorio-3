public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        long a = 0, b = 1;

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}
