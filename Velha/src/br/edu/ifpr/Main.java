package br.edu.ifpr;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		Controller graph = new Controller();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.add(graph);
		tela.setSize(300, 300);
		tela.setVisible(true);
		tela.setResizable(false);
		tela.setTitle("Jogo da velha de respeito");
	}
}