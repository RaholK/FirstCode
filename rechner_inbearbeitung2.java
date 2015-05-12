package erstenprojekte;

import javax.swing.*;

public class rechner {
	public static void main(String[] args) {
		int x;
		x = 1;
		//while (x==1) {
			 JOptionPane.showMessageDialog(null, "Hallo, das ist der Rechner" );	//Eingabedialog
			 String erstezahl = JOptionPane.showInputDialog(null,"Geben Sie eine Zahl ein");
			 String operator = JOptionPane.showInputDialog(null,"Geben Sie einen Operator einen Operator ein: *, /, +,-");
			 String zweitezahl =  JOptionPane.showInputDialog(null,"Geben Sie die zweite Zahl ein");
		
			 //Integer i1 = new Integer(erstezahl);
			 //Integer i2 = new Integer(zweitezahl);
			 float i1=Float.parseFloat(erstezahl);
			 float i2=Float.parseFloat(zweitezahl);
			 
			 
			 if (operator.equals("*")) {
				float loesung = i1 * i2; 
				JOptionPane.showMessageDialog(null,loesung);
				 float[] loesungen = new float[x];
				 int y;
				 y = x-1;
				 loesungen[y] = loesung;
			 }
	
			 else if (operator.equals("/")) {
				 float loesung = i1/i2;
				 JOptionPane.showMessageDialog(null,loesung);
				 float[] loesungen = new float[x];
				 int y;
				 y = x-1;
				 loesungen[y] = loesung;
			 }
			 else if(operator.equals("+")) {
				 float loesung = i1+i2;
				 JOptionPane.showMessageDialog(null,loesung);
				 
				 float[] loesungen = new float[x];
				int y;
				 y = x-1;
				 loesungen[y] = loesung;
				 
			 }
			 else if(operator.equals("-")){
				 float loesung = i1-i2;
				 JOptionPane.showMessageDialog(null,loesung);
				 float[] loesungen = new float[x];
				 int y;
				 y = x-1;
				 loesungen[y] = loesung;
			 }
			 else {
				 JOptionPane.showMessageDialog(null,"Gib bei der Rechnung einen Operator( + - * /) an");
			 }
			 if (loesungen !=null) {
				 //while array und dann array ausgeben, bei der Falluterscheidung erscheint eine Fehlermeldung
			 }

		//}
	}
}
