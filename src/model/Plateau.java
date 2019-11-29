package model;

import java.util.ArrayList;

public class Plateau {

	
	public int mNombre_ligne;
    public int mNombre_colonne;
	private ArrayList<ArrayList<String>> mPlatO;
	private ArrayList<String> mColonne;
   

    public Plateau (int pnombre_ligne, int pnombre_colonne) 
	{
		
    
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
				
				if(i == 0 && j == 0)
				{
					lColonne.add(0, " X ");
				}
			
				System.out.print(lColonne);
				
				
			}
		
			
		}
		
		
		
		//lColonne.add(i,new String("X"));
		//mPlatO.set(mColonne,"X");
	
	//	ArrayList<ArrayList<String>> lColonne;
		//mPlateau.set(1, "X");
		//lColonne.set(1,"d");
		
	}
    
   
    
    
    
    
    /*public void setCase(int p_index, char p_symbole)
    {
    	mPlatO.add(1, "")
    }*/
    /*public char getCase(){
    	
    	return
    	System.out.println(mPlatO.get(p_index));
    	
    }*/
    
   /* public void setCase() {
    	
    }*/

}	
	
		
		
		
		
		
		
		/*ArrayList<Character> tab2 = new ArrayList<Character>();
		ArrayList<Character> tab3 = new ArrayList<Character>();
		
		plateau.add(' ');
		tab2.add(' ');
		tab3.add(' ');
		
		for (int i=1; i < mnombre_colonne;i++)
		{
			plateau.add(' ');
			tab2.add(' ');
			tab3.add(' ');
		}
		
		
		
		System.out.println(tab1);
		System.out.println(tab2);*/
		//System.out.println(tab3);
		
		
	



