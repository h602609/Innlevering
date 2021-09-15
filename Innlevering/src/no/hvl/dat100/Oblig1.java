package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oblig1 {
public static void main(String[] args) {
String bruttolønn = showInputDialog("Skriv inn bruttolønn:");
int brutto = parseInt(bruttolønn);


double førsteTrinn = 164101;
double andreTrinn = 230950;
double tredjeTrinn = 580650;
double fjerdetrinn = 934050;

double prosent1 = 0.93;
double prosent2 = 2.41;
double prosent3 = 11.52;
double prosent4 = 14.52;

showMessageDialog(null, "Dette er bruttoinntekten din:");


if(brutto <= førsteTrinn) {
System.out.println("0 % sats");	

}else if(brutto <= andreTrinn && brutto >= førsteTrinn) {
	System.out.println(brutto / 100 * 0.93);

} else if(brutto <= tredjeTrinn && brutto >= andreTrinn) {
	System.out.println(brutto / 100 * prosent2);
	
} else if(brutto <= fjerdetrinn && brutto >= tredjeTrinn) {
System.out.println(brutto / 100 * prosent3);
}else if(brutto >= fjerdetrinn) {
System.out.println(brutto / 100 * prosent4);

} {
}

}
}
	
	 
	
	

	
