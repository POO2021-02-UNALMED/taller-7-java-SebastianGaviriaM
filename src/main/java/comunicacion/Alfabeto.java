package comunicacion;

public class Alfabeto extends Pictograma {

	String interpretacion;
	String[] letras;
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		this.letras = letras;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String cadena=this.letras[0];
		for(int i=1; i<this.letras.length;i++) {
			cadena = cadena + ", " + letras[i];			
		}
		return cadena;
	}
	public int cantidadLetras() {
		return letras.length;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

}
