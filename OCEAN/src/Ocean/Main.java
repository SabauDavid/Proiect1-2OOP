package Ocean;
import Ocean.SeaLifeBro.Inventory;
import java.io.*;
import java.util.Scanner;
import java.lang.Boolean;

public class Main {

    public static void main(String[] args) {

        Ocean.Submarin BONK=new Ocean.Submarin();
        Ocean.SeaLifeBro.Inventory miau=new Ocean.SeaLifeBro.Inventory();
        Ocean.SeaLifeBro.Water water= new Ocean.SeaLifeBro.Water();
            Scanner scanner = new Scanner(System.in);
            BONK.set_maxDepth(8);
            boolean m=true;
            Console cnsl= System.console();
                while(m)
                {
                    System.out.println("Alegeti o optiune\n 1. Afisati adancimea \n 2. Mergeti la suprafata\n 3. Mergeti mai adanc\n 4. Verificati inventarul \n 5. END GAME");
                    int o= scanner.nextInt();
                    switch (o) {
                        case 1: {
                            BONK._revealDepth(BONK._currentDepth, BONK._getmaxDepth());
                            System.out.println("    ____[]_____,");
                            System.out.println("+--| [] [] []  }");
                            System.out.println("   \\__________} ");
                            break;
                        }

                        case 2: {
                            if (BONK.get_currentDepth() == 0) {
                                System.out.println("Mai sus nu merge");

                            }
                            else
                            {
                                BONK._undeeper(BONK._currentDepth);

                             if(miau.main()==1)
                             miau.set_fish(miau._fish);
                             else if(miau.main()==2)
                                 miau.set_pearls(miau._pearls);
                             else
                                 if(miau.main()==3&&miau.get_fish()!=0)
                                 {
                                     miau.set_sharkbite();
                                     miau.set_sharkbite();
                                     miau.set_sharkbite();
                                 }

                            }

                            break;
                        }

                        case 3:{
                                if(BONK.get_currentDepth()==BONK._getmaxDepth())
                                {
                                   System.out.println("Fundul Oceanului, yay");
                                }
                                else
                                {
                                    BONK._deeper(BONK._currentDepth);
                                    if(miau.main()==1)
                                        miau.set_fish(miau._fish);
                                    else if(miau.main()==2)
                                        miau.set_pearls(miau._pearls);
                                    else
                                        if(miau.main()==3)
                                            miau.set_sharkbite();
                                }

                                break;

                        }
                        case 4:{
                            System.out.println("Avem "+miau.get_fish()+" pesti");
                            System.out.println("Avem "+miau.get_pearls()+" perle");
                            break;
                        }
                        case 5: {
                            m=false;
                            break;
                        }

                    }

                }
            }


    }


