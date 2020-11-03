package theads;

public class Cohete {
	
	private String codigo;
	private int cantProp;
	
	public Cohete (String codigo, int cantProp) {
		this.codigo=codigo;
		this.cantProp=cantProp;
	}
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getCantProp() {
		return cantProp;
	}
	@Override
	public String toString() {
		return "Codigo: "+getCodigo()+". Cantidad de propulsores: "+getCantProp();
	}
}
