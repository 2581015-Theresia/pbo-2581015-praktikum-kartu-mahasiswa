import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Data 1: NIK
        System.out.print("NIK (16 digit) :");
        long nik = scanner.nextLong();

        //Dta 2: Umur
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



    }
}