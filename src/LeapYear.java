public class LeapYear {
  public static boolean isLeapYear(int year) {
    if ((year < 1) || (year > 9999)) {
      return false;
    }
    boolean isDivisibleByFour = year % 4 == 0;
    boolean isDivisibleByOneHundred = year % 100 == 0;
    boolean isDivisibleByFourHundred = year % 400 == 0;

    if ((isDivisibleByFour && !isDivisibleByOneHundred)
        || (isDivisibleByOneHundred && isDivisibleByFourHundred)) {
      return true;
    } else {
      return false;
    }
  }
}
