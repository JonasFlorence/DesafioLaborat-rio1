public class Loja 
{
  private String nome;
  private int quantidadeFuncionario;
  private double salarioBaseFuncionario; 
  private Endereco endereco;
  private Data dataFundacao;
  private Produto[] estoqueProdutos; 
  
  public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario,Endereco endereco, Data dataFundacao, int estoqueProdutos)
{
    this.nome = nome;
    this.quantidadeFuncionario = quantidadeFuncionario; 
    this.salarioBaseFuncionario = salarioBaseFuncionario; 
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[estoqueProdutos];
}
public Loja (String nome, int quantidadeFuncionario, Endereco endereco, Data dataFundacao, int estoqueProdutos) 
{
    this.nome = nome;
    this.quantidadeFuncionario = quantidadeFuncionario;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[estoqueProdutos];
}
public String getNome()
{
  return nome;
}
public void setNome(String nome)
{
  this.nome = nome;
}
public int getQuantidadeFuncionarios()
{
  return quantidadeFuncionario;
}
public void setQuantidadeFuncionarios (int quantidadeFuncionario)
{
  this.quantidadeFuncionario = quantidadeFuncionario;
}
public double getSalarioBaseFuncionario()
{
  return salarioBaseFuncionario;
}
public void setSalarioBaseFuncionario (double salarioBaseFuncionario)
{
  this.salarioBaseFuncionario = salarioBaseFuncionario;
}
public Data getDataFundacao()
{
  return dataFundacao;
}
public void setDataFundacao(Data dataFundacao)
{
  this.dataFundacao = dataFundacao;
}
public Endereco getEndereco()
{
  return endereco;
}
public void setEndereco(Endereco endereco)
{
  this.endereco = endereco;
}
public Produto[] getEstoqueProdutos()
{
    return estoqueProdutos;
}
public void setEstoqueProdutos(Produto[] estoqueProdutos)
{
  this.estoqueProdutos = estoqueProdutos;
}
public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionario +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao + "estoqueProdutos" + estoqueProdutos;
                };
public double gastosComSalario()
{
    double qtGastosloja = salarioBaseFuncionario * quantidadeFuncionario; 

      return (qtGastosloja);

}
public char tamanhoDaLoja() {
        if (quantidadeFuncionario < 10) {
            return 'P';
        } else if (quantidadeFuncionario >= 10 && quantidadeFuncionario <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }   

 public void imprimeProdutos() {
        System.out.println("Produtos da loja:");
        for (Produto produto : estoqueProdutos){
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
public boolean insereProduto(Produto produto)
{
       for (int i = 0; i < estoqueProdutos.length; i++) 
       {
         if 
          (estoqueProdutos[i] == null) {
             estoqueProdutos[i] = produto;
            return true;
          }
        }     
        return false;
}
public boolean removeProduto(String nomeProduto) {
        // Procura o produto no estoque
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null){
                if (estoqueProdutos[i].getNome().equals(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    estoqueProdutos[estoqueProdutos.length - 1] = null;
                    return true; 
                }   
            }
        }
        return false; // Produto não encontrado
    }
}








