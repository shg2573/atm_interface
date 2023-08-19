import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import create.*;
import java.io.BufferedWriter;

class info{
    private String name,accno,add,phno,uid;
    private int pin;
    public void set(){
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER NAME: ");
        this.name=ob.nextLine();
        System.out.print("ENTER ADDRESS: ");
        this.add=ob.nextLine();
        System.out.print("ENTER PHONE NUMBER: ");
        this.phno=ob.nextLine();
        System.out.print("SET YOUR USER ID: ");
        this.uid=ob.nextLine();
        System.out.print("SET YOUR USER PIN: ");
        this.pin=ob.nextInt();
        this.accno="00321010069";
        BufferedWriter wr=new BufferedWriter(new FileWriter(userid.txt,true));
        String text=name+","+phno+","+pin;
        try {
            wr.write("*"+text+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int getPin() {
        return pin;
    }
    public String getUid() {
        return uid;
    }
    public String getName() {
        return name;
    }
    public String getAccno() {
        return accno;
    }
}
public class newatm{
    public static String getuid(){
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER USER ID :");
        String s= ob.nextLine();
        return s;
    }
    public static int getpin(){
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER PIN :");
        int s= ob.nextInt();
        return s;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        create.mdp ob1=new mdp();
        info ob2=new info();
        System.out.println("----------------------------------------------------------------");
        System.out.println("WELCOME TO SBI BANK");
        System.out.println("PLEASE ENTER THE FOLLOWING DETAILS TO CREATE AN ACCOUNT");
        System.out.println("----------------------------------------------------------------");
        ob2.set();
        System.out.println("----------------------------------------------------------------");
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        System.out.println("----------------------------------------------------------------");
        System.out.println("ENTER 1 FOR BANKING PROCESS ELSE PRESS ANY KEY");
        int n=ob.nextInt();
        System.out.println("----------------------------------------------------------------");
        String uid3;
        int pn;
        if(n==1) {
            uid3= getuid();
            pn=getpin();
            if (pn==ob2.getPin() &&  uid3.equals(ob2.getUid())){
                System.out.println("-----------------------------------------------------");
                System.out.println("WELCOME "+ob2.getName());
                System.out.println("----------------------------------------------------------------");
                ob1.choice(ob2.getName(), ob2.getAccno(), 0);
        }}
        else System.out.println("thank you");
    }
}
 