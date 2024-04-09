import java.util.*;
class grade
{
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        System.out.println("              "+"ENTER MARKS"+"         ");
        System.out.print("ENGLISH:");
        int eng = o.nextInt();
        System.out.print("MATHS:");
        int mat = o.nextInt();
        System.out.print("SCIENCE:");
        int sci = o.nextInt();
        System.out.print("SOCIAL:");
        int soc = o.nextInt();
        System.out.print("TAMIL:");
        int tam = o.nextInt();
        int total = eng + mat + soc + tam + sci;
        System.out.println("TOTAL:" + total);
        int ave = (total / 5);
        System.out.println("AVERAGE:" + ave);
        if (ave >= 90 && ave <= 100) {
            System.out.println("GRADE:A");
        } else if (ave >= 75 && ave < 90) {
            System.out.println("GARDE:B");
        } else if (ave >= 60 && ave < 75) {
            System.out.println("GRADE:C");
        } else if (ave >= 45 && ave < 60) {
            System.out.println("GRADE:D");
        } else {
            System.out.println("FAIL");
        }
    }
    }

