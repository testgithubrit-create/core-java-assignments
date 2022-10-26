import  java.util.Scanner;
public class marks{
    public static void main (String args[]){
        int mark1, mark2, mark3;
        int totalmark;
        double avgmark;
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter marks of three subjects: ");
        mark1 = Scan.nextInt();
        mark2 = Scan.nextInt();
        mark3 = Scan.nextInt();
        totalmark = mark1 + mark2 + mark3;
        avgmark = (double) totalmark/3;
        System.out.println("total mark: " + totalmark);
        System.out.println("average mark: " + Math.round(avgmark));
        Scan.close();
    }
}