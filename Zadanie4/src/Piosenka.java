public class Piosenka implements Odtwarzalny {
	@Override
	public void play(){
		System.out.println("Gram muzykę");
	} 
	@Override
	public void stop(){
		System.out.println("Zatrzymano");
	};
}
