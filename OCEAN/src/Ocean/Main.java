package Ocean;
import Ocean.SeaLifeBro.Inventory;
import java.io.Console;
import java.util.Scanner;
import java.lang.Boolean;
public class Main {
    public static void main(String[] args) {
            Ocean.Submarin BONK=new Ocean.Submarin();
            Ocean.SeaLifeBro.Inventory miau=new Ocean.SeaLifeBro.Inventory();
            Boolean m=true;
            Console console = System.console();
            Scanner scanner = new Scanner(console.reader());
            if(console!=null) {
                while(m)
                {
                    System.out.println("Alegeti o optiune\n 1. Afisati adancimea \n 2. Mergeti la suprafata\n 3. Mergeti mai adanc\n 4. Verificati inventarul \n 5. END GAME");


                    int o= scanner.nextInt();
                    switch (o) {
                        case 1: {
                            BONK._revealDepth(BONK._currentDepth);
                        }

                        case 2: {
                            if(BONK._currentDepth==0)
                                System.out.println("Mai sus nu mere");
                            else
                            {
                                BONK._undeeper(BONK._currentDepth);
                                Inventory.main();
                            }
                        }

                        case 3:{
                            if(BONK._currentDepth==BONK._maxDepth)
                                System.out.println("Decat daca ai adus o bormasina uriasa, nu merge mai jos");
                            else
                            {
                                BONK._deeper(BONK._currentDepth);
                                Inventory.main();
                            }
                        }
                        case 4:{
                            System.out.println("Avem "+miau.get_fish()+" pesti");
                            System.out.println("Avem "+miau.get_pearls()+" perle");
                        }
                        case 5: {
                            m=false;
                            break;
                        }
                    }
                }
            }
            else
            {
                System.out.println("Nu exista o consola !");
            }

    }

    }
