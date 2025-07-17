public class SistemaLivros {

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "Código da Vinci";
        livro.editora = "Editora Xyz";
        livro.nrPaginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //LivroBiblioteca

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.codigo = 11;
        livroBiblioteca.titulo = "Cinderela";
        livroBiblioteca.autor = "Desconhecido";
        livroBiblioteca.editora = "Editora 123";
        livroBiblioteca.nrPaginas = 100;
        livroBiblioteca.edicao = 6;
        livroBiblioteca.localPrateleira = "Prateleira AB3";
        livroBiblioteca.categoria = "Animaçao";
        livroBiblioteca.prazoEntrega = 10;
        livroBiblioteca.nomeQuemEmprestou = "Marcelo Petri";

        livroBiblioteca.Ler();
        livroBiblioteca.Cadastrar();
        livroBiblioteca.Localizar();
        livroBiblioteca.Alugar();
        livroBiblioteca.Devolver();

        //LivroLivraria

        LivroLivraria livroLivraria = new LivroLivraria();
        
        livroLivraria.codigo = 12;
        livroLivraria.titulo = "Abobrinha";
        livroLivraria.editora = "Editora Xyz";
        livroLivraria.nrPaginas = 300;
        livroLivraria.edicao = 5;
        livroLivraria.preco = 39.90;
        livroLivraria.novoUsado = "Novo";
        livroLivraria.localPrateleira = "Prateleira AB9";
        livroLivraria.categoria = "Romance";

        livroLivraria.Vender();
    }
}