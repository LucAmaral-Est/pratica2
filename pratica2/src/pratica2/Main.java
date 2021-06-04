// Lucas Pereira do Amaral
package pratica2;
 
public class Main { 
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();
		
		String[]alunos = {
				"Ana", "Marcos", "Joao", "Manuel",
				"Jacob", "Liana", "Luiza", "Nina",
				"Mateus", "Maria"
				};
		
		double[] notas1 = {
				3.5, 4.5, 2.5, 8.0,
				9.0, 7.0, 5.0, 9.0,
				2.0, 1.0
		        };
		double[] notas2 = {
				6.5, 4.0, 5.0, 7.0,
				5.0, 8.0, 4.0, 9.5,
				4.5, 5.5
		        };
		
		for(int i = 0; i < alunos.length; i++) {
			aluno.setNome(alunos[i]);
			aluno.setId(i);
			disciplina.setAlunoToDisciplina(aluno.getNome(), aluno.getId());
		}
		
		

	    for (int i = 0; i < notas1.length; i++) {
		     aluno.setId(i);
		     aluno.nota1 = notas1[i];
		     disciplina.setAlunoNota1ToDisciplina(aluno.nota1, aluno.getId());
	    }
	
	    for (int i = 0; i < notas2.length; i++) {
			aluno.setId(i);
			aluno.nota2 = notas2[i];
			
			disciplina.setAlunoNota2ToDisciplina(aluno.nota2, aluno.getId());
		}

	    System.out.println("A média da primeira prova é: " + disciplina.getMediaClassNotas1());
		System.out.println("A média da segunda prova é: " + disciplina.getMediaClassNotas2());
		
		for (int i = 0; i < disciplina.alunos.length; i++) {
			aluno.nota1 = disciplina.classNotas1[i];
			aluno.nota2 = disciplina.classNotas2[i];
			
			System.out.println("A média do aluno é: " + disciplina.alunos[i] + " foi " + aluno.getMedia());
			
			if (aluno.passou()) {
				System.out.println("O aluno(a) " + disciplina.alunos[i] + " foi aprovado(a)");
			} else {
				System.out.println("O aluno(a) " + disciplina.alunos[i] + " não foi aprovado(a)");
			}
		}

}
}