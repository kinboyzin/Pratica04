
public class Disciplina {
	private String nome;
	private String professor;
	private int semestre;
	private boolean ofertada;

	public Disciplina(String n, String p, int s) {
		nome = n;
		professor = p;
		semestre = s;
		ofertada = false;
	}

	public String getNome() {
		return nome;
	}

	public String getProfessor() {
		return professor;
	}

	public int getSemestre() {
		return semestre;
	}
	public boolean getOfertada() {
		return ofertada;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setProfessor(String p) {
		professor = p;
	}

	public void setSemestre(int s) {
		semestre = s;
	}
	public void setOfertada(boolean f) {
		ofertada = f;
	}
}
