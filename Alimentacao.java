public class Alimentacao extends Loja
{
    private Data dataAlvara;        
public Alimentacao(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao,Data dataAlvara, int estoqueProdutos)
{
    super(nome,quantidadeFuncionario, salarioBaseFuncionario, endereco, dataFundacao,estoqueProdutos);
    this.dataAlvara = dataAlvara;
}
public Data getDataAlvara()
{
    return dataAlvara;    
}
public void setDataAlvara(Data dataAlvara)
{
    this.dataAlvara = dataAlvara; 
}
public String toString()
{
  return this.getNome() + this.getQuantidadeFuncionarios() + this.getSalarioBaseFuncionario()  + this.getEndereco()  + this.getDataFundacao() + this.dataAlvara;
}
}