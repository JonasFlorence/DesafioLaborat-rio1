public class Principal2 {
    public static void main(String[] args) {
        System.out.println("(1) Criar uma Loja");
        System.out.println("(2) Criar um Produto");
        System.out.println("(3) Sair");
        Teclado t = new Teclado();
        int n1 = t.leInt();
        Loja[] lojas = new Loja[5]; // Declare o array lojas com o tamanho apropriado
        int quantidadeLoja = 0;
        Loja loja = null;
        Produto produto = null;
       
        do {
            if (n1 == 1) {
                if (quantidadeLoja >= lojas.length) {
                    System.out.println("Capacidade máxima de lojas atingida.");
                } else {
                      
                    int estoqueProdutos;
                    
                
                
                    Produto[] produtosImportados;
                    produtosImportados = new Produto[3];
                    Endereco endereco1 = new Endereco("rua tal", "sapucaia", "rs", "br", "91333910", "340", "casa");
                    Data data1 = new Data(17, 02, 2010);
                    
                    estoqueProdutos = t.leInt("Digite a quantidade de estoque Produtos");
                    String nome = t.leString("\n Informe o nome da Loja: ");
                    int numf = t.leInt("\n Digite o numero de funcionarios da loja: ");
                    double salf = t.leDouble("\n Digite o Salário base dos Funcionarios: ");
                    int df = t.leInt("\n informe a Data de Fundação da Loja: ");
                    String e = t.leString("\n Informe a Rua da Loja: ");
                    String e1 = t.leString("\n Informe Cidade a Loja Está:  ");
                    String e2 = t.leString("\n Informe Estado a Loja Está:  ");
                    String e3 = t.leString("\n Em Qual País a Loja Está: ");
                    String e4 = t.leString("\n Informe o CEP da Loja:  ");
                    String e5 = t.leString("\n Informe o Número da Loja: ");
                    String e6 = t.leString("\n Informe o Complemento da Loja:  ");
                    
                    
                    
                    Loja l  = new Loja(nome, numf, salf, endereco1, data1, estoqueProdutos );
                    l.setSalarioBaseFuncionario(salf);
                    lojas[quantidadeLoja] = l;
                    quantidadeLoja++;

                    endereco1.setNomeDaRua(e);
                    endereco1.setCidade(e1);
                    endereco1.setEstado(e2);
                    endereco1.setPais(e3);
                    endereco1.setCep(e4);
                    endereco1.setNumero(e5);
                    endereco1.setComplemento(e6);
                    
                    
                    System.out.println("\n -----------------------------------------------------------------------------------");
                    System.out.println("\n Loja Criada!");
                    System.out.println("\n -----------------------------------------------------------------------------------");
                    System.out.println("\n Nome da loja: " + l.getNome().toString());
                    System.out.println("\n Numero de funcionáios da Loja: " + l.getQuantidadeFuncionarios());
                    System.out.println("\n O Salário Base dos Funcionários é:" + l.getSalarioBaseFuncionario());
                    System.out.println("\n O Salário Base dos Funcionários é:" + l.getSalarioBaseFuncionario());
                    System.out.println("\n A Data de Fundação da loja é: " + l.getDataFundacao().toString());
                    System.out.println("\n A Rua da loja é: " + endereco1.getNomeDaRua());
                    System.out.println("\n A Loja está na Cidade De: " + endereco1.getCidade());
                    System.out.println("\n A Loja está no Estado De: " + endereco1.getEstado());
                    System.out.println("\n A Loja está no País: " + endereco1.getPais());
                    System.out.println("\n O CEP da Loja é:  " + endereco1.getCep());
                    System.out.println("\n O Número da Loja é: " + endereco1.getNumero());
                    System.out.println("\n O Complemento da Loja é: " + endereco1.getComplemento());
                }
            }

            System.out.println("\n(1) Criar uma Loja");
            System.out.println("(2) Criar um Produto");
            System.out.println("(3) Sair");
            n1 = t.leInt();

        } while (n1 == 1);

        do {
            if (n1 == 2) {
                Data data2 = new Data(20, 10, 2023);
                Data data3 = new Data(13, 05, 2006);
                Produto produto1 = new Produto("Calçado", 200, data2);
                String n = t.leString("\n Informe o Nome do Produto: ");
                int p = t.leInt("\n Informe o Preço desse Produto: ");
                int d1 = t.leInt("\n Informe a Data de Validade Desse Produto: ");
                produto1.setNome(n);
                produto1.setPreco(p);

                System.out.println("\n ----------------------------------------------------------------------");
                System.out.println("\n Produto Criado!");
                System.out.println("\n ----------------------------------------------------------------------");
                System.out.println("\n O Nome do Produto é: " + produto1.getNome());
                System.out.println("\n O Preço desse Produto é: " + produto1.getPreco());
                System.out.println("\n A Data de Validade do Produto é: " + produto1.getDataValidade().toString());
                
                

                Data dataLimite = new Data(20,10, 2023);
                    if (produto1.estaVencido(dataLimite)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }

                    break;

            }

            System.out.println("\n (1) Criar uma Loja");
            System.out.println(" (2) Criar um Produto");
            System.out.println(" (3) Sair");
            n1 = t.leInt();

        } while (n1 == 2);

        if (n1 == 3) {
            System.out.println("\n ----------------------------------------------------------------------");
            System.out.println("\n   Você Saiu..");
            System.out.println("\n ----------------------------------------------------------------------");
        }
    }
}
