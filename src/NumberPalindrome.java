public class NumberPalindrome {
  public static void main(String[] args){
    System.out.println(isPalindrome(-222));

  }
  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int originalNumber = number;


    while (number != 0) {
      int lastDigit = number % 10;
      reverse *= 10;
      reverse += lastDigit;
      number /= 10;
    }

    return originalNumber == reverse;
  }
}
