package comunicacion;

public class Periodico extends Escrito {
	
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	

	@Override
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*palabrasPagina;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		return this.getOrigen() + "\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.getFecha()+"\n"+
				this.getPrimicia();
	}


	
	
	
	

	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getPrimicia() {
		return primicia;
	}



	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
