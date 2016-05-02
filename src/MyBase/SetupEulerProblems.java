package MyBase;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

/**
 * Created by W on 12/26/2015.
 */
public class SetupEulerProblems {
    private EulerProblems eulerProblems = new EulerProblems();
    private int iResult = 0;
    private long lResult = 0L;
    private int iInput = 0;
    private long lInput = 0L;

    public void SetupProblem1() {
        System.out.println(" ");
        System.out.println("Problem 1: Multiples of 3 and 5 below:");
        iInput = 10;
        iResult = eulerProblems.Problem1(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
        iInput = 1000;
        iResult = eulerProblems.Problem1(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
    }

    public void SetupProblem2() {
        System.out.println(" ");
        System.out.println("Problem 2: Even Fibonnaci numbers:");
        iInput = 90;
        iResult = eulerProblems.Problem2(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
        iInput = 4000000;
        iResult = eulerProblems.Problem2(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
    }

    public void SetupProblem3() {
        System.out.println(" ");
        System.out.println("Problem 3: Largest prime factor is:");
        lInput = 13195L;
        lResult = eulerProblems.Problem3(lInput, false);
        System.out.println("           " + lInput + " is " + lResult);
        lInput = 600851475143L;
        lResult = eulerProblems.Problem3(lInput, false);
        System.out.println("           " + lInput + " is " + lResult);
    }

    public void SetupProblem4() {
        System.out.println(" ");
        System.out.println("Problem 4: Largest palindrome product is:");
        iInput = 2;
        iResult = eulerProblems.Problem4(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
        iInput = 3;
        iResult = eulerProblems.Problem4(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
    }

    public void SetupProblem5() {
        System.out.println(" ");
        System.out.println("Problem 5: Smallest multiple is:");
        iInput = 10;
        lResult = eulerProblems.Problem5(iInput, false);
        System.out.println("           " + iInput + " is " + iResult);
        iInput = 20;
        lResult = eulerProblems.Problem5(iInput, false);
        System.out.println("           " + iInput + " is " + lResult);
    }

    public void SetupProblem6() {
        System.out.println(" ");
        System.out.println("Problem 6: Sum square difference is:");
        iInput = 10;
        lResult = eulerProblems.Problem6a(iInput);
        lResult = eulerProblems.Problem6b(iInput) - lResult;
        System.out.println("           " + iInput + " is " + lResult);
        iInput = 100;
        lResult = eulerProblems.Problem6a(iInput);
        lResult = eulerProblems.Problem6b(100) - lResult;
        System.out.println("           " + iInput + " is " + lResult);
    }

    public void SetupProblem7() {
        System.out.println(" ");
        System.out.println("Problem 7: List the prime:");
        iInput = 6;
        lResult = eulerProblems.Problem7(iInput);
        System.out.println("           " + iInput + " is " + lResult);
        iInput = 10001;
        lResult = eulerProblems.Problem7(iInput);
        System.out.println("           " + iInput + " is " + lResult);
    }

    public void SetupProblem8() {
        System.out.println(" ");
        System.out.println("Problem 8: Adjacent product:");
        P8 p8 = new P8();
        iResult = 4;
        lResult = eulerProblems.Problem8(iResult, false, p8.p8);
        System.out.println("           " + iResult + " adjacent product is " + lResult);
        iResult = 13;
        lResult = eulerProblems.Problem8(iResult, false, p8.p8);
        System.out.println("           " + iResult + " adjacent product is " + lResult);
    }

    public void SetupProblem9() {
        System.out.println(" ");
        System.out.println("Problem 9: Product Pythagorean triplet:");
        iInput = 12;
        lResult = eulerProblems.Problem9(iInput);
        System.out.println("           " + iInput + " is " + lResult);
        iInput = 1000;
        lResult = eulerProblems.Problem9(iInput);
        System.out.println("           " + iInput + " is " + lResult);
    }

    public void SetupProblem10() {
        System.out.println(" ");
        System.out.println("Problem 10: Sum of primes is: ");
        iInput = 10;
        lResult = eulerProblems.Problem10(iInput, false);
        System.out.println("            " + iInput + " is " + lResult);
        iInput = 2000000;
        lResult = eulerProblems.Problem10(iInput, false);
        System.out.println("            " + iInput + " is " + lResult);
    }

    public void SetupProblem11() {
        System.out.println(" ");
        System.out.println("Problem 11: Consecutive product:");
        P11 p11 = new P11();
        iInput = 2;
        lResult = eulerProblems.Problem11(iInput, p11.p11, false);
        System.out.println("            " + iInput + " is " + lResult);
    }

    public void SetupProblem12() {
        System.out.println(" ");
        System.out.println("Problem 12: Triangle number:");
        iInput = 5;
        lResult = eulerProblems.Problem12(iInput, true);
        System.out.println("            " + iInput + " is " + lResult);
        iInput = 500;
        lResult = eulerProblems.Problem12(iInput, false);
        System.out.println("            " + iInput + " is " + lResult);
    }

    public void SetupProblem13() {
        System.out.println(" ");
        System.out.println("Problem 13: Digit sum of array:");
        P13 p13 = new P13();
        iInput = 10;
        lResult = eulerProblems.Problem13(iInput, p13.p13, true);
        System.out.println("            " + iInput + " is " + lResult);
    }

    public void SetupProblem14() {
        System.out.println(" ");
        System.out.println("Problem 14: Longest Collatz Number:");
        iInput = 13;
        lResult = eulerProblems.Problem14(iInput, true);
        System.out.println("          " + iInput + " is " + lResult);
        iInput = 999999;
        lResult = eulerProblems.Problem14(iInput, false);
        System.out.println("          " + iInput + " is " + lResult);
    }

    public void SetupProblem15() {
        System.out.println(" ");
        System.out.println("Problem 15: Lattice paths:");
        iInput = 20;
        BigInteger bigInteger = eulerProblems.Problem15(iInput);
        System.out.println("          " + iInput + " is " + bigInteger);
    }

    public void SetupProblem16() {
        System.out.println(" ");
        System.out.println("Problem 16: ");
        iInput = 15;
        lResult = eulerProblems.Problem16(iInput, true);
        System.out.println("          " + iInput + " is " + lResult);
        iInput = 1000;
        lResult = eulerProblems.Problem16(iInput, false);
        System.out.println("          " + iInput + " is " + lResult);
    }

    // skipping 17 for now
    public void SetupProblem17() {
    }

    public void SetupProblem18() {
        System.out.println("Problem 18: Max path sum I:");
        Node test = new Node(3);
        test.l = new Node(7);
        //test.r = new Node(4);
        test.r = new Node(1);  // temp value for tlsting purposes
        test.l.l = new Node(2);
        test.l.r = new Node(4);
        test.r.l = test.l.r;
        test.r.r = new Node(6);
        test.l.l.l = new Node(8);
        test.l.l.r = new Node(5);
        test.l.r.l = test.l.l.r;
        test.l.r.r = new Node(9);
        test.r.r.l = test.l.r.r;
        test.r.r.r = new Node(3);
        lResult = eulerProblems.Problem18(test, true);
        System.out.println("          " + lResult);

        Node h = new Node(75);
        h.l = new Node(95);
        h.r = new Node(64);
        h.l.l = new Node(17);
        h.l.r = new Node(47);
        h.r.l = h.l.r;
        h.r.r = new Node(82);
        h.l.l.l = new Node(18);
        h.l.l.r = new Node(35);
        h.l.r.l = h.l.l.r;
        h.l.r.r = new Node(87);
        h.r.r.r = new Node(10);
        h.l.l.l.l = new Node(20);
        h.l.l.l.r = new Node(4);
        h.l.l.r.l = h.l.l.l.r;
        h.l.l.r.r = new Node(82);
        h.l.r.r.r = new Node(47);
        h.r.r.r.r = new Node(65);
        h.l.l.l.l.l = new Node(19);
        h.l.l.l.l.r = new Node(1);
        h.l.l.l.r.l = h.l.l.l.l.r;
        h.l.l.l.r.r = new Node(23);
        h.l.l.r.r.r = new Node(75);
        h.l.r.r.r.r = new Node(3);
        h.r.r.r.r.r = new Node(34);
        h.l.l.l.l.l.l = new Node(88);
        h.l.l.l.l.l.r = new Node(2);
        h.l.l.l.l.r.l = h.l.l.l.l.l.r;
        h.l.l.l.l.r.r = new Node(77);
        h.l.l.l.r.r.r = new Node(73);
        h.l.l.r.r.r.r = new Node(7);
        h.l.r.r.r.r.r = new Node(63);
        h.r.r.r.r.r.r = new Node(67);
        h.l.l.l.l.l.l.l = new Node(99);
        h.l.l.l.l.l.l.r = new Node(65);
        h.l.l.l.l.l.r.l = h.l.l.l.l.l.l.r;
        h.l.l.l.l.l.r.r = new Node(4);
        h.l.l.l.l.r.r.r = new Node(28);
        h.l.l.l.r.r.r.r = new Node(6);
        h.l.l.r.r.r.r.r = new Node(16);
        h.l.r.r.r.r.r.r = new Node(70);
        h.r.r.r.r.r.r.r = new Node(92);
        h.l.l.l.l.l.l.l.l = new Node(41);
        h.l.l.l.l.l.l.l.r = new Node(41);
        h.l.l.l.l.l.l.r.l = h.l.l.l.l.l.l.l.r;
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
        lResult = eulerProblems.Problem18(h, false);
        System.out.println("          " + lResult);
    }

    public void SetupProblem20() {
        System.out.println("Problem 20: Factorial Digit Sum:");
        iInput = 10;
        lResult = eulerProblems.Problem20(iInput);
        System.out.println("          " + iInput + " is " + lResult);
        iInput = 100;
        lResult = eulerProblems.Problem20(iInput);
        System.out.println("          " + iInput + " is " + lResult);
    }

    public void SetupProblem21() {
        System.out.println("Problem 21: Amicable Numbers: ");
        iInput = 10000;
        lResult = eulerProblems.Problem21(iInput);
        System.out.println("          " + iInput + " is " + lResult);

    }

    public void SetupProblem22() {
        System.out.println("Problem 22: Name Scores:");
        lResult = eulerProblems.Problem22();
        System.out.println("          " + lResult);
    }

    public void SetupProblem28() {
        System.out.println("Problem 28: Spiral");
        iInput = 5;
        lResult = eulerProblems.Problem28(iInput);
        System.out.println("          " + iInput + " is " + lResult);
        iInput = 1001;
        lResult = eulerProblems.Problem28(iInput);
        System.out.println("          " + iInput + " is " + lResult);

    }

    public void SetupProblem29() {
        System.out.println("Problem 29: Distinct Powers");
        iInput = 5;
        lResult = eulerProblems.Problem29(iInput, iInput);
        System.out.println("          " + iInput + " is " + lResult);
        iInput = 100;
        lResult = eulerProblems.Problem29(iInput, iInput);
        System.out.println("          " + iInput + " is " + lResult);
    }

    public void SetupProblem36()
    {
        System.out.println("Problem 36: Double-base Palandromes");
        //iInput = 585;
        //lResult = eulerProblems.Problem36(iInput);
        //System.out.println("          " + iInput + " is " + lResult);
        lResult = 1000000;
        lResult = eulerProblems.Problem36(lResult);
        System.out.println("          " + iInput + " is " + lResult);
    }

    public void SetupProblemMyDateCompare()
    {
        String date1 = "10,22,45";
        String date2 = "5,5,60";
        String compare = "day";

        boolean bResult = eulerProblems.MyDateCompareDate2Larger(date1, date2, compare);
        System.out.println("comparing " + compare + " of " + date1 + " and " + date2 + " is " + bResult);

        compare = "hour";
        bResult = eulerProblems.MyDateCompareDate2Larger(date1, date2, compare);
        System.out.println("comparing " + compare + " of " + date1 + " and " + date2 + " is " + bResult);

        compare = "minute";
        bResult = eulerProblems.MyDateCompareDate2Larger(date1, date2, compare);
        System.out.println("comparing " + compare + " of " + date1 + " and " + date2 + " is " + bResult);

    }

    public void SetupProblemHasEnoughTimeElapsed() {
        long start = System.currentTimeMillis();
        long requiredDurationInSeconds = 25;
        System.out.println("Starting " + LocalDateTime.now());
        System.out.println("   Wait " + requiredDurationInSeconds + " SECOND(S) from Start");
        boolean hasElapsed = false;

        while (!hasElapsed) {
            try {
                Thread.sleep(1000);
            }
            catch (java.lang.InterruptedException ie) {}

            hasElapsed = eulerProblems.HasEnoughTimeElapsed(start, requiredDurationInSeconds * 1000);
        }
        System.out.println("Time is " + LocalDateTime.now());

        long requiredDurationInMinutes = 1;
        System.out.println("   Wait " + requiredDurationInMinutes + " MINUTE(S) from Start");
        hasElapsed = false;
        while (!hasElapsed) {
            try {
                Thread.sleep(1000);
            }
            catch (java.lang.InterruptedException ie) {}
            hasElapsed = eulerProblems.HasEnoughTimeElapsed(start, requiredDurationInMinutes * 60 * 1000);
        }
        System.out.println("Time is " + LocalDateTime.now());

    }
    //****************************************************************************************
    private class P8 {
        private int[] p8 = new int[]{
                7, 3, 1, 6, 7, 1, 7, 6, 5, 3, 1, 3, 3, 0, 6, 2, 4, 9, 1, 9, 2, 2, 5, 1, 1, 9, 6, 7, 4, 4, 2, 6, 5, 7, 4, 7, 4, 2, 3, 5, 5, 3, 4, 9, 1, 9, 4, 9, 3, 4,
                9, 6, 9, 8, 3, 5, 2, 0, 3, 1, 2, 7, 7, 4, 5, 0, 6, 3, 2, 6, 2, 3, 9, 5, 7, 8, 3, 1, 8, 0, 1, 6, 9, 8, 4, 8, 0, 1, 8, 6, 9, 4, 7, 8, 8, 5, 1, 8, 4, 3,
                8, 5, 8, 6, 1, 5, 6, 0, 7, 8, 9, 1, 1, 2, 9, 4, 9, 4, 9, 5, 4, 5, 9, 5, 0, 1, 7, 3, 7, 9, 5, 8, 3, 3, 1, 9, 5, 2, 8, 5, 3, 2, 0, 8, 8, 0, 5, 5, 1, 1,
                1, 2, 5, 4, 0, 6, 9, 8, 7, 4, 7, 1, 5, 8, 5, 2, 3, 8, 6, 3, 0, 5, 0, 7, 1, 5, 6, 9, 3, 2, 9, 0, 9, 6, 3, 2, 9, 5, 2, 2, 7, 4, 4, 3, 0, 4, 3, 5, 5, 7,
                6, 6, 8, 9, 6, 6, 4, 8, 9, 5, 0, 4, 4, 5, 2, 4, 4, 5, 2, 3, 1, 6, 1, 7, 3, 1, 8, 5, 6, 4, 0, 3, 0, 9, 8, 7, 1, 1, 1, 2, 1, 7, 2, 2, 3, 8, 3, 1, 1, 3,
                6, 2, 2, 2, 9, 8, 9, 3, 4, 2, 3, 3, 8, 0, 3, 0, 8, 1, 3, 5, 3, 3, 6, 2, 7, 6, 6, 1, 4, 2, 8, 2, 8, 0, 6, 4, 4, 4, 4, 8, 6, 6, 4, 5, 2, 3, 8, 7, 4, 9,
                3, 0, 3, 5, 8, 9, 0, 7, 2, 9, 6, 2, 9, 0, 4, 9, 1, 5, 6, 0, 4, 4, 0, 7, 7, 2, 3, 9, 0, 7, 1, 3, 8, 1, 0, 5, 1, 5, 8, 5, 9, 3, 0, 7, 9, 6, 0, 8, 6, 6,
                7, 0, 1, 7, 2, 4, 2, 7, 1, 2, 1, 8, 8, 3, 9, 9, 8, 7, 9, 7, 9, 0, 8, 7, 9, 2, 2, 7, 4, 9, 2, 1, 9, 0, 1, 6, 9, 9, 7, 2, 0, 8, 8, 8, 0, 9, 3, 7, 7, 6,
                6, 5, 7, 2, 7, 3, 3, 3, 0, 0, 1, 0, 5, 3, 3, 6, 7, 8, 8, 1, 2, 2, 0, 2, 3, 5, 4, 2, 1, 8, 0, 9, 7, 5, 1, 2, 5, 4, 5, 4, 0, 5, 9, 4, 7, 5, 2, 2, 4, 3,
                5, 2, 5, 8, 4, 9, 0, 7, 7, 1, 1, 6, 7, 0, 5, 5, 6, 0, 1, 3, 6, 0, 4, 8, 3, 9, 5, 8, 6, 4, 4, 6, 7, 0, 6, 3, 2, 4, 4, 1, 5, 7, 2, 2, 1, 5, 5, 3, 9, 7,
                5, 3, 6, 9, 7, 8, 1, 7, 9, 7, 7, 8, 4, 6, 1, 7, 4, 0, 6, 4, 9, 5, 5, 1, 4, 9, 2, 9, 0, 8, 6, 2, 5, 6, 9, 3, 2, 1, 9, 7, 8, 4, 6, 8, 6, 2, 2, 4, 8, 2,
                8, 3, 9, 7, 2, 2, 4, 1, 3, 7, 5, 6, 5, 7, 0, 5, 6, 0, 5, 7, 4, 9, 0, 2, 6, 1, 4, 0, 7, 9, 7, 2, 9, 6, 8, 6, 5, 2, 4, 1, 4, 5, 3, 5, 1, 0, 0, 4, 7, 4,
                8, 2, 1, 6, 6, 3, 7, 0, 4, 8, 4, 4, 0, 3, 1, 9, 9, 8, 9, 0, 0, 0, 8, 8, 9, 5, 2, 4, 3, 4, 5, 0, 6, 5, 8, 5, 4, 1, 2, 2, 7, 5, 8, 8, 6, 6, 6, 8, 8, 1,
                1, 6, 4, 2, 7, 1, 7, 1, 4, 7, 9, 9, 2, 4, 4, 4, 2, 9, 2, 8, 2, 3, 0, 8, 6, 3, 4, 6, 5, 6, 7, 4, 8, 1, 3, 9, 1, 9, 1, 2, 3, 1, 6, 2, 8, 2, 4, 5, 8, 6,
                1, 7, 8, 6, 6, 4, 5, 8, 3, 5, 9, 1, 2, 4, 5, 6, 6, 5, 2, 9, 4, 7, 6, 5, 4, 5, 6, 8, 2, 8, 4, 8, 9, 1, 2, 8, 8, 3, 1, 4, 2, 6, 0, 7, 6, 9, 0, 0, 4, 2,
                2, 4, 2, 1, 9, 0, 2, 2, 6, 7, 1, 0, 5, 5, 6, 2, 6, 3, 2, 1, 1, 1, 1, 1, 0, 9, 3, 7, 0, 5, 4, 4, 2, 1, 7, 5, 0, 6, 9, 4, 1, 6, 5, 8, 9, 6, 0, 4, 0, 8,
                0, 7, 1, 9, 8, 4, 0, 3, 8, 5, 0, 9, 6, 2, 4, 5, 5, 4, 4, 4, 3, 6, 2, 9, 8, 1, 2, 3, 0, 9, 8, 7, 8, 7, 9, 9, 2, 7, 2, 4, 4, 2, 8, 4, 9, 0, 9, 1, 8, 8,
                8, 4, 5, 8, 0, 1, 5, 6, 1, 6, 6, 0, 9, 7, 9, 1, 9, 1, 3, 3, 8, 7, 5, 4, 9, 9, 2, 0, 0, 5, 2, 4, 0, 6, 3, 6, 8, 9, 9, 1, 2, 5, 6, 0, 7, 1, 7, 6, 0, 6,
                0, 5, 8, 8, 6, 1, 1, 6, 4, 6, 7, 1, 0, 9, 4, 0, 5, 0, 7, 7, 5, 4, 1, 0, 0, 2, 2, 5, 6, 9, 8, 3, 1, 5, 5, 2, 0, 0, 0, 5, 5, 9, 3, 5, 7, 2, 9, 7, 2, 5,
                7, 1, 6, 3, 6, 2, 6, 9, 5, 6, 1, 8, 8, 2, 6, 7, 0, 4, 2, 8, 2, 5, 2, 4, 8, 3, 6, 0, 0, 8, 2, 3, 2, 5, 7, 5, 3, 0, 4, 2, 0, 7, 5, 2, 9, 6, 3, 4, 5, 0,
        };
    }

    private class P11 {
        private int[][] p11 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
    }

    private class P11b {
        private int[][] p11 = new int[][]{
                {8, 02, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91, 8},
                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00},
                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65},
                {52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91},
                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
                {24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
                {67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
                {24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
                {21, 36, 23, 9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95},
                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14, 9, 53, 56, 92},
                {16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57},
                {86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
                {19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40},
                {04, 52, 8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
                {88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
                {04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16},
                {20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54},
                {01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48},
        };
    }

    private class P13 {
        private ArrayList<String> p13 = new ArrayList<String>();;

        private P13() {
            p13.add("0000000000000000000037107287533902102798797998220837590246510135740250");
            p13.add("0000000000000000000046376937677490009712648124896970078050417018260538");
            p13.add("0000000000000000000074324986199524741059474233309513058123726617309629");
            p13.add("0000000000000000000091942213363574161572522430563301811072406154908250");
            p13.add("0000000000000000000023067588207539346171171980310421047513778063246676");
            p13.add("0000000000000000000089261670696623633820136378418383684178734361726757");
            p13.add("0000000000000000000028112879812849979408065481931592621691275889832738");
            p13.add("0000000000000000000044274228917432520321923589422876796487670272189318");
            p13.add("0000000000000000000047451445736001306439091167216856844588711603153276");
            p13.add("0000000000000000000070386486105843025439939619828917593665686757934951");
            p13.add("0000000000000000000062176457141856560629502157223196586755079324193331");
            p13.add("0000000000000000000064906352462741904929101432445813822663347944758178");
            p13.add("0000000000000000000092575867718337217661963751590579239728245598838407");
            p13.add("0000000000000000000058203565325359399008402633568948830189458628227828");
            p13.add("0000000000000000000080181199384826282014278194139940567587151170094390");
            p13.add("0000000000000000000035398664372827112653829987240784473053190104293586");
            p13.add("0000000000000000000086515506006295864861532075273371959191420517255829");
            p13.add("0000000000000000000071693888707715466499115593487603532921714970056938");
            p13.add("0000000000000000000054370070576826684624621495650076471787294438377604");
            p13.add("0000000000000000000053282654108756828443191190634694037855217779295145");
            p13.add("0000000000000000000036123272525000296071075082563815656710885258350721");
            p13.add("0000000000000000000045876576172410976447339110607218265236877223636045");
            p13.add("0000000000000000000017423706905851860660448207621209813287860733969412");
            p13.add("0000000000000000000081142660418086830619328460811191061556940512689692");
            p13.add("0000000000000000000051934325451728388641918047049293215058642563049483");
            p13.add("0000000000000000000062467221648435076201727918039944693004732956340691");
            p13.add("0000000000000000000015732444386908125794514089057706229429197107928209");
            p13.add("0000000000000000000055037687525678773091862540744969844508330393682126");
            p13.add("0000000000000000000018336384825330154686196124348767681297534375946515");
            p13.add("0000000000000000000080386287592878490201521685554828717201219257766954");
            p13.add("0000000000000000000078182833757993103614740356856449095527097864797581");
            p13.add("0000000000000000000016726320100436897842553539920931837441497806860984");
            p13.add("0000000000000000000048403098129077791799088218795327364475675590848030");
            p13.add("0000000000000000000087086987551392711854517078544161852424320693150332");
            p13.add("0000000000000000000059959406895756536782107074926966537676326235447210");
            p13.add("0000000000000000000069793950679652694742597709739166693763042633987085");
            p13.add("0000000000000000000041052684708299085211399427365734116182760315001271");
            p13.add("0000000000000000000065378607361501080857009149939512557028198746004375");
            p13.add("0000000000000000000035829035317434717326932123578154982629742552737307");
            p13.add("0000000000000000000094953759765105305946966067683156574377167401875275");
            p13.add("0000000000000000000088902802571733229619176668713819931811048770190271");
            p13.add("0000000000000000000025267680276078003013678680992525463401061632866526");
            p13.add("0000000000000000000036270218540497705585629946580636237993140746255962");
            p13.add("0000000000000000000024074486908231174977792365466257246923322810917141");
            p13.add("0000000000000000000091430288197103288597806669760892938638285025333403");
            p13.add("0000000000000000000034413065578016127815921815005561868836468420090470");
            p13.add("0000000000000000000023053081172816430487623791969842487255036638784583");
            p13.add("0000000000000000000011487696932154902810424020138335124462181441773470");
            p13.add("0000000000000000000063783299490636259666498587618221225225512486764533");
            p13.add("0000000000000000000067720186971698544312419572409913959008952310058822");
            p13.add("0000000000000000000095548255300263520781532296796249481641953868218774");
            p13.add("0000000000000000000076085327132285723110424803456124867697064507995236");
            p13.add("0000000000000000000037774242535411291684276865538926205024910326572967");
            p13.add("0000000000000000000023701913275725675285653248258265463092207058596522");
            p13.add("0000000000000000000029798860272258331913126375147341994889534765745501");
            p13.add("0000000000000000000018495701454879288984856827726077713721403798879715");
            p13.add("0000000000000000000038298203783031473527721580348144513491373226651381");
            p13.add("0000000000000000000034829543829199918180278916522431027392251122869539");
            p13.add("0000000000000000000040957953066405232632538044100059654939159879593635");
            p13.add("0000000000000000000029746152185502371307642255121183693803580388584903");
            p13.add("0000000000000000000041698116222072977186158236678424689157993532961922");
            p13.add("0000000000000000000062467957194401269043877107275048102390895523597457");
            p13.add("0000000000000000000023189706772547915061505504953922979530901129967519");
            p13.add("0000000000000000000086188088225875314529584099251203829009407770775672");
            p13.add("0000000000000000000011306739708304724483816533873502340845647058077308");
            p13.add("0000000000000000000082959174767140363198008187129011875491310547126581");
            p13.add("0000000000000000000097623331044818386269515456334926366572897563400500");
            p13.add("0000000000000000000042846280183517070527831839425882145521227251250327");
            p13.add("0000000000000000000055121603546981200581762165212827652751691296897789");
            p13.add("0000000000000000000032238195734329339946437501907836945765883352399886");
            p13.add("0000000000000000000075506164965184775180738168837861091527357929701337");
            p13.add("0000000000000000000062177842752192623401942399639168044983993173312731");
            p13.add("0000000000000000000032924185707147349566916674687634660915035914677504");
            p13.add("0000000000000000000099518671430235219628894890102423325116913619626622");
            p13.add("0000000000000000000073267460800591547471830798392868535206946944540724");
            p13.add("0000000000000000000076841822524674417161514036427982273348055556214818");
            p13.add("0000000000000000000097142617910342598647204516893989422179826088076852");
            p13.add("0000000000000000000087783646182799346313767754307809363333018982642090");
            p13.add("0000000000000000000010848802521674670883215120185883543223812876952786");
            p13.add("0000000000000000000071329612474782464538636993009049310363619763878039");
            p13.add("0000000000000000000062184073572399794223406235393808339651327408011116");
            p13.add("0000000000000000000066627891981488087797941876876144230030984490851411");
            p13.add("0000000000000000000060661826293682836764744779239180335110989069790714");
            p13.add("0000000000000000000085786944089552990653640447425576083659976645795096");
            p13.add("0000000000000000000066024396409905389607120198219976047599490197230297");
            p13.add("0000000000000000000064913982680032973156037120041377903785566085089252");
            p13.add("0000000000000000000016730939319872750275468906903707539413042652315011");
            p13.add("0000000000000000000094809377245048795150954100921645863754710598436791");
            p13.add("0000000000000000000078639167021187492431995700641917969777599028300699");
            p13.add("0000000000000000000015368713711936614952811305876380278410754449733078");
            p13.add("0000000000000000000040789923115535562561142322423255033685442488917353");
            p13.add("0000000000000000000044889911501440648020369068063960672322193204149535");
            p13.add("0000000000000000000041503128880339536053299340368006977710650566631954");
            p13.add("0000000000000000000081234880673210146739058568557934581403627822703280");
            p13.add("0000000000000000000082616570773948327592232845941706525094512325230608");
            p13.add("0000000000000000000022918802058777319719839450180888072429661980811197");
            p13.add("0000000000000000000077158542502016545090413245809786882778948721859617");
            p13.add("0000000000000000000072107838435069186155435662884062257473692284509516");
            p13.add("0000000000000000000020849603980134001723930671666823555245252804609722");
            p13.add("0000000000000000000053503534226472524250874054075591789781264330331690");
        }
    }

}
