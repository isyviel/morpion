package model;

public class Case {

	public int m_position_x;
	public int m_position_y;
	
	//TODO faire le lien avec le symbole du joueur
	public String m_symbole;
	
	/*public String getCase() {
		Plateau case1 = new Plateau.tab1[0];
		
	};*/
	
	public Case()
	{
		m_position_x = Plateau.get(j);
		m_position_y = Plateau.get(i);
	};   
	
	
	public String remplirCase() {
		
		
		
		return "X";
	}
	
	
}
