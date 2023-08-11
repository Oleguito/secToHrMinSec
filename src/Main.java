import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите количество прошедших секунд: ");
        int seconds;
        try {
            seconds = s.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
            return;
        }
        int hours = (seconds - seconds % 3600) / 3600;
        int minutes = ((seconds - hours * 3600) - (seconds - hours * 3600) % 60) / 60;
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + (seconds - hours * 3600 - minutes * 60));
    }
}