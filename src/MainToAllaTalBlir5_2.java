import javax.swing.*;
public class MainToAllaTalBlir5_2 {

	public static void main(String[] args) {
		

		AllaTalBlir5_2 allaTal = new AllaTalBlir5_2();

		String ursprungsTal = JOptionPane.showInputDialog ("Skriv ett tal.");
		int tal = Integer.parseInt(ursprungsTal);
		

		JOptionPane.showMessageDialog(null, "Nu ska jag räkna ut en cool grej. \nVänta så ska du få se...");
		
		
		//JOptionPane.showMessageDialog(null, "Ditt tal, gånger 2, + 10, sen dividerat med 2, och minus ditt tal\n = \n" + allaTal.resultat());
		JOptionPane.showMessageDialog(null, "Såhär har jag räknat:" + allaTal.toString());
		
		String ursprungsTal2 = JOptionPane.showInputDialog ("Vi provar igen. \nSkriv ett tal till.");
		tal = Integer.parseInt(ursprungsTal2);
		
		JOptionPane.showMessageDialog(null, "Nu ska jag räkna igen. \nVänta så ska du få se...");
		
		
	//	JOptionPane.showMessageDialog(null, "Ditt tal, gånger 2, + 10, sen dividerat med 2, och minus ditt tal\n = \n" + allaTal.resultat()
		JOptionPane.showMessageDialog(null, "Såhär har jag räknat:" + allaTal.toString());
		
		
	

	}

}
