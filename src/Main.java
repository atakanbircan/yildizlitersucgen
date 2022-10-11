import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz: ");
        basamakSayisi=input.nextInt();

        for (int i=0;i<=basamakSayisi;i++){

            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=(2*basamakSayisi)-1;j>=(2*i)+1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}