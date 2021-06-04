package pratica2;

public class Disciplina { 
    public String[] alunos = new String[10];
    public double[] classNotas1 = new double[10];
	public double[] classNotas2 = new double[10];	 
    
	public void setAlunoToDisciplina(String nome, int i) {
           this.alunos[i] = nome;          	    
    }		
     
	public void setAlunoNota1ToDisciplina(double nota1, int i) {
		this.classNotas1[i] = nota1;
	}
	
	public void setAlunoNota2ToDisciplina(double nota2, int i) {
		this.classNotas2[i] = nota2;
	}
	
	public double calculaClassNotas1(double[] classNotas1) {

		double sumClassNotas1 = 0;
		
		for (int x = 0; x < classNotas1.length; x++) {
			sumClassNotas1 = sumClassNotas1 + classNotas1[x];
		}
		
		double meanClassNotas1 = sumClassNotas1/classNotas1.length;
		
		return meanClassNotas1;
	}

	public double computeClassNotas2(double[] classNotas2) {
		double sumClassNotas2 = 0;
		
		for (int x = 0; x < classNotas2.length; x++) {
			sumClassNotas2 = sumClassNotas2 + classNotas2[x];
		}
		
		double meanClassNotas2 = sumClassNotas2/classNotas2.length;
		
		return meanClassNotas2;
	}
	
	public double getMediaClassNotas1() {
		return calculaClassNotas1(classNotas1);
	}
	
	public double getMediaClassNotas2() {
		return computeClassNotas2(classNotas2);
	}
	
}
	



