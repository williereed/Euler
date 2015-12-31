package MyBase;

import com.sun.org.apache.xpath.internal.operations.Div;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by W on 12/12/2015.
 */
public class EulerProblems {

    // Multiples of 3 and 5
    public int Problem1(int max, boolean debug) {
        int sum = 0;
        for (int i = 1; i < max; i++) {
            int x = i % 3;
            int y = i % 5;
            if ((x == 0) || (y == 0)) {
                if (debug)
                    System.out.println("i is " + i);
                sum = sum + i;
            }
        }
        return sum;
    }

    // Even Fibonacci numbers
    public int Problem2(int fibmax, boolean debug) {
        int fiblow = 1;
        int fibhigh = 2;
        int fib = fiblow + fibhigh;
        int sum = 2;

        while (fib < fibmax) {
            fiblow = fibhigh;
            fibhigh = fib;
            fib = fiblow + fibhigh;
            if (fib < fibmax) {
                int z = fib % 2;
                if (z == 0) {
                    sum = sum + fib;
                    if (debug)
                        System.out.println("sum is " + sum);
                }
            }
        }
        return sum;
    }

    // Largest Prime Factor
    public long Problem3(long max, boolean debug) {
        long largestFactor = 0;
        boolean isPrime = true;
        for (long i = 2; i <= 30000 / 2; i++) {
            // check for factor
            if (max % i == 0) {
                // yes is factor now check for prime
                isPrime = true;
                for (long z = 2; z < i / 2; z++) {
                    if (i % z == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestFactor = i;
                    if (debug)
                        System.out.println("largestFactor is " + largestFactor);
                }
            }
        }
        return largestFactor;
    }

    // Largest palindrome product
    public int Problem4(int digits, boolean debug) {
        int highestPalandrom = 0;
        int min = 0;
        int max = 0;

        switch (digits) {
            case 1:
                min = 1;
                max = 9;
                break;

            case 2:
                min = 10;
                max = 99;
                break;

            case 3:
                min = 100;
                max = 999;
                break;

            case 4:
                min = 1000;
                max = 9999;
                break;
        }
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                int k = i * j;
                if (IsPalandrom(Integer.toString(k)) && k > highestPalandrom) {
                    highestPalandrom = k;
                    if (debug)
                        System.out.println("highestPalandrom is " + highestPalandrom);
                }
            }
        }
        return highestPalandrom;
    }


    // Smallest multiple
    public long Problem5(long num, boolean debug) {
        long generation = num;
        boolean isMultiples = true;
        long max = 1;
        for (int i = 2; i <= num; i++)
            max = max * i;

        for (int i = 20; i <= max; i++) {
            if (debug)
                System.out.println("i " + i);
            isMultiples = true;
            for (int z = 2; z <= num; z++)
                if (i % z != 0) {
                    isMultiples = false;
                    break;
                }
            if (isMultiples)
                return i;
        }
        return 0;
    }

    // Sum square difference
    public long Problem6a(int max) {
        long sum = 0L;

        for (int i = 1; i <= max; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }

    // square of the sums
    public long Problem6b(int max) {
        long sum = 0L;

        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        return (sum * sum);
    }

    // 10001st prime
    public long Problem7(int max) {
        boolean loop = true;
        long number = 2;
        int primecount = 0;

        while (loop) {
            if (IsPrime(number)) {
                primecount++;
                //System.out.println(number + " is the " + primecount);
                if (primecount == max)
                    return number;
            }
            number++;
        }
        return 0L;
    }

    // Largest product in a series
    public long Problem8(int range, boolean debug, int[] p8) {
        long maxProduct = Long.MIN_VALUE;
        long currentProduct = 1L;
        for (int outterLoop = 0; outterLoop <= p8.length - range; outterLoop++) {
            currentProduct = 1L;
            for (int innerLoop = 0; innerLoop < range; innerLoop++) {
                if (debug)
                    System.out.println(currentProduct + " * " + p8[outterLoop + innerLoop] + " = " + currentProduct * p8[outterLoop + innerLoop]);
                currentProduct = currentProduct * p8[outterLoop + innerLoop];
            }
            if (debug)
                System.out.println("outterLoop " + outterLoop + " currentProduct = " + currentProduct);
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
                if (debug)
                 System.out.println("new max is " + maxProduct);
            }
        }
        return maxProduct;
    }

    // Special Pythagorean triplet
    public long Problem9(int maxSum) {
        for (int c = 3; c < maxSum; c++) {
            for (int b = 2; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    // test for Pythagorean
                    if (IsPythagorean(a, b, c)) {
                        // yes Pythagorean, find sum
                        if (a + b + c == maxSum) {
                            // yes sum, return product
                            return (a * b * c);
                        }
                    }
                }
            }
        }
        return 0L;
    }

    // Summation of primes
    public long Problem10(int max, boolean debug) {
        long sum = 0L;
        for (int i = 0; i < max; i++) {
            if (IsPrime(i)) {
                sum = sum + i;
                if (debug)
                    System.out.println("i is " + i + "  sum is " + sum);
            }
        }
        return sum;
    }

    //Largest product in a grid
    public long Problem11(int range, int[][] p11, boolean debug) {
        long maxProd = 0L;

        // horizontal
        int rowStop = p11.length;
        for (int row = 0; row < rowStop; row++) {
            if (debug)
                System.out.println("horizontal row " + row);
            int colStop = p11[row].length - range;
            for (int column = 0; column <= colStop; column++) {
                long curProd = 1L;
                for (int curr = column; curr < column + range; curr++) {
                    if (debug)
                        System.out.print("[" + row + "," + curr + "] * ");
                    curProd = curProd * p11[row][curr];
                }
                if (debug)
                    System.out.println("column " + column + "  prod is " + curProd);
                if (curProd > maxProd) {
                    maxProd = curProd;
                    if (debug)
                        System.out.println("new maxProd is " + maxProd);
                }
            }
        }
        if (debug)
            System.out.println("horizontal max is " + maxProd);

        // diagonal up
        rowStop = p11.length;
        for (int row = range - 1; row < rowStop; row++) {
            if (debug)
                System.out.println("diagonal up row " + row);
            int colStop = p11[row].length - range;
            for (int column = 0; column <= colStop; column++) {
                int tempCol = column;
                long curProd = 1L;
                int stop = row - (range - 1);
                for (int curr = row; curr >= stop; curr--) {
                    if (debug)
                        System.out.print("[" + curr + "," + tempCol + "] * ");
                    curProd = curProd * p11[curr][tempCol];
                    tempCol++;
                }
                if (debug)
                    System.out.println("column " + column + "  prod is " + curProd);
                if (curProd > maxProd) {
                    maxProd = curProd;
                }
            }
        }
        if (debug)
            System.out.println("diagonal up max is " + maxProd);

        // diagonal down
        rowStop = p11.length - range;
        for (int row = 0; row < rowStop; row++) {
            if (debug)
                System.out.println("diagonal down row " + row);
            int colStop = p11[row].length - range;
            for (int column = 0; column <= colStop; column++) {
                int tempCol = column;
                long curProd = 1L;
                for (int curr = row; curr <= row + (range - 1); curr++) {
                    if (debug)
                        System.out.print("[" + curr + "," + tempCol + "] * ");
                    curProd = curProd * p11[curr][tempCol];
                    tempCol++;
                }
                if (debug)
                    System.out.println("column " + column + "  prod is " + curProd);
                if (curProd > maxProd) {
                    maxProd = curProd;
                }
            }
        }
        if (debug)
            System.out.println("diagonal down max is " + maxProd);

        // vertical
        rowStop = p11.length - range + 1;
        for (int row = 0; row < rowStop; row++) {
            if (debug)
                System.out.println("vertical " + row);
            int colStop = p11[row].length - 1;
            for (int column = 0; column <= colStop; column++) {
                long curProd = 1L;
                for (int curr = row; curr <= row + (range - 1); curr++) {
                    if (debug)
                        System.out.print("[" + curr + "," + column + "] * ");
                    curProd = curProd * p11[curr][column];
                }
                if (debug)
                    System.out.println("column " + column + "  prod is " + curProd);
                if (curProd > maxProd) {
                    maxProd = curProd;
                }
            }
        }
        if (debug)
            System.out.println("vertical max is " + maxProd);

        return maxProd;
    }

    // Highly divisible triangular number
    public long Problem12(long max, boolean debug) {
        long triangle = 0;
        long factorcount = 0;

        for (long loop = 1; loop < Long.MAX_VALUE; loop++) {
            // step 1 find the next triangle number
            triangle = triangle + loop;
            if (debug)
                System.out.println("loop " + loop + " is triangle " + triangle);

            // step 2 determine how many divisors it has
            factorcount = FactorCount(triangle);

            // step 3 check for exit
            if (factorcount > max)
                return triangle;
        }
        return 0;
    }

    // Large sum
    public long Problem13(int firstDigitCount, ArrayList<String> p13, boolean debug) {
        int totalRowCount = p13.size();
        int digits = p13.get(0).length();
        int currentDigit = digits - 1;
        StringBuilder result = new StringBuilder();
        long columnSumLong = 0;
        String columnSumString = "";
        String previousChar = "";
        String thisChar = "";
        int[] finished = new int[digits];
        for (int i = 0; i < digits; i++)
            finished[i] = 0;

        while (currentDigit > 0) {
            columnSumLong = 0;
            for (int currentRow = 0; currentRow < totalRowCount; currentRow++) {
                int c = Character.getNumericValue(p13.get(currentRow).charAt(currentDigit));
                columnSumLong = columnSumLong + c;
            }
            columnSumString = Long.toString(columnSumLong);

            thisChar = columnSumString.substring(columnSumString.length() - 1, columnSumString.length());

            finished[currentDigit] = Character.getNumericValue(thisChar.charAt(0));

            while (columnSumString.length() <= currentDigit)
                columnSumString = "0" + columnSumString;

            columnSumString = columnSumString + previousChar;
            previousChar = thisChar + previousChar;
            p13.add(columnSumString);
            totalRowCount = p13.size();
            currentDigit--;
        }

        int trim = 0;
        while (finished[trim] == 0)
            trim++;

        columnSumString = "";
        for (int i = trim; i < trim + firstDigitCount; i++)
            columnSumString = columnSumString + finished[i];
        columnSumLong = Long.parseLong(columnSumString);
        return columnSumLong;
    }

    public long Problem14(long n, boolean debug) {
        long maxCollatz = 0;
        long currentCollatz = 0;

        for (long c = n; c > 1; c--) {
            currentCollatz = Collatz(c, debug) + 1;
//            if (debug) {
//                System.out.println("Collatz of " + c + " is " + currentCollatz);
//            }
            if (currentCollatz > maxCollatz) {
                maxCollatz = currentCollatz;
                if (debug)
                    System.out.println("maxCollatz " + c + " is " + maxCollatz);
            }

            if (c == 750000 || c == 500000 || c == 250000)
                System.out.println("breakpoint here");
        }
        return maxCollatz;
    }

    public BigInteger Problem15(int n)
    {
        int x = 20;
        BigInteger res = factorial( 2 * x ).divide(factorial(x).multiply(factorial(x)));
        return res;
    }

    public long Problem16(int power) {
        BigInteger n = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);
        String sTemp = "";
        long num = 0;
        for (int i = 1; i <= power; i++) {
            BigInteger tempBI = n.multiply(two);
            n = tempBI;
            sTemp = tempBI.toString();
        }
        for (int i = 0; i < sTemp.length(); i++){
            char tempChar = sTemp.charAt(i);
            int tempInt = Character.getNumericValue(tempChar);
            num = num + tempInt;
        }
        return num;
    }

    public long Problem18() {
        Node h = new Node(75);

        h.l = new Node(95);
        h.r = new Node(64);

        h.l.l = new Node(17);
        h.l.r = new Node(47);
        h.r.r = new Node(82);

        h.l.l.l = new Node(18);
        h.l.l.r = new Node(35);
        h.l.r.r = new Node(87);
        h.r.r.r = new Node(10);

        h.l.l.l.l = new Node(20);
        h.l.l.l.r = new Node(4);
        h.l.l.r.r = new Node(82);
        h.l.r.r.r = new Node(47);
        h.r.r.r.r = new Node(65);

        h.l.l.l.l.l = new Node(19);
        h.l.l.l.l.r = new Node(1);
        h.l.l.l.r.r = new Node(23);
        h.l.l.r.r.r = new Node(75);
        h.l.r.r.r.r = new Node(3);
        h.r.r.r.r.r = new Node(34);

        h.l.l.l.l.l.l = new Node(88);
        h.l.l.l.l.l.r = new Node(2);
        h.l.l.l.l.r.r = new Node(77);
        h.l.l.l.r.r.r = new Node(73);
        h.l.l.r.r.r.r = new Node(7);
        h.l.r.r.r.r.r = new Node(63);

        h.l.l.l.l.l.l.l = new Node(99);
        h.l.l.l.l.l.l.r = new Node(65);
        h.l.l.l.l.l.r.r = new Node(4);
        h.l.l.l.l.r.r.r = new Node(28);
        h.l.l.l.r.r.r.r = new Node(6);
        h.l.l.r.r.r.r.r = new Node(16);
        h.l.r.r.r.r.r.r = new Node(70);
        h.r.r.r.r.r.r.r = new Node(92);

        h.l.l.l.l.l.l.l.l = new Node(41);
        h.l.l.l.l.l.l.l.r = new Node(41);
        h.l.l.l.l.l.l.r.r = new Node(26);
        h.l.l.l.l.l.r.r.r = new Node(56);
        h.l.l.l.l.r.r.r.r = new Node(83);
        h.l.l.l.r.r.r.r.r = new Node(40);
        h.l.l.r.r.r.r.r.r = new Node(80);
        h.l.r.r.r.r.r.r.r = new Node(70);
        h.r.r.r.r.r.r.r.r = new Node(33);

        h.l.l.l.l.l.l.l.l.l = new Node(41);
        h.l.l.l.l.l.l.l.l.r = new Node(48);
        h.l.l.l.l.l.l.l.r.r = new Node(72);
        h.l.l.l.l.l.l.r.r.r = new Node(33);
        h.l.l.l.l.l.r.r.r.r = new Node(47);
        h.l.l.l.l.r.r.r.r.r = new Node(32);
        h.l.l.l.r.r.r.r.r.r = new Node(37);
        h.l.l.r.r.r.r.r.r.r = new Node(16);
        h.l.r.r.r.r.r.r.r.r = new Node(94);
        h.r.r.r.r.r.r.r.r.r = new Node(29);

        h.l.l.l.l.l.l.l.l.l.l = new Node(53);
        h.l.l.l.l.l.l.l.l.l.r = new Node(71);
        h.l.l.l.l.l.l.l.l.r.r = new Node(44);
        h.l.l.l.l.l.l.l.r.r.r = new Node(65);
        h.l.l.l.l.l.l.r.r.r.r = new Node(25);
        h.l.l.l.l.l.r.r.r.r.r = new Node(43);
        h.l.l.l.l.r.r.r.r.r.r = new Node(91);
        h.l.l.l.r.r.r.r.r.r.r = new Node(52);
        h.l.l.r.r.r.r.r.r.r.r = new Node(97);
        h.l.r.r.r.r.r.r.r.r.r = new Node(51);
        h.r.r.r.r.r.r.r.r.r.r = new Node(14);

        h.l.l.l.l.l.l.l.l.l.l.l = new Node(70);
        h.l.l.l.l.l.l.l.l.l.l.r = new Node(11);
        h.l.l.l.l.l.l.l.l.l.r.r = new Node(33);
        h.l.l.l.l.l.l.l.l.r.r.r = new Node(28);
        h.l.l.l.l.l.l.l.r.r.r.r = new Node(77);
        h.l.l.l.l.l.l.r.r.r.r.r = new Node(73);
        h.l.l.l.l.l.r.r.r.r.r.r = new Node(17);
        h.l.l.l.l.r.r.r.r.r.r.r = new Node(78);
        h.l.l.l.r.r.r.r.r.r.r.r = new Node(39);
        h.l.l.r.r.r.r.r.r.r.r.r = new Node(68);
        h.l.r.r.r.r.r.r.r.r.r.r = new Node(17);
        h.r.r.r.r.r.r.r.r.r.r.r = new Node(57);

        h.l.l.l.l.l.l.l.l.l.l.l.l = new Node(91);
        h.l.l.l.l.l.l.l.l.l.l.l.r = new Node(71);
        h.l.l.l.l.l.l.l.l.l.l.r.r = new Node(52);
        h.l.l.l.l.l.l.l.l.l.r.r.r = new Node(38);
        h.l.l.l.l.l.l.l.l.r.r.r.r = new Node(17);
        h.l.l.l.l.l.l.l.r.r.r.r.r = new Node(14);
        h.l.l.l.l.l.l.r.r.r.r.r.r = new Node(91);
        h.l.l.l.l.l.r.r.r.r.r.r.r = new Node(43);
        h.l.l.l.l.r.r.r.r.r.r.r.r = new Node(58);
        h.l.l.l.r.r.r.r.r.r.r.r.r = new Node(50);
        h.l.l.r.r.r.r.r.r.r.r.r.r = new Node(27);
        h.l.r.r.r.r.r.r.r.r.r.r.r = new Node(29);
        h.r.r.r.r.r.r.r.r.r.r.r.r = new Node(48);

        h.l.l.l.l.l.l.l.l.l.l.l.l.l = new Node(63);
        h.l.l.l.l.l.l.l.l.l.l.l.l.r = new Node(66);
        h.l.l.l.l.l.l.l.l.l.l.l.r.r = new Node(4);
        h.l.l.l.l.l.l.l.l.l.l.r.r.r = new Node(68);
        h.l.l.l.l.l.l.l.l.l.r.r.r.r = new Node(89);
        h.l.l.l.l.l.l.l.l.r.r.r.r.r = new Node(53);
        h.l.l.l.l.l.l.l.r.r.r.r.r.r = new Node(67);
        h.l.l.l.l.l.l.r.r.r.r.r.r.r = new Node(30);
        h.l.l.l.l.l.r.r.r.r.r.r.r.r = new Node(73);
        h.l.l.l.l.r.r.r.r.r.r.r.r.r = new Node(16);
        h.l.l.l.r.r.r.r.r.r.r.r.r.r = new Node(69);
        h.l.l.r.r.r.r.r.r.r.r.r.r.r = new Node(87);
        h.l.r.r.r.r.r.r.r.r.r.r.r.r = new Node(40);
        h.r.r.r.r.r.r.r.r.r.r.r.r.r = new Node(31);

        h.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new Node(4);
        h.l.l.l.l.l.l.l.l.l.l.l.l.l.r = new Node(62);
        h.l.l.l.l.l.l.l.l.l.l.l.l.r.r = new Node(98);
        h.l.l.l.l.l.l.l.l.l.l.l.r.r.r = new Node(27);
        h.l.l.l.l.l.l.l.l.l.l.r.r.r.r = new Node(23);
        h.l.l.l.l.l.l.l.l.l.r.r.r.r.r = new Node(9);
        h.l.l.l.l.l.l.l.l.r.r.r.r.r.r = new Node(70);
        h.l.l.l.l.l.l.l.r.r.r.r.r.r.r = new Node(98);
        h.l.l.l.l.l.l.r.r.r.r.r.r.r.r = new Node(73);
        h.l.l.l.l.l.r.r.r.r.r.r.r.r.r = new Node(93);
        h.l.l.l.l.r.r.r.r.r.r.r.r.r.r = new Node(38);
        h.l.l.l.r.r.r.r.r.r.r.r.r.r.r = new Node(53);
        h.l.l.r.r.r.r.r.r.r.r.r.r.r.r = new Node(60);
        h.l.r.r.r.r.r.r.r.r.r.r.r.r.r = new Node(4);
        h.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new Node(23);

        return 0;
    }

    //*********************************************************************************

    private BigInteger factorial(int n)
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

    private long Collatz(long n, boolean debug) {
        long count = 0;
        debug = false;
        while (n > 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n) + 1;
            count++;
            if (debug)
                System.out.println(count + " is " + n);
        }
        return count++;
    }

    private long FactorCount(long n) {
        long result = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                result += 2;
                if (n / i == i) {
                    result--;
                }
            }
        }
        return result;
    }

    private boolean IsPalandrom(String p) {
        int left = 0;
        int right = p.length() - 1;
        int mid = p.length() / 2;
        while (p.charAt(left) == p.charAt(right) && (left <= mid)) {
            left++;
            right--;
        }
        if (left >= mid)
            return true;
        return false;
    }

    private boolean IsPrime(long num) {
        if ((num <= 1) || (num == 4)) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean IsPythagorean(int a, int b, int c) {
        int ap = a * a;
        int bp = b * b;
        int cp = c * c;
        if ((ap + bp) == cp)
            return true;
        return false;
    }
}
