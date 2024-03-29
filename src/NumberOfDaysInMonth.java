public class NumberOfDaysInMonth {
  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) return -1;
    if (year < 1 || year > 9999) return -1;

    boolean leap = LeapYear.isLeapYear(year);

    if (leap) {
      return switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 2 -> 29;
        case 4, 6, 9, 11 -> 30;
        default -> 0;
      };
    } else {
      return switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 2 -> 28;
        case 4, 6, 9, 11 -> 30;
        default -> 0;
      };
    }
  }
}
