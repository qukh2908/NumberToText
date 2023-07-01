import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    private static String bachuso(int n) {
        String kyso[] = {"Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam","Chin"};
        String s = "";
        int donvi, chuc, tram; 
        donvi = n%10;
        n = n/10;
        chuc = n%10;
        tram = n/10;

        if(tram>0) {
            s += " " + kyso[tram] + " Tram";
        }

        if(chuc>0){
            if(chuc==1) {
                s += " Muoi";
            } else {
                s += " " + kyso[chuc] + " Muoi";
            }
        }

        if(donvi>0) {
            if(chuc==0 && tram!=0) {
                s += " Le";
            }
            if(donvi==1) {
                s += " Mot";
            } else if(donvi==5 && (chuc!=0 || tram!=0)) {
                s += " Lam";
            } else if(donvi==5 && (chuc==0 || tram!=0)) {
                s += " Nam";
            } else {
                s += " " + kyso[donvi];
            }
        }

        return s;
    } 

    public static void main(String[] args) throws Exception {
        int n;
        int ngan, trieu, ty, donvi;

        System.out.print("Nhap mot so: ");
        n = scanner.nextInt();

        System.out.println(n + " Doc la: ");

        if(n==0) {  
            System.out.println("Khong");
        } else {
            donvi = n % 1000;
            n /= 1000;
            ngan = n % 1000;
            n /= 1000;
            trieu = n % 1000;
            ty = n / 1000;

            if(ty>0) {
                System.out.print(bachuso(ty) + " Ty");
            } if(trieu>0) {
                System.out.print(bachuso(trieu) + " Trieu");
            } if(ngan>0) {
                System.out.print(bachuso(ngan) + " Ngan");
            } if(donvi>0) {
                System.out.print(bachuso(donvi));
            }
        }
    }
}
