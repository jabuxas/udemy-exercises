public class IntEqualityPrinter {
  public static void printEqual(int first, int second, int third) {
    if (first < 0 || second < 0 || third < 0) {
      System.out.println("Invalid Value");
      return;
    }

    if (first == second && second == third) {
      System.out.println("All numbers are equal");
    } else if (second == third) {
      System.out.println("Neither all are equal or different");
    } else if (first == second) {
      System.out.println("Neither all are equal or different");
    } else if (first == third) {
      System.out.println("Neither all are equal or different");
    } else {
      System.out.println("All numbers are different");
    }
  }
}
