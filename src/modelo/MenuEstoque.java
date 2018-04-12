/**
 *
 * @author Alex Rocha
 */
package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuEstoque {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<Estoque> produtos = new ArrayList();
			
	public static void main(String[] args) {
		while (valorMenu != 3) {
			if (null == valorMenu) {
                            chamarMenu();
                        } else switch (valorMenu) {
                        case 1:
                            Descreva_produtos();
                            chamarMenu();
                            break;
                        case 2:
                            imprimir();
                            chamarMenu();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            chamarMenu();
                            break;
                    }
		}
	}
	private static void Descreva_produtos() {
                System.out.println("\n"+"Informa o Produto");
		String ITEM = entrada.next();
		System.out.println("Quantidade de Produto");
		Integer quantidade = entrada.nextInt();
		System.out.println("R$:");
		Float Preco = entrada.nextFloat();
                
	        Estoque novoProduto;
                novoProduto = new Estoque(ITEM, quantidade, Preco);
		produtos.add(novoProduto);
        }

	private static void chamarMenu() {
		System.out.println("\n#########################");
		System.out.println("#"+"        "+"MENU"+"           "+"#");
                System.out.println("#########################");
		System.out.println("#"+" "+"1:CADASTRO DE PRODUTO"+" "+"#");
		System.out.println("#"+" "+"2:IMPRIMIR"+   "            "+"#");
		System.out.println("#"+" "+"3:SAIR"+       "                "+"#");
		System.out.println("#########################");
		valorMenu = entrada.nextInt();
	
	}
        private static void imprimir() {
		for (Estoque produto : produtos) {
			System.out.println(produto);
		}
	}
}