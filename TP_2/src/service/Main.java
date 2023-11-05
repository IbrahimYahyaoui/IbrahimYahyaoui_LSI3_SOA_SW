package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		BanqueService ser =new BanqueService();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("donner un MOntant:\n");
		double TND =scan.nextDouble();
		System.out.println("le montant avant le conversion ="+TND);
		
		double  Euro =ser.conversion(TND);
	
		System.out.println("\nle montant aprés le conversion ="+Euro);
		/*ser.addCompte(new Compte(100,5000.0,"15/10/2023"));
		ser.addCompte(new Compte(101,6000.0,"15/10/2023"));
		ser.addCompte(new Compte(102,1000.0,"15/10/2023"));*/
		Compte C1 =ser.getCompte(103);
		//ser.addCompte(C1);
		
		//System.out.println(ser.getCompte(1));
		ArrayList<Compte> comptes1= ser.getComptes();
		for(int i=0;i<comptes1.size();i++)
		{
			System.out.println("Le Compte "+i+":\nCode:"+ comptes1.get(i).getCode()+"\nSolde:"+comptes1.get(i).getSolde()+
					"\nDate de Creation:"+comptes1.get(i).getDateCreation()+"\n");
		}
		
		
		//System.out.println( new Date());
		

	}

}