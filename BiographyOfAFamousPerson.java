
package biography.of.a.famousperson;

import java.util.Scanner;

public class BiographyOfAFamousPerson {

    public static void main(String[] args) {
       int num;
       
       Scanner scanner;
       scanner = new Scanner(System.in);
       
       System.out.print("Name: ");
       String name = scanner.nextLine();
       
       System.out.print("Birth Year: ");
       int by = scanner.nextInt();
       
       System.out.print("Nationality: ");
       String n = scanner.nextLine();
       scanner.nextLine();
       
       System.out.print("Occupation: ");
       String occ = scanner.nextLine();
        
       System.out.print("Notable Achievements: ");
       String na = scanner.nextLine();
       
       System.out.print("Age at First Major Success: ");
       int fms = scanner.nextInt();
       
       System.out.print("Awards Won: ");
       int aw = scanner.nextInt();
       
       System.out.print("Death Year: ");
       int dy = scanner.nextInt();
       
       System.out.print("Net Worth: ");
       String nw = scanner.nextLine();
       
       scanner.nextLine();
       System.out.print("Famous Qoute: ");
       String fq = scanner.nextLine();
       
       
       
    }
    
}
