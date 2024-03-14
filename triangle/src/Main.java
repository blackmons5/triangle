import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını giriniz:");
        double a=input.nextDouble();
        System.out.println("Üçgenin ikinci kenarını giriniz:");
        double b=input.nextDouble();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgenin hipotenüsü="+c);
        double u = (a+b+c)/2;
        double cevre= 2*u ;
        System.out.println("Üçgenin çevresi="+cevre);
        double alan=u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı="+alan);

    }
}