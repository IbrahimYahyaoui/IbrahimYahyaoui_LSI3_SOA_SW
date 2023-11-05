package service;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BanqueService
{
	private ArrayList<Compte> comptes= new ArrayList<Compte>();
	/*void addCompte(Compte e)
	{
		comptes.add(e);
		
	}*/
	ArrayList<Compte> getComptes()
	{
		return comptes;
		
	}
	double conversion(double montant)
	{
		return montant*3.3;
	}
	Compte  getCompte(int index)
	{
		return  new Compte(index,0.0, new Date());
		
	}
	

	

}