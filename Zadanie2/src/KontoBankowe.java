public class KontoBankowe {
	private double saldo;

	public KontoBankowe(double saldo){
		this.saldo = saldo;
	}
	public void wplac(double kwota){
		saldo += kwota;
	}
	public void wyplac(double kwota){
		saldo -= kwota;
	}
	public double getSaldo(){
		return saldo;
	}
}
