package fichier;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter{
	private char lettre;
	public Filtre(char lettreDébut) {
		lettre = lettreDébut;
	}
	@Override
	public boolean accept(File dir, String name) {
		String s=""+lettre;
		return name.startsWith(s);
	}
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}
	

}
