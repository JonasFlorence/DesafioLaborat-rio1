public class Informatica extends Loja
{
    private double seguroEletronicos;  
public Informatica(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, int estoqueProdutos, double seguroEletronicos)
{
    super(nome,quantidadeFuncionario,salarioBaseFuncionario,endereco,dataFundacao,estoqueProdutos);
    this.seguroEletronicos = seguroEletronicos;
}
public double getSeguroEletronicos()
{
    return seguroEletronicos;    
}
public void setSeguroEletronicos(double seguroEletronicos)
{
    this.seguroEletronicos = seguroEletronicos;
}
public String toString()
{
    return this.getNome() + this.getQuantidadeFuncionarios() + this.getSalarioBaseFuncionario()  + this.getEndereco()  + this.getDataFundacao() + this.seguroEletronicos;
}

}
