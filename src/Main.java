import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stanKonta=1000;
        System.out.println("Wprowadź kwotę, jaką chcesz wypłacić");
        int kwota=scanner.nextInt();
        if(kwota>stanKonta){
            System.out.println("Przekroczono limit konta!");
        }
        else{
            System.out.println("Kwota wypłaty: "+kwota);
            System.out.println("Aktualny stan konta: "+(stanKonta-=kwota));
        }

    }
}