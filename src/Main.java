import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pay = {234000, 345000, 125432, 342523, 745622};
        int sum = 0;
        for (int i = 0; i < pay.length; i++) {
            sum += pay[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        int min = pay[0];
        int max = pay[0];
        for (int i = 0; i < pay.length; i++) {
            if (pay[i] < min) {
                min = pay[i];
            }
            if (pay[i] > max) {
                max = pay[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();
        float average = 4f;
        System.out.println("Средняя сумма трат за месяц составила " + sum / average + " рублей");
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}