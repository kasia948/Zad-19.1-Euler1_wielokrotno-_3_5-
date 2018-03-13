package pl.euler;


public class Calculations {
    public int sumAllDivisibileBy3and5(int max) {
        int sum = 0;
        int x=0;
        while (x < max) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum = sum + x;
            }
            x++;
        }
        return sum;
    }
}
