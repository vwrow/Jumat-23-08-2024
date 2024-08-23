import java.util.Scanner;

public class Studenttesser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = input.nextLine();
        System.out.println("Absen: ");
        int absen = input.nextInt();
        System.out.println("IPK: ");
        Double ipk = input.nextDouble();
        
        Student Tegar = new Student();
        Student Reva = new Student();
        Student Moreno = new Student();
        Student Raihan = new Student();
        Student Willy = new Student();
        Student Naufal = new Student(28, "Naufal", 7.9);
        Student Ryuci = new Student(absen, nama, ipk);

        Tegar.nama = "Lanang Tegar Cahyo Islam";
        Tegar.absen = 16;
        Tegar.ipk = 8.0;

        Reva.nama = "Esya Zachreva Althafamy";
        Reva.absen = 9;
        Reva.ipk = 7.9;

        Moreno.nama = "Moreno Rizqieta Jauza";
        Moreno.absen = 24;
        Moreno.ipk = 7.8;

        Raihan.nama = "Faatihah Ahmad Raihan Ilmihi";
        Raihan.absen = 11;
        Raihan.ipk = 8.3;

        Willy.nama = "Willy Inovem Marwinata";
        Willy.absen = 35;
        Willy.ipk = 8.2;

        System.out.println("Nama: "+Tegar.nama);
        System.out.println("Absen: "+Tegar.absen);
        System.out.println("Nilai: "+Tegar.ipk);
        System.out.println("    ");
        System.out.println("Nama: "+Reva.nama);
        System.out.println("Absen: "+Reva.absen);
        System.out.println("Nilai: "+Reva.ipk);
        System.out.println("    ");
        System.out.println("Nama: "+Moreno.nama);
        System.out.println("Absen: "+Moreno.absen);
        System.out.println("Nilai: "+Moreno.ipk);
        System.out.println("    ");
        System.out.println("Nama: "+Raihan.nama);
        System.out.println("Absen: "+Raihan.absen);
        System.out.println("Nilai: "+Raihan.ipk);
        System.out.println("    ");
        System.out.println("Nama: "+Willy.nama);
        System.out.println("Absen: "+Willy.absen);
        System.out.println("Nilai: "+Willy.ipk);
        System.out.println("    ");
        Naufal.print();
        System.out.println(" ");
        Ryuci.print();

        input.close();
    }
    
}
