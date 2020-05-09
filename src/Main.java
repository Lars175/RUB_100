public class Main {
    public static void main(String[] args) {
        int payment = 10010;
        int bonus;
        if (payment >= 1001) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Поздравлем! Ваш бонусный баланс = " + bonus);
    }
}