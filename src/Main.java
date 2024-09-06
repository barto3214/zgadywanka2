import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int wylosowanaliczba = (int) (Math.random()*100+1);
        System.out.println(wylosowanaliczba);


        //wczytywanie z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę\n");
        int wpisanaliczba = klawiatura.nextInt();

        // instrukcja warunkowa
        if(wpisanaliczba == wylosowanaliczba){
            System.out.println("Wygrałeś");
        } else if (wpisanaliczba != wylosowanaliczba) {
            System.out.println("Nie trafiłeś");
        }
        //określić jak duża jest różnica między wyborem a wylosowanym
        //wyrażenie warunkowe != instrukcja warunkowa bo wyrażenie zwraca wartośc
        int roznica = wpisanaliczba>wylosowanaliczba ? //takie {} w ifie
                wpisanaliczba - wylosowanaliczba: // else if
                wylosowanaliczba-wpisanaliczba;
        System.out.println("Pomyłka o "+ roznica);
        roznica = roznica/10;//dzielenie całkowite
        switch (roznica){
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
        }
    }
}