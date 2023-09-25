public class Vestuario extends Loja
{
    private boolean produtosImportados;

public Vestuario(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, boolean produtosImportados, int estoqueProdutos)
{
    
    super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataFundacao,estoqueProdutos);
    this.produtosImportados = produtosImportados;
} 
public boolean getProdutosImportados()
{
    return produtosImportados;
}
public void setProdutosImportados(boolean produtosImportados)
{
    this.produtosImportados = produtosImportados;
}
public String toString(){
    
    return this.getNome() + this.getQuantidadeFuncionarios() + this.getSalarioBaseFuncionario()  + this.getEndereco()  + this.getDataFundacao() + this.produtosImportados;
}
}
    