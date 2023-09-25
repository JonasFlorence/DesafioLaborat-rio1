public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping (String nome, Endereco endereco, int quantidadeMáximaDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMáximaDeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
   public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
    int quantidadeTotalLojas = 0;
    
    for (int i = 0; i < lojas.length; i++) {
        if (lojas[i].getNome().equals(tipoLoja)) {
            quantidadeTotalLojas++;
            return quantidadeTotalLojas;
        } return -1;
    } 

    return quantidadeTotalLojas;
}
public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double valorSeguroMaisAlto = 0;
  
     for (int i = 0; i < lojas.length; i++)
        if(lojas [i] instanceof Informatica) {
         Informatica informatica = (Informatica) lojas[i];
         lojaMaisCara = informatica;
         valorSeguroMaisAlto = informatica.getSeguroEletronicos();
         return lojaMaisCara;
        } return null;
}         

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}