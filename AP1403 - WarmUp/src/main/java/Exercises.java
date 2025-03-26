public class Exercises {

    public boolean isPrime(long n) {
        if(n == 2) return true;
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public long fibonacciIndex(long n) {
        long a = 0, b = 1 ,c ;
        long counter = 0;
        while(counter < n){
            c = a + b;
            a = b;
            b = c;
            counter ++;
            if(n == a) return counter;
        }
        return -1;
    }

    public char[][] generateTriangle(int n) {
        char[][] triangle = new char[n][]; 

        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
