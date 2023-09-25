public class Cosmetico extends Loja
{
    private double taxaComercializacao;

public Cosmetico(String nome,int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, int estoqueProdutos, double taxaComercializacao)
{
    super(nome,quantidadeFuncionario, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
    this.taxaComercializacao = taxaComercializacao;
    
}
public double getTaxaComercializacao()
{
    return taxaComercializacao;
}
public void setTaxaComercializacao(double taxaComercializacao)
{
    this.taxaComercializacao = taxaComercializacao;
}
public String toString()
{
 return this.getNome() + this.getQuantidadeFuncionarios() + this.getSalarioBaseFuncionario()  + this.getEndereco()  + this.getDataFundacao() + this.taxaComercializacao;
}
}
