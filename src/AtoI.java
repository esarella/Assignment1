/*
Please Note:

There are certain questions where the interviewer would intentionally frame the question vague.
The expectation is that you will ask the correct set of clarifications or state your assumptions before you jump into coding.

Implement atoi to convert a string to an integer.

Example :

Input : "9 2704"
Output : 9
Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.

 Questions: Q1. Does string contain whitespace characters before the number?
A. Yes Q2. Can the string have garbage characters after the number?
A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
A. Return 0. Q4. What if the integer overflows?
A. Return INT_MAX if the number is positive, INT_MIN otherwise.
Warning : DO NOT USE LIBRARY FUNCTION FOR ATOI.
If you do, we will disqualify your submission retroactively and give you penalty points.

 */

public class AtoI {
    public int atoi(final String a) {
        String finalString = a;

        if(finalString == null || finalString.length() < 1){
            return 0;
        }

        finalString = finalString.trim();

        char flag = '+';

        int i =0;
        if (finalString.charAt(0) == '-'){
            flag = '-';
            i++;
        }
        else if (finalString.charAt(0) == '+'){
            i++;
        }

        double result = 0;
        while (finalString.length() > i && finalString.charAt(i) >= '0'
                && finalString.charAt(i) <= '9') {
            result = result * 10 + (finalString.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }
}
