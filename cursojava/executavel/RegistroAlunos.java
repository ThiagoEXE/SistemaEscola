package cursojava.executavel;

import cursojava.classes.Aluno;

public class RegistroAlunos{

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("THIAGO BARBOSA DE OLIVEIRA");
		aluno1.setIdade(25);
		aluno1.setDataNascimento("25/04/1996");
		aluno1.setRegistroGeral("14.859.098-58");
		aluno1.setNumeroCPF("069.398.236-86");
		aluno1.setNomeMae("JACIARA LIMA ALVES");
		aluno1.setNomePai("MANOEL SANTOS DE JESUS");
		aluno1.setDataMatricula("26/12/2011");
		aluno1.setSerieMatriculado("<<-  3° ANO  ->>");
		aluno1.setNomeEscola("Jdev Treinamentos");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("Nome é: " + aluno1.getNome() + "\n" + "Idade: " + aluno1.getIdade() + 
	    "\n" + "Data de Nascimento: " + aluno1.getDataNascimento() + "\n" + "RG: " + aluno1.getRegistroGeral() + 
	    "\n" + "CPF: " + aluno1.getNumeroCPF() + "\n" + "Nome da Mãe: " + aluno1.getNomeMae() + 
	    "\n" + "Nome do Pai: " + aluno1.getNomePai() + "\n" + "Data da Matrícula: " + aluno1.getDataMatricula() + 
	    "\n" + "Série Matriculado(a): " + aluno1.getSerieMatriculado() + "\n" + "Nome da Escola: " + aluno1.getNomeEscola());
		System.out.println("Média da nota é:  " + aluno1.getMediaNota());
        //Usando operador ternário para imprimir se foi "Aprovado" ou "Reprovado"
		System.out.print("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
		
	}

}
