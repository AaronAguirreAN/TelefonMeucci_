import java.util.Scanner;

public class TelefonMeucci {

    private static int opcions;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Posa un numero de telefon MAX 20 caracters");
        String telefon = sc.nextLine();

        int resultat = comprova(telefon, opcions);

        System.out.println(resultat);
    }



    public static int comprova(String telefon, int opcions){


        if (telefon.contains("X")) {
            opcions ++;
        }
        if (telefon.contains("I")) {
            opcions ++;
        }
        if (telefon.contains("II")) {
            opcions ++;
        }
        if (telefon.contains("III")) {
            opcions ++;
        }
        if (telefon.contains("IV")) {
            opcions ++;
        }
        if (telefon.contains("V")) {
            opcions ++;
        }
        if (telefon.contains("VI")) {
            opcions ++;
        }
        if (telefon.contains("VII")) {
            opcions ++;
        }
        if (telefon.contains("VIII")) {
            opcions ++;
        }
        if (telefon.contains("IX")) {
            opcions ++;
        }

        return opcions;
    }

}