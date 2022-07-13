package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact=1;
        int i = 1;
        int j = 1;
        while (i<=printToInclusive) {
            while (j<=i) {
                fact = fact*j;
                System.out.println(fact);
                j++;
            }
            i++;
        }
        fact=1;
    }
}
