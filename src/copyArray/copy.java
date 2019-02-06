package copyArray;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class copy {
	/**
	 * this is the main function 
	 * 
	 * @param args this is a parameter
	 */
public static void main (String[] args) {
	
	char a[]= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
	char b[]=new char [7];
	System.arraycopy(a, 2, b, 0, 7);
	//JOptionPane.showMessageDialog(null, Arrays.toString(b));
	
	System.out.print(new String(b));
	
}
}
