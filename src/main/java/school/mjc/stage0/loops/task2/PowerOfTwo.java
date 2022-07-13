package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i=0;
        int curValue = 1;
        if (power >=0) {
            while (i <= power) {
                curValue = curValue * 2;
                System.out.println(curValue);
                i++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
