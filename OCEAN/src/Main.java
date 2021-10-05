
import java.io.Console;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Console console = System.console();
        if(console!=null)
        {
            console.writer().println("Nu exista o consola !");
            Scanner scanner = new Scanner(console.reader());
            System.out.println("Alegeti o optiune");
        }
        else
        {
            System.out.println("Nu exista o consola !");
        }
    }
}