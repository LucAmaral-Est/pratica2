package pratica2;

public class Aluno {
	private String nome;
	private int id;
	private double media;
	protected double nota1; 
	protected double nota2;
	
	
	public void setNome(String nome){
		this.nome = nome;
	}	
	
	public String getNome(){
		return this.nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	private double calculaMedia(double nota1, double nota2){
	    this.media = (nota1 + nota2)/2;
	    return media;
	}

	public double getMedia() {
		return calculaMedia(nota1, nota2);		
	}
    
	public boolean passou() {
		if(media >= 7) {
		        return true;
		} else {
			    return false;
		}
	}
	
	
}
