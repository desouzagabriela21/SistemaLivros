public class Livro{

    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;
    private int codigo;

// metodos get e set
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int valor){
        codigo = valor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String nomeTitulo){
        titulo = nomeTitulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String nomeAutor){
        autor = nomeAutor;
    }
    public String getEditora(){
        return editora;
    }

    public void setEditora(String nomeEditora){
        editora = nomeEditora;
    }
    public int getNrPaginas(){
        return nrPaginas;
    }

    public void setNrPaginas(int valor){
        nrPaginas = valor;
    }

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int valor){
        edicao = valor;
    }

    // metodos

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");
    }

    public void Localizar(){
        System.out.println("Estou localizando...");
    }
}