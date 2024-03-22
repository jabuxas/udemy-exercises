public class NumberToWords {
  public static void main(String[] args) {
    numberToWords(100000);
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
      return;
    }

    if (number == 0) {
      System.out.println("Zero");
      return;
    }
    int reverse = 0;
    while (number > 0) {
      reverse += number % 10;
      if (number > 10) {
        reverse *= 10;
      }
      number /= 10;
    }

    while (reverse != 0) {
      int lastDigit = reverse % 10;
      switch (lastDigit) {
        case 0 -> System.out.println("Zero");
        case 1 -> System.out.println("One");
        case 2 -> System.out.println("Two");
        case 3 -> System.out.println("Three");
        case 4 -> System.out.println("Four");
        case 5 -> System.out.println("Five");
        case 6 -> System.out.println("Six");
        case 7 -> System.out.println("Seven");
        case 8 -> System.out.println("Eight");
        case 9 -> System.out.println("Nine");
      }
      reverse /= 10;
    }
  }
}
