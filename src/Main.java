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

    }
}