import java.util.Scanner;
public class EmployeeTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String nama, unit, domisili;
        int id;

        System.out.println("Nama: ");
        nama = input.nextLine();
        System.out.println("Unit: ");
        unit = input.nextLine();
        System.out.println("Domisili:");
        domisili = input.nextLine();
        System.out.println("ID: ");
        id = input.nextInt();

        Employe Asep = new Employe(21, "Asep", "Administrator", "Jember");
        Employe Budi = new Employe(13, "Budi", "Head Developer", "Trenggalek");
        Employe Jon = new Employe(89, "Jon", "Janitor", "Malang");
        Employe Yono = new Employe(41, "Yono", "Maintenance", "Sidoarjo");
        Employe Pri = new Employe(75, "Pri", "Security", "Sidoarjo");
        Employe Space = new Employe(0, " ", " ", " ");
        Employe Atok = new Employe(id, nama, unit, domisili);

        

        Asep.outPrint();
        Space.spacePrint();
        Budi.outPrint();
        Space.spacePrint();
        Jon.outPrint();
        Space.spacePrint();
        Yono.outPrint();
        Space.spacePrint();
        Pri.outPrint();
        Space.spacePrint();
        Atok.outPrint();
         
        input.close();
    }
}
