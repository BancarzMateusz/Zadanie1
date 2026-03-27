public class Film implements Odtwarzalny {
	@Override
	public void play(){
		System.out.println("Wyswietlam film");
	}
	@Override
	public void stop(){
		System.out.println("zatrzymano");
	};

}
