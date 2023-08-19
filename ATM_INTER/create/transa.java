package create;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Date;
public class transa {
    Scanner ob = new Scanner(System.in);
    public List<Integer> amt=new ArrayList <Integer>();
    public List<String> type=new ArrayList<String>();
    public List<Integer> newbal=new ArrayList<Integer>();
    public int amtpos=0;
    public void transhist(){
        System.out.println("SL.NO \t AMOUNT \t TRANSACTION TYPE \t CLOSING BALANCE");
        for(int i=0;i<this.amtpos;i++){
            System.out.println((i+1)+"\t\t"+this.amt.get(i)+"\t\t\t"+this.type.get(i)+"\t\t\t\t"+this.newbal.get(i));
        }
    }
    public void addrec(int a,int b,String c){
        this.amt.add(a);
        this.newbal.add(b);
        this.type.add(c);
        this.amtpos=amtpos+1;
    }
    public int withdraw(int bal) {
        System.out.println("ENTER AMOUNT TO BE WITHDRAWED");
        int amt = ob.nextInt();
        System.out.println("AMOUNT WITHDRAWED SUCCESSFULLY");
        bal = bal - amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt,bal,"DEBIT");
        return bal;
    }
    public int deposit(int bal) {
        System.out.println("ENTER AMOUNT TO BE DEPOSITED");
        int amt = ob.nextInt();
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        bal = bal + amt;
        System.out.println("UPDATED BALANCE IS " + bal);
        addrec(amt,bal,"CREDIT");
        return bal;
    }
    public static void main(String[] args) {
    }
}