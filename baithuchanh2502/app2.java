import java.util.Scanner;

public class app2 {   /*Nhập vào 3 số thực dùng làm số đo 3 cạnh của một tam giác, sau đó xác định xem tam giác tương ứng có tính chất gì: đều, vuông cân, cân, vuông hay thường */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap canh thu nhat a = ");
            float a = scanner.nextInt();
            System.out.print("Nhap canh thu hai b = ");
            float b = scanner.nextInt();
            System.out.print("Nhap canh thu ba c = ");
            float c = scanner.nextInt();
            if( a < b + c && b < a + c && c < a + b)
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b) {
                System.out.println("Day la tam giac vuong");
            }
            else if(a==b && b==c) {
                System.out.println("Day la tam giac deu");
            }
            else if(a==b || a==c || b==c) {
                System.out.println("Day la tam giac can");

            }
            else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) {
                System.out.println("Day la tam giac tu");

            }
            else {
                System.out.println("Day la tam giac nhon");

            }
            else {
                System.out.println("Day khong phai la tam giac");
            }
        }


    }
}
