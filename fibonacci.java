public class fibonacci {

    // Método recursivo para calcular Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Casos base: fibonacci(0) = 0, fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
    }

    public static void main(String[] args) {
        int n = 10; // Cantidad de términos a mostrar
        System.out.println("Serie Fibonacci recursiva de " + n + " términos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}