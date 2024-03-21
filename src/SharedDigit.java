public class SharedDigit {
  public static boolean hasSharedDigit(int first, int second) {
    if ((first < 10 || first > 99) || (second < 10 || second > 99)) return false;

    while (first != 0) {
      int lastDigitFirst = first % 10;
      int lastDigitSecond = second % 10;
      if (lastDigitFirst == lastDigitSecond || lastDigitFirst == second / 10) return true;
      first /= 10;
    }
    return false;
  }
}
