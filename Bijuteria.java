public class Bijuteria extends Loja
{
    private double metaVendas;
public Bijuteria(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, int estoqueProdutos, double metaVendas)
{
    super(nome, quantidadeFuncionario, salarioBaseFuncionario, endereco, dataFundacao,estoqueProdutos);
    this.metaVendas = metaVendas; 
}
public double getMetaVendas()
{
    return metaVendas;
}
public void setMetaVendas(double metaVendas)
{
    this.metaVendas = metaVendas;
}
public String toString()
{
  return this.getNome() + this.getQuantidadeFuncionarios() + this.getSalarioBaseFuncionario()  + this.getEndereco()  + this.getDataFundacao() + this.metaVendas;
}
}
