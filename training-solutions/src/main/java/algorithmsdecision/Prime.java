package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
