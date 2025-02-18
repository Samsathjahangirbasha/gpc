package gpc;
import java.util.Scanner;
class authentication
{
	public void user(int cardno,int pin) throws invalidcardexception,invalidpinexception
	{
		int c=0;
		int p=0;
		int temp1=cardno;
		while(temp1>0){
			temp1=temp1/10;
			c++;
		}
		if(c!=8) {
			throw new invalidcardexception("please enter 8 digit");
		}
		else {
			System.out.println("card number:"+cardno);
		}
		int temp2=pin;
		while(temp2>0) {
			temp2=temp2/10;
			p++;
		}
		if(p!=4) {
			throw new invalidcardexception("please enter 4 digit");
		}
		else {
			System.out.println("pin:"+pin);
		}
	}
}
class invalidcardexception extends Exception
{
	invalidcardexception(String s){
		super(s);
	}
}
class invalidpinexception extends Exception
{
	invalidpinexception(String s){
		super(s);
	}
}
class negativeamountexception extends Exception
{
	negativeamountexception(String s){
		super(s);
	}
}
class insufficientfundexception extends Exception
{
	insufficientfundexception(int s){
		super(String.valueOf(s));
	}
}
class transactionprocess{
	public void process(int withdrawal,int balance) throws insufficientfundexception,negativeamountexception{
		if(withdrawal>balance) {
			throw new insufficientfundexception(balance);
		}
		else if(withdrawal<0){
			throw new negativeamountexception("please enter a positive integer");
		}
		else
		{
			balance=balance-withdrawal;
			System.out.println("balance:"+balance);
		}
	}
}
public class exceptionalhand {
    public static void main(String[] args)
	{
		int balance=600;
		Scanner sc=new Scanner(System.in);
		authentication a=new authentication();
		transactionprocess t=new transactionprocess();
		System.out.println("enter 8 digit cardno:");
		int cardno=sc.nextInt();
		System.out.println("enter 4 digit cardno:");
		int pin=sc.nextInt();
		System.out.println("enter withdrawal amount:");
		int withdrawal=sc.nextInt();
		try
		{
			a.user(cardno, pin);
			t.process(withdrawal, balance);
		}
		catch(invalidcardexception e) {
			System.out.println(e);
		}
		catch(invalidpinexception e) {
			System.out.println(e);
		}
		catch(insufficientfundexception e) {
			System.out.println(e);
		}
		catch(negativeamountexception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("program executed sucessfully");
		}
        sc.close();
	}
    
}
