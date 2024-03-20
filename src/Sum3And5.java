public class Sum3And5 {
    public static void main(String[] args){
        int sum = 0;
        int count = 5;
        for(int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i + " is divisible by 3 and 5.");
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.println("The sum of all numbers is " + sum);
    }
}
