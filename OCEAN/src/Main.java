
import java.io.Console;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Console console = System.console();
        if(console!=null)
        {
            System.out.println("Alegeti o optiune\n 1. Mergeti mai adanc\n 2. Mergeti la suprafata\n 3. Verificati inventarul");
            Scanner scanner = new Scanner(console.reader());


        }
        else
        {
            System.out.println("Nu exista o consola !");
        }
    }
}