package Produto;

public class Produto {
	private String nomeProduto;
	private double preco;
	private int quantidade;

	public Produto(String n, double p, int q) {
		nomeProduto = n;
		preco = p;
		quantidade = q;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNomeProduto(String n) {
		nomeProduto = n;
	}

	public void setPreco(double p) {
		preco = p;
	}

	public void setQuantidade(int q) {
		quantidade = q;
	}
}