import java.util.Scanner;

public class Pemilihan2Percobaan2_09 {
    
    public static void main(String[] args) {

//deklarasi
    Scanner sc09 = new Scanner(System.in);
    float diskon = 0;
    float harga = 0;
    float total_bayar;
    
//tampilan menu
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");

//input pilihan
        int pilihan_menu = sc09.nextInt(); 
        sc09.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        String member = sc09.nextLine();
        System.out.println("-------------------------------------");

// If else struktur pertama
    if (member.equalsIgnoreCase("y")) { //menggunakan equalsignorecas untuk membandingkan string
        diskon = 0.10f;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
            
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
    // Mengitung total bayar setelah diskon
            System.out.println("=============================================");
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar anda setelah diskon = " + total_bayar);
        
    }

// If else struktur kedua
    else if (member.equalsIgnoreCase("n")) {
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
    // Menghitung total bayar tanpa diskon
            System.out.println("-----------------------------------");
            System.out.println(("Total bayar anda adalah = ") + harga );

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

    } else {
        System.out.println("Member tidak valid");
    }
    }
}
