public class LivroBiblioteca extends Livro { // criar uma subclasse de livro
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    // se criamos um metodo com parametros definidos, precisamos criar um vazio
    LivroBiblioteca(){}
    
    //metodo construtor subclasse
    LivroBiblioteca(int codigo, String titulo, String autor, String editora, int nrPaginas, int edicao, String localPrateleira, String categoria, int prazoEntrega, String nomeQuemEmprestou){
        //pegar informações do metodo construtor pai/ usar os atributos da superclasse
        super(codigo, titulo, autor, editora, nrPaginas, edicao);
        // estipular atributos da classe filha
        this.localPrateleira = localPrateleira;
        this.categoria = categoria;
        this.prazoEntrega = prazoEntrega;
        this.nomeQuemEmprestou = nomeQuemEmprestou;
    }

     // metodos get set
    public String getLocalPrateleira(){
        return localPrateleira;
    }
    public void setLocalPrateleira(String nomeLocalPrateleira){
        localPrateleira = nomeLocalPrateleira;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String nomeCategoria){
        categoria = nomeCategoria;
    }
    public String getNomeQuemEmprestou(){
        return nomeQuemEmprestou;
    }
    public void setNomeQuemEmprestou(String nomeNomeQuemEmprestou){
        nomeQuemEmprestou = nomeNomeQuemEmprestou;
    }
    public int getPrazoEntrega(){
        return prazoEntrega;
    }
    public void setPrazoEntrega(int valor){
        prazoEntrega = valor;
    }

     //metodos
    
    public void Alugar(){
        System.out.println("Estou alugando...");
     }
    public void Devolver(){
        System.out.println("Estou devolvendo...");
     }

    // metodo override - está subscrevendo um metodo da classe pai 


    @Override
     public void Ler(){
        System.out.println("Estou lendo o livro da biblioteca...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando o livro da biblioteca...");
    }

    @Override
    public void Localizar(){
    System.out.println("Estou localizando o livro da biblioteca...");
    }
}