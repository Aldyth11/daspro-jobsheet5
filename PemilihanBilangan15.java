import java.util.Scanner;

public class PemilihanBilangan15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Masukkan sebuah angka: ");
       int angka = sc.nextInt();

    //    if (angka % 2 == 0) 
    //    {
    //     System.out.println("Angka " + angka + " termasuk bilangan genap");
    //    }
    //    else 
    //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");

        String hasil = angka % 2 == 0 ? "bilangan genap" : "bilangan ganjil";
        System.out.println(hasil);
    }
    
}