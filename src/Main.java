public class Main {
    public static void main(String[] args) {
        int balance = 858;
        int sum = 1542;
        int bonus = 0;
        if (sum > 1000) {


            bonus = (sum / 100);
        }
        int total = balance + sum + bonus;
        System.out.println(bonus);
    }
}
