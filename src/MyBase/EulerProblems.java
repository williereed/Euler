package MyBase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

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
        // A predefined set of numbers that we're going to scan
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

            // Padding result of a column sum, so the ones, tens, 100's are aligned with the existing number
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
        // Building up the answer (10 digit number) by walking the array left to right
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
            if (debug) {
                System.out.println("Collatz of " + c + " is " + currentCollatz);
            }
            if (currentCollatz > maxCollatz) {
                maxCollatz = currentCollatz;
                if (debug)
                    System.out.println("maxCollatz " + c + " is " + maxCollatz);
            }
        }
        return maxCollatz;
    }

    public BigInteger Problem15(int n)
    {
        BigInteger result = factorial( 2 * n ).divide(factorial(n).multiply(factorial(n)));
        return result;
    }

    public long Problem16(int power, boolean debug) {
        BigInteger n = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);
        String sTemp = "";
        long num = 0;
        for (int i = 1; i <= power; i++) {
            BigInteger tempBI = n.multiply(two);
            n = tempBI;
            if (debug)
                System.out.println("n is " + n);
            sTemp = tempBI.toString();
        }
        for (int i = 0; i < sTemp.length(); i++){
            char tempChar = sTemp.charAt(i);
            int tempInt = Character.getNumericValue(tempChar);
            num = num + tempInt;
        }
        return num;
    }

    public long Problem18(Node head, boolean debug) {
        if (head == null)
            return -1;

        long returnValue = printInOrder(head, debug, 0);
        return returnValue;
    }

    public long Problem20(int num) {
        BigInteger bResult = BigInteger.valueOf(num);

        for (long i = num  - 1; i > 1; i--) {
            bResult = bResult.multiply(BigInteger.valueOf(i));
        }
        String sResult = bResult.toString();
        long lResult = 0;

        for (int i = 0; i < sResult.length(); i++) {
            lResult = lResult + Character.getNumericValue(sResult.charAt(i));
        }

        return lResult;
    }

    public long Problem21(int num) {
        long[][] sums = new long[num + 1][2];
        long sum = 0;

        for (int i = 1; i <= num; i++)
        {
            sums[i][0] = i;
            sums[i][1] = ProperDivisorSum(i);
        }
        for (int i = 1; i <= num; i++)
        {
            long value1 = sums[i][1];
            if (value1 <= num) {
                long value2 = sums[(int) value1][1];
                if (value1 != value2) {
                    if (sums[(int) value1][1] == i) {
                        sum = sum + i;
                    }
                }
            }
        }
        return sum;
    }


    private long ProperDivisorSum(int num) {
        long sum = 0;

        for (int i = num - 1; i > 0; i--) {
            if (num % i == 0)
                sum = sum + i;
        }
        return sum;
    }

    private long printInOrder(Node rt, boolean debug, long currentPathSum) {
        if (debug)
            System.out.println(rt.v);
        currentPathSum = currentPathSum + rt.v;

        long leftPathSum = Long.MIN_VALUE;
        long rightPathSum = Long.MIN_VALUE;

        if (rt.l != null) {
            leftPathSum = printInOrder(rt.l, debug, currentPathSum);
        }
        if (rt.r != null) {
            rightPathSum = printInOrder(rt.r, debug, currentPathSum);
        }

        debug = false;
        if (leftPathSum > rightPathSum && leftPathSum > currentPathSum) {
            if (debug)
                System.out.println("returning LEFT Path Sum " + leftPathSum);
            return leftPathSum;
        }

        if (rightPathSum > leftPathSum && rightPathSum > currentPathSum) {
            if (debug)
                System.out.println("returning RIGHT Path Sum " + rightPathSum);
            return rightPathSum;
        }

        if (debug)
            System.out.println("returning CURRENT Path Sum " + currentPathSum);
        return currentPathSum;
    }

    public long Problem22() {

        // The Real Values
        String fileName = "c:\\temp\\p022_names.txt";
        int smallSortSize = 333;
        int largeSortSize = 1000;

        // The Test Values
        //String fileName = "c:\\temp\\p022_test.txt";
        //int smallSortSize = 3;
        //int largeSortSize = 5;
        // Checks if small sort size did any work to file
        boolean fileIsSorted1 = false;
        boolean fileIsSorted2 = false;
        // Accepts one line at a time
        String line = "";
        // Sum of char values for single line
        int lineVal = 0;
        // Accumulated values from all lines we have read
        long GrandSumTotal = 0;

        // As long as sorting takes place in either small or large
        // continue calling both sort methods
        while (!fileIsSorted1 && !fileIsSorted2)
        {
            fileIsSorted1 = SortFile(fileName, smallSortSize);
            fileIsSorted2 = SortFile(fileName, largeSortSize);
        }

        // The file is now sorted
        try {
            // Tracking how far nto file we are as we are summing names
            int lineNumber = 0;
            // Read File
            Path readpath = Paths.get(fileName);
            // Getting a handle to the file
            BufferedReader reader = Files.newBufferedReader(readpath);

            // While not at end of file
            while ((line = reader.readLine()) != null) {
                // Increment line number. total lines in file
                lineNumber++;
                // Reset on each new line
                lineVal = 0;
                // Loop through letters in line
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);                    // character A is 64
                    int cValue = Character.valueOf(c) - 64;     // this changes 65 to 1 because A is valued at 1
                    lineVal = lineVal + cValue;                 // add character value to line total
                }
                // Sum total lines
                lineVal = lineVal * lineNumber;// multiply the line total by its position in the file
                // Track entire file
                GrandSumTotal = GrandSumTotal + lineVal;        // add name total to GrandSumTotal
            }

            reader.close();

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        return GrandSumTotal;
    }

    public long Problem28(int size)
    {
        long sum = 1;
        int value = 1;
        int increment = 2;

        while (increment < size)
        {
            for (int i = 0; i < 4; i++) {
                value = value + increment;
                sum = sum + value;
            }
            increment = increment + 2;
        }
        return sum;
    }

    public long Problem29(int a, int b)
    {
        BigInteger p;
        HashMap hash = new HashMap();

        for (int i = 2; i <= a; i++)
        {
            p = BigInteger.valueOf(i);
            for (int j = 2; j <= b; j++)
            {
                p = p.multiply(BigInteger.valueOf(i));
                if (!hash.containsKey(p))
                    hash.put(p, 1);
            }
        }
        long size = hash.size();
        return size;
    }

    public long Problem36(long max)
    {
        long sum = 0;
        boolean numberIsPalandrom = false;
        boolean binaryIsPalandrom = false;
        for (long i = 10; i <= max; i++)
        {
            numberIsPalandrom = IsNumberPalandrom(i);
            binaryIsPalandrom = IsBinaryValuePalandrom(i);
            if (numberIsPalandrom && binaryIsPalandrom) {
                sum = sum + i;
                System.out.println("Both: " + i + "  Sum: " + sum);
            }
        }
        return sum;
    }

    public boolean MyDateCompareDate2Larger(String date1, String date2, String compare)
    {
        // perform error checking
        if (date1.lastIndexOf(",") != date1.lastIndexOf(","))
        {
            System.out.println("too few commas in date1");
            return false;
        }
        if (date2.lastIndexOf(",") != date2.lastIndexOf(","))
        {
            System.out.println("too few commas in date2");
            return false;
        }

        // find value of day in date1
        int positionOfComma = date1.indexOf(",");
        String sDay1 = date1.substring(0, positionOfComma);
        int iDay1 = Integer.parseInt(sDay1);

        // find value of hour in date1
        int start = positionOfComma + 1;
        int end = date1.length();
        String date1NoDay = date1.substring(start, end);
        positionOfComma = date1NoDay.indexOf(",");
        String sHour1 = date1NoDay.substring(0, positionOfComma);
        int iHour1 = Integer.parseInt(sHour1);

        // find value of minute in date1
        start = positionOfComma + 1;
        end = date1NoDay.length();
        String sMinute1 = date1NoDay.substring(start, end);
        int iMinute1 = Integer.parseInt(sMinute1);

        // find value of day in date1
        positionOfComma = date2.indexOf(",");
        String sDay2 = date2.substring(0, positionOfComma);
        int iDay2 = Integer.parseInt(sDay2);

        // find value of hour in date1
        start = positionOfComma + 1;
        end = date2.length();
        String date2NoDay = date2.substring(start, end);
        positionOfComma = date2NoDay.indexOf(",");
        String sHour2 = date2NoDay.substring(0, positionOfComma);
        int iHour2 = Integer.parseInt(sHour2);

        // find value of minute in date1
        start = positionOfComma + 1;
        end = date2NoDay.length();
        String sMinute2 = date2NoDay.substring(start, end);
        int iMinute2 = Integer.parseInt(sMinute2);

        compare = compare.toUpperCase();

        switch (compare) {
            case "DAY":
                if (iDay2 > iDay1)
                    return true;
                break;
            case "HOUR":
                if (iHour2 > iHour1)
                    return true;
                break;
            case "MINUTE":
                if (iMinute2 > iMinute1)
                    return true;
                break;
        }
        return false;
    }

    //*********************************************************************************

    private boolean IsNumberPalandrom(long num)
    {
        boolean isNumberPalandrom = IsPalandrom(Long.toString(num));
        if (isNumberPalandrom)
            System.out.println("number is:" + num);
        return isNumberPalandrom;
    }

    private boolean IsBinaryValuePalandrom(long num)
    {
        BigInteger thebinary = convert(num, 2);
        boolean isBinaryPalandrom = IsPalandrom(thebinary.toString());
        if (isBinaryPalandrom)
            System.out.println("binary is: " + thebinary + " = " + num);
        return isBinaryPalandrom;
    }

    public BigInteger convert(long decimal , long base)
    {
        BigInteger result = BigInteger.ZERO;
        long multiplier = 1;

        while(decimal > 0)
        {
            long residue = decimal % base;
            decimal     = decimal / base;
            BigInteger temp = BigInteger.valueOf(residue * multiplier);
            result      = result.add(temp);
            multiplier  = multiplier * 10;
        }

        //System.out.println ("binary....." + result);
        return result;
    }
    private boolean SortFile(String fileName, int sortRange)
    {
        String tempName = "c:\\temp\\file2.txt";
        Path readpath = Paths.get(fileName);
        Path writepath = Paths.get(tempName);
        boolean fileIsSorted = true;

        try {
            BufferedReader reader = Files.newBufferedReader(readpath);
            BufferedWriter writer = Files.newBufferedWriter(writepath);
            // Value read from input file
            String line = null;
            // Where we are within block 1,2,3,1,2,3...
            int position = 0;
            // Not Used
            int totalcount = 0;
            // Break if you don't have full sort range
            boolean eof = false;

            // outer loop continues to end of file
            while (!eof) {
                // Fills up array with one line from file
                String[] lines = new String[sortRange];
                for (int i = 0; i < sortRange; i++)
                    lines[i] = "ZZZZZZZZZZZZZZZZZ";
                // Track how far we are within block
                position = 0;

                // inner loop handles one block
                while (position < sortRange) {
                    line = reader.readLine();
                    if (line == null) {
                        eof = true;
                        break;
                    }
                    // Read a line save it to array
                    lines[position] = line;
                    position++;
                    totalcount++;
                }

                // now sort the block
                boolean blockIsSorted = ArrayWasAlreadySorted(lines, position);
                if (!blockIsSorted)
                    fileIsSorted = blockIsSorted;
                Arrays.sort(lines);

                // and write the block
                for (int i = 0; i < position; i++) {
                    writer.write(lines[i] + "\r\n");
                }
            }
            reader.close();
            writer.close();

            // Delete the original then rename temp to original, so we ahve the latest updated file
            File originalFile = new File(fileName);
            originalFile.delete();
            File tempFile = new File(tempName);
            tempFile.renameTo(originalFile);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return fileIsSorted;
    }

    private boolean ArrayWasAlreadySorted(String[] names, int range) {
        String[] newnames = names.clone();
        Arrays.sort(newnames);
        for (int i = 0; i < range; i++)
            if (newnames[i] != names[i])
                return false;
        return true;
    }

    private BigInteger factorial(int n)
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i)
            ret = ret.multiply(BigInteger.valueOf(i));

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
        while (p.charAt(left) == p.charAt(right) && (left < mid)) {
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
