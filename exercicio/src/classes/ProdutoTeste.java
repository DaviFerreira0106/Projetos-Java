package classes;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3499.98;
        p1.desconto = 0.15;

        Produto p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2259.99;
        p2.desconto = 0.2;

        double precoDesconto1 = p1.precoComDesconto();
        double precoDesconto2 = p2.precoComDesconto();
        double precoDescontoGerente1 = p1.precoComDesconto(0.1);
        double precoDescontoGerente2 = p2.precoComDesconto(0.16);
        double mediaCarrinho = (precoDesconto1 - precoDesconto2) / 2;

        System.out.printf("Aparelhos: %s, %s", p1.nome, p2.nome);
        System.out.printf("\nValor do Produto 1 (Com desconto aplicado!): R$%.2f.", precoDesconto1);
        System.out.printf("\nValor do Produto 2 (Com desconto aplicado!): R$%.2f.", precoDesconto2);
        System.out.printf("\nValor do Produto 1 (Com desconto do produto e gerente aplicado!): R$%.2f.", precoDescontoGerente1);
        System.out.printf("\nValor do Produto 2 (Com desconto do produto e gerente aplicado!): R$%.2f.", precoDescontoGerente2);
        System.out.printf("\nMédia do carrinho: R$%.2f.", mediaCarrinho);
    }
}
