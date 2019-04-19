package dev.tnordquist;

/**
 * CodingBat: Given a non-negative int n, compute recursively (no loops) the count of the
 * occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts
 * double, so 8818 yields 4.
 */

public class Count8 {

  private static int count8(int n) {
    int num8;
    if (n == 0) {
      return 0;
    } else {
      num8 = 0;
      if (n % 10 == 8 && n % 100 == 88) {
        num8 = 2;
        n = n / 10;
      } else if (n % 10 == 8) {
        num8 = 1;
        n = n / 10;
      } else {
        n = n / 10;
      }
      int result = count8(n);
      return result + num8;
    }
  }

  public static void main(String[] args) {

    count8(8818);

  }

}
