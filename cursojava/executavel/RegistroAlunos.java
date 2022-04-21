package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class RegistroAlunos{

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");


		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); //convertendo String em inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCPF(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1)); //convertendo String em double 
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
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
