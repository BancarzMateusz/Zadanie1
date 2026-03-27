import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		ArrayList<Ksiazka> ksiazki= new ArrayList<Ksiazka>();
		ksiazki.add(new Ksiazka("Firestarter", "Stephen King"));
		ksiazki.add(new Ksiazka("Galaktyczne lektury", "Bartosz Walaszek"));
		ksiazki.add(new Ksiazka("Przedwiośnie", "Stefan Żeromski"));
		Biblioteka biblioteka = new Biblioteka(ksiazki);
		
		biblioteka.wyswietlWszystkie();

	}
}
