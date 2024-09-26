import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;
        String kategori = " ";
        System.out.println("Masukkan umur");
        umur = sc.nextInt();

        if (umur >= 0  && umur <= 12) {
            kategori = "Anak"; 
        }
        else if (umur >= 13  && umur <= 19) {
            kategori = "Remaja"; 
        }
        else if (umur >= 20  && umur <= 64) {
            kategori = "Dewasa"; 
        }
        else if (umur >=65) {
            kategori = "Lansia"; 
        }
        System.out.println("Kategori: " + kategori);
        sc.close();
    }
}
