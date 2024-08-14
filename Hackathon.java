package Atv;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hackathon {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		ArrayList<String> nomesProdutos = new ArrayList<>();
		ArrayList<Double> valoresProdutos = new ArrayList<>();
		while (true) {
		System.out.println("Digite o nome do produto (ou X para encerrar): ");
		String nomeProduto = Scanner.nextLine();
		if (nomeProduto.equals("X")) {
		break;
		}
		double valorProduto = 0;
		boolean valorValido = false;
		while(!valorValido) {
		System.out.println("Digite o valor do produto: ");
		try {
		valorProduto = Scanner.nextDouble();
		Scanner.nextLine();
		valorValido = true;
		} catch (InputMismatchException e) {
		System.out.println("valor invalido, por favor insira um numero valido");
		Scanner.nextLine();
		}
		}
		nomesProdutos.add(nomeProduto);
		valoresProdutos.add(valorProduto);
		}
		exibirListaCompras(nomesProdutos, valoresProdutos);
		double valorTotal = calclarValorTotal(valoresProdutos);
		System.out.println("valor total a pagar: R$ " + String.format("%.2f", valorTotal));
		}
		private static void exibirListaCompras(ArrayList<String> nomesProdutos, ArrayList<Double> valoresProdutos) {
		System.out.println("\nLista de Compras:");
		ArrayList<String> nomes = null;
		for (int i = 0; i< nomes.size(); i++) {
		ArrayList<String> valores = null;
		System.out.println(nomes.get(i) + "- R$" + String.format("%.2f", valores.get(i)));
		}
		}
		private static double calclarValorTotal(ArrayList<Double> valoresProdutos) {
		double total = 0;
		double[] valores = null;
		for (double valor : valores) {
		total+= valor;
		}
		return total;



	}

}
