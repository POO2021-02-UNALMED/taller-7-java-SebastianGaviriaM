package comunicacion;

public class Tesis extends Escrito {
	
	String idea;
	String[] argumentos;
	String conclusion;
	String referencias;
	String interpretacion;

	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.interpretacion = interpretacion;
		this.referencias = referencias;
	}

	
	@Override
	public int palabrasTotales(int palabrasPagina) {	
		return this.getPaginas()*palabrasPagina*5;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return this.interpretacion;
	}

	@Override
	public String toString() {
		
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.getIdea()+"\n"+
				this.getArgumentos().length+"\n"+
				this.getConclusion()+"\n"+
				this.getReferencias();
	}


	public String getIdea() {
		return idea;
	}


	public void setIdea(String idea) {
		this.idea = idea;
	}


	public String[] getArgumentos() {
		return argumentos;
	}


	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}


	public String getConclusion() {
		return conclusion;
	}


	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}


	public String getReferencias() {
		return referencias;
	}


	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}


	public String getInterpretacion() {
		return interpretacion;
	}


	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
