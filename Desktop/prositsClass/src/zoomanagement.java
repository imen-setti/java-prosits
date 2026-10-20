import java.util.Scanner;


public class zoomanagement {
    public static void main(String[] args) {
      /* // instruction1
        Integer nbrcages=20;
        String zooname="my zoo";
        System.out.println( zooname +"has "+nbrcages);
        */
        //instruction2

        Scanner sc = new Scanner (System.in); //reads for all

        // read a string
        System.out.println("enter zoo name ");
        String name = sc.nextLine();
        // read an integer
        System.out.println( " enter number of cages ");
        int  nbrcages  = sc.nextInt();

        System.out.println( name +" has " + nbrcages +" cageszoologia");



    }
}