public class FirstLastDigitSum {
  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) return -1;
    int originalNum = number;

    int lastDigit = 0;
    while (number != 0) {
      lastDigit = number % 10;
      number /= 10;
    }

    return (originalNum % 10) + lastDigit;
  }
}
