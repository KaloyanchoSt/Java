/**
 * Created by kokolaptop on 10/10/2016.
 */
import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter how many rows do you want: ");
        Integer numberOfLines= reader.nextInt();
        triangleOfAlphabets(numberOfLines);
    }

    private static void triangleOfAlphabets(Integer numberOfLines) {
        upperRows(numberOfLines);
        lowerRows(numberOfLines);
    }

    private static void lowerRows(Integer numberOfLines) {
        for (int i = numberOfLines - 1; i > 0 ; i--) {
            printLineOfAlphabets(i);
        }
    }

    private static void upperRows(int numberOfLines) {
        for (int i = 1; i <= numberOfLines; i++) {
            printLineOfAlphabets(i);
        }
    }

    private static void printLineOfAlphabets(int i) {
        for (char c = 'a'; c < 'a' + i ; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}