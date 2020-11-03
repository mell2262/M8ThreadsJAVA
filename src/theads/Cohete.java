package theads;

public class Cohete {
	
	private String codigo;
	private int cantProp;
	private Integer[] pot;
	
	public Cohete (String codigo, int cantProp, Integer...pot) {
		this.codigo=codigo;
		this.cantProp=cantProp;
		this.pot=new Integer[cantProp];
		for (int i=0; i<cantProp; i++) {
			this.pot[i]=pot[i];
		}
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getCantProp() {
		return cantProp;
	}
	
	public String getPot() {
		String potencias="";
		for (int i=0; i<cantProp;i++) {
			if (potencias=="") {
				potencias=pot[i].toString();
			}else {
				potencias+=", "+pot[i].toString();
			}
		}
		return potencias;
	}
	@Override
	public String toString() {
		return getCodigo()+": "+getPot();
	}
}
