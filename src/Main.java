import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int wylosowanaliczba = (int) (Math.random() * 100 + 1);


        //wczytywanie z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę\n");
        int wpisanaliczba = klawiatura.nextInt();

        // instrukcja warunkowa
        if (wpisanaliczba == wylosowanaliczba) {
            System.out.println("Wygrałeś");
        } else if (wpisanaliczba != wylosowanaliczba) {
            System.out.println("Nie trafiłeś");
        }
        //określić jak duża jest różnica między wyborem a wylosowanym
        //wyrażenie warunkowe != instrukcja warunkowa bo wyrażenie zwraca wartośc
        int roznica = wpisanaliczba > wylosowanaliczba ? //takie {} w ifie
                wpisanaliczba - wylosowanaliczba : // else if
                wylosowanaliczba - wpisanaliczba;
        System.out.println("Pomyłka o " + roznica);
        roznica = roznica / 10;//dzielenie całkowite
        switch (roznica) {
            case 0:
                System.out.println("Bardzo blisko");
                break;
            case 1:
                System.out.println("Blisko");
                break;
            case 2:
                System.out.println("Dosć blisko");
                break;
            case 3:
                System.out.println("Troche niet");
                break;
            default:
                System.out.println("Słabo");

                //wyrażenie switch                                  /////////////zrobić
                for (int i = 0; i < 10; i++) {
                    System.out.println("Podaj liczbę");
                    wpisanaliczba = klawiatura.nextInt();
                    if (wpisanaliczba == wylosowanaliczba) {
                        System.out.println("Wygrana");
                        break;
                    }
                }

                //pętla while

                do{
                    System.out.println("Podaj liczbę");
                    wpisanaliczba = klawiatura.nextInt();

                    if (wpisanaliczba > wylosowanaliczba) {
                        System.out.println("Wpisano za dużo");
                    } else if (wpisanaliczba < wylosowanaliczba) {
                        System.out.println("Wpisano za mało");
                    } else {
                        System.out.println("Wygrałeś");
                    }
                    System.out.println("Podaj liczbę");
                    wpisanaliczba = klawiatura.nextInt();
                }while (wpisanaliczba != wylosowanaliczba);
        }
        //zad 2
        String haslo= "";
        String malelitery="qwertyuiopasdfghjklzxcvbnm";
        String duzelitery="QWERTYUIOPASDFGHJKLZXCVBNM";
        String znakispecjalne = "!@#$%^&*()_+-=[];',./{}:|<>?";
        String cyfry = "1234567890";
        int loshaslo;
        for(int k = 0;k<10;k++) {
            loshaslo = (int) (Math.random() * malelitery.length());
            haslo = haslo + malelitery.charAt(loshaslo);
            loshaslo = (int) (Math.random() * duzelitery.length());
            haslo = haslo + duzelitery.charAt(loshaslo);
            loshaslo = (int) (Math.random() * znakispecjalne.length());
            haslo = haslo + znakispecjalne.charAt(loshaslo);
            loshaslo = (int) (Math.random() * cyfry.length());
            haslo = haslo + cyfry.charAt(loshaslo);
        }
        System.out.println("Wygenerowane hasło " + haslo);
    }
}