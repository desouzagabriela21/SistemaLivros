public class LivroBiblioteca extends Livro { // criar uma subclasse de livro
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

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
}