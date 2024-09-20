import java.util.Scanner;
public class TugasFaktori {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
int angka,temp=1;
        System.out.println("masukkan angka = ");
        angka = i.nextInt();

        
     for (int j = angka; j >=1; j--) {
        System.out.println(i+"x");
        temp *=j;
        
     }
     System.out.println();
     System.out.println("faktorial = "+temp);
    }
}