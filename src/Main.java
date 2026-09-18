import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Data 1: NIK
        System.out.print("NIK (16 digit) :");
        long nik = scanner.nextLong();

        //Data 2: Umur
        System.out.print("Umur           :");
        int umur = scanner.nextInt();

        //Data 3: Tinggi badan
        System.out.print("Tinggi badan (cm):");
        double tinggiBadan = scanner.nextDouble();

        //Data 4: Golonogan darah
        System.out.print("Golongan darah   :");
        char golonganDarah = scanner.next().charAt(0);

        // Data 5: Status menikah
        System.out.print("Sudah menikah   : ");
        boolean sudahMenikah = scanner.nextBoolean();

        //Data 6: Nama lengkap
        System.out.print("Nama lengkap    :");
        String namaLengkap = scanner.nextLine();

        //Menampilkan Kartu Mahasiswa
        System.out.println();
        System.out.println("======== KARTU MAHASISWA ========");
        System.out.println("Nama         :" + namaLengkap);
        System.out.println("NIK          :" + nik);
        System.out.println("Umur         :" + umur);
        System.out.println("Tinggi       :" + tinggiBadan);
        System.out.println("Gol darah    :" + golonganDarah);
        System.out.println("Menikah      :" + sudahMenikah);

        scanner.close();


    }
}