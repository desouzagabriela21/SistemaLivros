public class LivroLivraria extends Livro { // criar uma subclasse de livro
    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;

    //metodos get set
    public double getPreco(){
        return preco;
    }
    public void setPreco(double valor){
        preco = valor;
    }
    public String getNovoUsado(){
        return novoUsado;
    }
    public void setNovoUsado(String nomeNovoUsado){
        novoUsado = nomeNovoUsado;
    }
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

    // metodos

    public void Vender(){
        System.out.println("Estou vendendo...");
    }
    
    // metodo override - está subscrevendo um metodo da classe pai 
    @Override
    public void Localizar(){
        System.out.println("Estou localizando um livro da livraria...");
    }

    @Override
    public void Ler(){
        System.out.println("Estou lendo o livro da livraria...");
    }

    @Override
    public void Cadastrar(){
        System.out.println("Estou cadastrando o livro da livraria...");
    }


} 