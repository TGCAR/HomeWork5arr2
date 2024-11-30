import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pay = {234000, 345000, 125432, 342523, 745622};
        System.out.println();
        System.out.println("Task 1");
        int sum = Arrays.stream(pay).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Task 2");
        int min = pay[0];
        int max = pay[0];
        {
            int i = 0;
            while (i < pay.length) {
                if (pay[i] < min) {
                    min = pay[i];
                }
                if (pay[i] > max) {
                    max = pay[i];
                }
                i++;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();
        System.out.println("Task 3");
        float average = 4f;
        System.out.println("Средняя сумма трат за месяц составила " + sum / average + " рублей");
        System.out.println();
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}