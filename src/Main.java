public class Main {
  public static void main(String[] args) {
    int highSchore = 50;

    if (highSchore > 25) {
      highSchore = 1000 + highSchore;
    }

    int health = 100;
    if ((health < 25) && (highSchore > 1000)) {
      highSchore = highSchore - 1000;
    }
  }
}
