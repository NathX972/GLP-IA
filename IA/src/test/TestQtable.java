package test;
import process.QTable;
import process.QFonction;
public class TestQtable {

	public static void main(String[] args) {
		QTable q = new QTable(9); //donc on a une map 3x3
		q.afficher();
		QFonction f=new QFonction(q,0.9,0.8);
		f.update(0,0,1,0,-100);
		q.afficher();
	}

}