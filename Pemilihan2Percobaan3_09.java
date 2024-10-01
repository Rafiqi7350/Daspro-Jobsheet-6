import java.util.Scanner;

public class Pemilihan2Percobaan3_09 {
    
    public static void main(String[] args) {
        
//Deklarasi
        Scanner sc09 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak= 0;

//input user
        System.out.println(" 1. Pekerja     2. Pembisnis");
        System.out.println("Masukkan Kategori : ");
        kategori = sc09.nextLine();
        System.out.println("Masukkan besarnya penghasilan : ");
        penghasilan = sc09.nextInt();

// If else
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;

            } else if (penghasilan <= 3000000) {
                pajak = 0.15;

            } else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);          
        } else if (kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori Salah");

    }
}
