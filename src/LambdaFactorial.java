public class LambdaFactorial {
    interface Numericfun {
        int func(int n);
    }

    public static void main(String[] args) {
        Numericfun factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result += result*i;
            }
            return result;
        };

        // Calculate and print factorial of 5 using the lambda
        System.out.println("Factorial de 5 es: " + factorial.func(4));
    }
}

