import java.util.Scanner;

public class Siakad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, huruf = " ", kualifikasi = " ";
        char kelas;
        Byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama=sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=sc.nextLine();
        System.out.print("Masukkkan kelas: ");
        kelas=sc.nextLine().charAt(0);
        System.out.print("Masukkan nomer absen: ");
        absen=sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis=sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian=sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

                if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                    huruf = "A";
                    kualifikasi = "Sangat Baik";
                }
                else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                    huruf = "B+";
                    kualifikasi = "Lebih dari Baik";
                }
                else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                    huruf = "B";
                    kualifikasi = "Baik";
                }
                else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                    huruf = "C+";
                    kualifikasi = "Lebih dari Cukup";
                }
                else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                    huruf = "C";
                    kualifikasi = "Cukup";
                }
                else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                    huruf = "D";
                    kualifikasi = "Kurang";
                }
                else if (nilaiAkhir <= 39) {
                    huruf = "E";
                    kualifikasi = "Gagal";
            }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absem: "+ absen);
        System.out.println("Nilai AKhir:" + nilaiAkhir);
        System.out.println("NIlai akhir huruf: " + huruf);
        System.out.println("kualifikasi: " + kualifikasi);
}
}