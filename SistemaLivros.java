public class SistemaLivros {

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.setCodigo(21);
        livro.setTitulo("Código da Vinci");
        livro.setEditora("Editora Xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);
        livro.setAutor("Jose");
        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //LivroBiblioteca

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.setCodigo(21);
        livroBiblioteca.setTitulo("cinderela");
        livroBiblioteca.setAutor("Desconhecido");
        livroBiblioteca.setEditora("Editora 123");
        livroBiblioteca.setNrPaginas(200);
        livroBiblioteca.setEdicao(6);
        livroBiblioteca.setLocalPrateleira("Prateleira AB3");
        livroBiblioteca.setCategoria("Animaçao");
        livroBiblioteca.setPrazoEntrega(10);
        livroBiblioteca.setNomeQuemEmprestou("Marcelo Petri");
        
        livroBiblioteca.Ler();
        livroBiblioteca.Cadastrar();
        livroBiblioteca.Localizar();
        livroBiblioteca.Alugar();
        livroBiblioteca.Devolver();

        //LivroLivraria

        LivroLivraria livroLivraria = new LivroLivraria();
        
        livroLivraria.setCodigo(12);
        livroLivraria.setTitulo("abobrinha");
        livroLivraria.setAutor("Ze");
        livroLivraria.setEditora("Editora 321");
        livroLivraria.setNrPaginas(300);
        livroLivraria.setEdicao(5);
        livroLivraria.setPreco (39.90);
        livroLivraria.setNovoUsado("Novo");
        livroLivraria.setLocalPrateleira("Prateleira AB9");
        livroLivraria.setCategoria("Romance");

        livroLivraria.Vender();

        String mensagemLivro = "\nCódigo: "+livro.getCodigo()+
                               "\nTitulo: "+livro.getTitulo()+
                               "\nAutor: "+livro.getAutor()+
                               "\nEditora: "+livro.getEditora()+
                               "\nnrPaginas: "+livro.getNrPaginas()+
                               "\nEdição: " +livro.getEdicao();
                               
        System.out.println("Livro: "+mensagemLivro);

        String mensagemLivroBiblioteca = 
                               "\nCódigo: "+livroBiblioteca.getCodigo()+
                               "\nTitulo: "+livroBiblioteca.getTitulo()+
                               "\nAutor: "+livroBiblioteca.getAutor()+
                               "\nEditora: "+livroBiblioteca.getEditora()+
                               "\nnrPaginas: "+livroBiblioteca.getNrPaginas()+
                               "\nEdição: " +livroBiblioteca.getEdicao()+
                               "\nLocal prateleira: "+livroBiblioteca.getLocalPrateleira()+
                               "\nCategoria: "+livroBiblioteca.getCategoria()+
                               "\nPrazo entrega: "+livroBiblioteca.getPrazoEntrega()+
                               "\nNome de quem emprestou: "+livroBiblioteca.getNomeQuemEmprestou();

        System.out.println("Livro biblioteca: "+mensagemLivroBiblioteca);


        String mensagemLivroLivraria = 
                               "\nCódigo: "+livroLivraria.getCodigo()+
                               "\nTitulo: "+livroLivraria.getTitulo()+
                               "\nAutor: "+livroLivraria.getAutor()+
                               "\nEditora: "+livroLivraria.getEditora()+
                               "\nnrPaginas: "+livroLivraria.getNrPaginas()+
                               "\nEdição: " +livroLivraria.getEdicao()+
                               "\nLocal prateleira: "+livroLivraria.getLocalPrateleira()+
                               "\nCategoria: "+livroLivraria.getCategoria()+
                               "\nPreço: "+livroLivraria.getPreco()+
                               "\nNovo ou usado: "+livroLivraria.getNovoUsado();

        System.out.println("Livro Livraria: "+mensagemLivroLivraria);



    }
} 
