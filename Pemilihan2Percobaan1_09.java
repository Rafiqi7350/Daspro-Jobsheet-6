import java.util.Scanner;

public class Pemilihan2Percobaan1_09 {

    public static void main(String[] args) {
        
// input user
        Scanner sc09 = new Scanner(System.in);
        System.out.println("Masukan Tahun :");
        int tahun = sc09.nextInt();

//If else
        if (tahun % 4 == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            }
        } else
        System.out.println("Bukan Tahun Kabisat");
    }
}
