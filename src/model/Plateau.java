package model;

import java.util.ArrayList;

public class Plateau {

	
	public int mNombre_ligne;
    public int mNombre_colonne;
	private ArrayList<ArrayList<String>> mPlatO;
	private ArrayList<String> mColonne;
	protected char m_symbole;
	public String m_choixcase;
	public int m_case;
   

    public Plateau (int pnombre_ligne, int pnombre_colonne) 
	{
		
    //construction du plateau
		ArrayList<ArrayList<String>> mPlateau = new ArrayList<ArrayList<String>>(pnombre_colonne);
		mPlatO = mPlateau;
		
		for (int i=0; i < pnombre_colonne; i++)
		{
			
			System.out.println();
			for (int j=0; j< pnombre_ligne;j++)
			{
				ArrayList<String> lColonne = new ArrayList<String>(pnombre_ligne);
				mColonne = lColonne;
				mPlateau.add(i, lColonne);
				//a une case précise on écrit x en dur
				
				
				if(i == 0 && j == 0)
				{
					lColonne.add(0, " X ");
				}
			
				System.out.print(lColonne);
				
			}
			
		}
		
	}
    
	public int caseUser(String p_choixcase) {
		
		return 1;
	}
	
	public int affectationCase()
	{
		m_case = 0;
		for (int i=0; i < mNombre_colonne; i++)
		{
			for (int j=0; j< mNombre_ligne; j++)
			{
				m_case += 1;
			}
		}
		return m_case;
	}
	
	String.valueOf( m_case );
    
}	
	
		
		
		
	
	



