import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("Список A:");
        for (String str : listA) {
            System.out.println(str);
        }

        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("Список B:");
        for (String str : listB) {
            System.out.println(str);
        }

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список C:");
        for (String str : listC) {
            System.out.println(str);
        }

        Collections.sort(listC, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Отсортированный список C:");
        for (String str : listC) {
            System.out.println(str);
        }
    }
}