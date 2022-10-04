import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args)
    {
        int ct;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The number entered by the user is: "+num);
    }
    */
    public static void main(String[] args) {
        int ct;
        float sum = 0, ma;
        Scanner sc1;
        sc1 = new Scanner(System.in);

        System.out.println("Wie viele Elemente"); //scriem la inceput nr de elemente
        ct = sc1.nextInt();

        System.out.println("Nummer von Elemente" + ct); //se scrie cate elemente sunt
        int i;
        for (i = 0; i < ct; i++) {
            sum += sc1.nextInt(); //se adauga pe rand fiecare element la suma
        }
        ma = sum / ct; //media aritmetica

        System.out.println("MA = " + ma);
    }


}