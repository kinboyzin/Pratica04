public class TesteTurma {

	public static void main(String args[]) {
		String nome = JOptionPane.showInputDialog("Nome");
		String curso = JOptionPane.showInputDialog("Curso");
		int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
		int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));

		Turma1 turma = new Turma1(nome, curso, quantidadeDeAlunos, serie);

		String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: "
				+ turma.getQuantidadeDeAlunos() + "\nTurma: " + turma.getSerie();
		JOptionPane.showMessageDialog(null, msg);
		quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nova quantidade de alunos: "));
		turma.setquantidadeDeAlunos(quantidadeDeAlunos);
		msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nQuantidade de Alunos: "
				+ turma.getQuantidadeDeAlunos() + "\nTurma: " + turma.getSerie();
		JOptionPane.showMessageDialog(null, msg);

	}

}