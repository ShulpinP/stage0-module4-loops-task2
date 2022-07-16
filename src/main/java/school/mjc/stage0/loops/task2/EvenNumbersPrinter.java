package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        if (printTillInclusive < 0) {
            int i =-2;
            while (i >= printTillInclusive) {
                System.out.println(i);
                i = i - 2;}
            } else if (printTillInclusive > 0){
                int i = 2;
                while (i <= printTillInclusive) {
                    System.out.println(i);
                    i = i + 2;
                }
            }
        }
    }

