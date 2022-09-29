
import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.println(" 1. Add number ");
            String a = "1";
            System.out.println("2. Remove number  ");
            String b = "2";
            System.out.println("3. Display numbers ");
            String c = "3";
            System.out.println("4. Clear numbers ");
            String d = "4";
            System.out.println("5. Exit ");
            String e = "5";
            System.out.println("=============================================");
            System.out.println("Choose a number: ");
            int choice = sc.nextInt();
            

    switch (choice) {

      case 1:
        ArrayList<Integer> num = new ArrayList<Integer>();
                System.out.println("Add a number to a 1st list: ");
                int num1 = sc.nextInt();
                System.out.println("Add a number to a 2nd list: ");
                int num2 = sc.nextInt();
                System.out.println("Add a number to a 3rd list: ");
                int num3 = sc.nextInt();
                System.out.println("Add a number to a 4th list: ");
                int num4 = sc.nextInt();
                
                if (num1 < 0 || num2 < 0 || num3 < 0 ||num4 < 0){
                    System.out.println("The number you enter in negative.");
                    
                }else{
                    num.add(num1);
                    num.add(num2);
                    num.add(num3);
                    num.add(num4);
                    System.out.println(num);
                }
        break;

      case 2:
        ArrayList<Integer> rem = new ArrayList<Integer>();
                System.out.println("[100, 200, 300, 400]");
                System.out.println("Remove the number on the list (use the number 0-2): ");
                int rem1 = sc.nextInt();
                
                if (rem1 < 0 ){
                    System.out.println("The number you enter in negative.");
                    
                }else{
                    rem.add(100);
                    rem.add(200);
                    rem.add(300);
                    rem.add(400);
        
                    rem.remove(rem1);
                    System.out.println("Remaining numbers: "+rem);
                }
        break;

      case 3:
        ArrayList<Integer> dis = new ArrayList<Integer>();
                System.out.println("[100, 200, 300, 400]");
                System.out.print("Enter number to add: ");
                int dis1 = sc.nextInt();
                dis.add(100);
                dis.add(200);
                dis.add(300);
                dis.add(400);
                
                dis.add(4, dis1);
                for (Integer n:dis){
                    System.out.println(n);
                }
        break;

      case 4:
        ArrayList<Integer> cle = new ArrayList<Integer>();
            System.out.println("Enter 1st number: ");
            int aa = sc.nextInt();
            System.out.println("Enter 2nd number: ");
            int bb = sc.nextInt();
            System.out.println("Enter 3rd number: ");
            int cc = sc.nextInt();
            System.out.println("Enter 4th number: ");
            int dd = sc.nextInt();
                cle.add(aa);
                cle.add(bb);
                cle.add(cc);
                cle.add(dd);
                
                System.out.println("Initial list: "+cle);
                cle.clear();
                System.out.println("Cleared contents: "+cle);
        break;
      
      default:
        System.out.println("Bye!");
        System.exit(0);
        

    }
  }
}
