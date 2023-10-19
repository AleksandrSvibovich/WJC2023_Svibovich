package task3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TaskThree {
    static int var = 2;

    public static void main(String[] args) {
        TaskThree task = new TaskThree();
        task.checkSimpleNum(Long.parseLong(args[0]));
    }

    private void checkSimpleNum(long n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkSimpleNum(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, long n) {
        if (var == n) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }
    }
}
