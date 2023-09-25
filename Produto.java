public class Produto{
  private String nome;
  private int preco;
  private Data dataValidade;
  
public Produto(String nome, int preco, Data dataValidade)
{
  this.nome = nome;
  this.preco = preco;
  this.dataValidade = dataValidade;
}
public String getNome(){
  return nome;
}
public void setNome(String nome){
  this.nome = nome; 
}
public int getPreco(){
  return preco;
}
public void setPreco(int preco){
  this.preco = preco;
} 
public Data getDataValidade()
{
    return dataValidade; 
}
public void setDataValidade(Data dataValidade)
{
    this.dataValidade = dataValidade;
}
public String toString()
{
  return this.nome + this.preco + this.dataValidade;
}
 public boolean estaVencido(Data dataAtual){                    
 if (dataValidade.getAno() < dataAtual.getAno()
     || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes())
     || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()))
{
     return true;
} else {
      return false;
}
}
}
