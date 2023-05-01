import java.util.Scanner;

public class kombinasyonOdev {
    public static void main(String[] args) {

        int n, r, kombinasyon;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        n = input.nextInt();

        System.out.print("2. sayıyı giriniz :");
        r = input.nextInt();

        int totaln = 1;
        int totalr = 1;
        int fark = n - r;
        int komb = 1;

        for (int i =1; i<= n; i++ ){
            totaln = totaln*i;
        }

        for (int i=1; i<= r; i++ ){
            totalr = totalr*i;
        }

        for (int i=1; i<=fark; i++){
            komb = komb*i;
        }

        kombinasyon = totaln / (totalr*fark);

        System.out.println("kombinasyonunuz : "+ kombinasyon);


    }

}
