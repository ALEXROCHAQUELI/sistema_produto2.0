/**
 *
 * @author Alex Rocha
 */
package modelo;

public class Estoque {

	private String ITEM;
	private Integer quantidade;
	private Float Preco;
	private Float precoTotal1;
	
	public Estoque (String ITEM, int quantidade, float Preco) {
		this.ITEM = ITEM;
		this.quantidade = quantidade;
		this.Preco = Preco;
		this.precoTotal1 = Preco * quantidade;
	}
	
        @Override
	public String toString() {
		return  "ITEM: " + ITEM + "; quantidade: " + quantidade + "; Preço: "
                        + Preco + "; precoTotal:"+precoTotal1 ;
	}
	public String getITEM() {
		return ITEM;
	}

    /**
     *
     * @param ITEM
     */
    public void setITEM(String ITEM) {
		this.ITEM = ITEM;
	}
	public Integer getquantidade() {
		return quantidade;
	}
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
		this.precoTotal1 = quantidade*Preco;
	}
	public Float getPreco() {
		return Preco*quantidade;
	}
	public void setPreco(Float Preco) {
		this.Preco = Preco;
		this.precoTotal1 = quantidade*Preco;
	}
	public Float getprecoTotal1() {
		return precoTotal1;
	}	
}