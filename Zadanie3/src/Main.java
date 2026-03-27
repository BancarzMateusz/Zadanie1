public class Main{
	public static void main(String[] args){
		Pracownik prac = new Pracownik("Patryk", 400);
		Programista prog = new Programista("Kacper", 60 , "JAVA");
		Menadzer men = new Menadzer("Swist", 1000, 2000);

		System.out.println(prac.imie);
		System.out.println(prog.jezykProgramowania);
		System.out.println(men.premia);
	}
}
