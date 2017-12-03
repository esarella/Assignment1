/*

Roman To Integer
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Read more details about roman numerals at Roman Numeric System

Example :

Input : "XIV"
Return : 14
Input : "XX"
Output : 20
 */

public class RomanToInteger {
    public int romanToInt(String s) {
        if (s.startsWith("M")) {
            return 1000 + romanToInt(s.substring(1));
        } else if (s.startsWith("CM")) {
            return 900 + romanToInt(s.substring(2));
        } else if (s.startsWith("D")) {
            return 500 + romanToInt(s.substring(1));
        } else if (s.startsWith("CD")) {
            return 400 + romanToInt(s.substring(2));
        } else if (s.startsWith("C")) {
            return 100 + romanToInt(s.substring(1));
        } else if (s.startsWith("XC")) {
            return 90 + romanToInt(s.substring(2));
        } else if (s.startsWith("L")) {
            return 50 + romanToInt(s.substring(1));
        } else if (s.startsWith("XL")) {
            return 40 + romanToInt(s.substring(2));
        } else if (s.startsWith("X")) {
            return 10 + romanToInt(s.substring(1));
        } else if (s.startsWith("IX")) {
            return 9 + romanToInt(s.substring(2));
        } else if (s.startsWith("V")) {
            return 5 + romanToInt(s.substring(1));
        } else if (s.startsWith("IV")) {
            return 4 + romanToInt(s.substring(2));
        } else if (s.startsWith("I")) {
            return 1 + romanToInt(s.substring(1));
        } else if (s.equals("")) {
            return 0;
        } else {
            return 0;
        }
    }
}
