public class Livro{

    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;
    private int codigo;

    //metodo construtor (server para construir seu objeto com valores default)
    Livro(){
        this.codigo = 0;
        this.titulo = "Nenhum titulo";
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    // metodo construtor com parametros
   Livro(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

   Livro(int codigo, String titulo, String autor, String editora, int nrPaginas, int edicao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nrPaginas = nrPaginas;
        this.edicao = edicao;
    }

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