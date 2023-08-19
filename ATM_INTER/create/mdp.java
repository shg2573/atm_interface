package create;
import java.util.*;
public class mdp{
    Scanner mc=new Scanner(System.in);
    transa ob=new transa();
    public int choice(String nam,String  acc,int bala){
        int n=1;
        while(n == 1){
            System.out.println("PRESS 1 FOR INFO");
            System.out.println("PRESS 2 FOR TRANSACTION HISTORY");
            System.out.println("PRESS 3 FOR WITHDRAWAL");
            System.out.println("PRESS 4 FOR DEPOSIT");
            System.out.println("PRESS 5 TO EXIST");
            int ch= mc.nextInt();
            int nbal;
            System.out.println("-----------------------------------------------------");
            switch(ch){
                case 1:
                    System.out.println("USER NAME IS :"+nam);
                    System.out.println("USER ACCOUNT NUMBER  IS :"+acc);
                    System.out.println("USER ACCOUNT BALANCE IS :"+bala);
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    ob.transhist();
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3:
                    nbal=ob.withdraw(bala);
                    bala=nbal;
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    nbal=ob.deposit(bala);
                    bala=nbal;
                    System.out.println("-----------------------------------------------------");
                    break;
                default:
                    System.out.println("TRANSACTION COMPLETED");
                    System.out.println("-----------------------------------------------------");
                    n=0;
            }
        }
        return(bala);
    }
    public static void main(String[] args) {
    }
}