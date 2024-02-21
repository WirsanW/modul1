import java.util.Scanner;
public class codelab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        char kelamin;
        String tanggal;

        System.out.print("Nama    :");
        nama = input.nextLine();
        System.out.print("Kelamin (P/L)   :");
        kelamin = input.next().charAt(0);
        input.nextLine();
        System.out.print("Tanggal Lahir(dd/mm/yyyy)   :");
        tanggal = input.nextLine();

        if (kelamin == 'p'){
            System.out.println("Nama    :"+nama);
            System.out.println("Kelamin     :Perempuan");
            System.out.println("Tanggal Lahir   :"+tanggal);
        }
        else if (kelamin == 'l'){
            System.out.println("Nama    :"+nama);
            System.out.println("Kelamin     :Laki-Laki");
            System.out.println("Tanggal Lahir   :"+tanggal);
        }


    }
}
