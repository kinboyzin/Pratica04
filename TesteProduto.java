package Produto;

import javax.swing.JOptionPane;

public class TesteProduto {
	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Produto: ");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço: "));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Quantidade: "));
		Produto produto = new Produto(nomeProduto, preco, quantidade);
		String msg = "Nome do Produto: " + produto.getNomeProduto() + "\nPreço: R$ " + produto.getPreco()
				+ "\nQuantidade: " + produto.getQuantidade() + " " + "unidades";
		String msgUnico = "Nome do Produto: " + produto.getNomeProduto() + "\nPreço: R$ " + produto.getPreco()
		+ "\nQuantidade: " + produto.getQuantidade() + " " + "unidade";
		if (quantidade == 1) {
			JOptionPane.showConfirmDialog(null, msgUnico);
		} else if (quantidade <= 0) {
			JOptionPane.showConfirmDialog(null, "Não há quantidade válida para amostra");
		}
		else {
			JOptionPane.showConfirmDialog(null, msg);
		}

	}

}