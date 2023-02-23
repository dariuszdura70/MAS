package ferma;

import java.util.TreeSet;

public class Adres {
String town;
public Adres(String town, String street, int buildingNo, int appartmentNo, String phoneNumber, String postalCode) {
	super();
	this.town = town;
	this.street = street;
	this.buildingNo = buildingNo;
	this.appartmentNo = appartmentNo;
	this.phoneNumber = phoneNumber;
	this.postalCode = postalCode;  //argument powtarzalny
}
//
private static TreeSet<String> codesPP  = new TreeSet<>(); 

public void addCode(String code) {
	codesPP.add(code);
	}

String street;
int buildingNo;
int appartmentNo;
String phoneNumber;
String postalCode;

}
