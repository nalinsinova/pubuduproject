import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader3000 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\nalins_inova\\Documents\\nalin.txt");
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
    }
}