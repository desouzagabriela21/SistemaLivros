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

        //usar metodo sobrescrito com override
        livroLivraria.Ler();
        livroLivraria.Cadastrar();
        livroLivraria.Localizar();


        String mensagemLivro = "\nCódigo: "+livro.getCodigo()+
                               "\nTitulo: "+livro.getTitulo()+
                               "\nAutor: "+livro.getAutor()+
                               "\nEditora: "+livro.getEditora()+
                               "\nnrPaginas: "+livro.getNrPaginas()+
                               "\nEdição: " +livro.getEdicao();

        /*System.out.println("Livro: "+mensagemLivro);*/

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

        /*System.out.println("Livro biblioteca: "+mensagemLivroBiblioteca);*/


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

        /*System.out.println("Livro Livraria: "+mensagemLivroLivraria);*/

        //exemplo metodo construtor
        Livro  novoLivro = new Livro();
        System.out.println("Novo livro "+novoLivro.getTitulo());
        novoLivro.setTitulo("Novo titulo");
        System.out.println("Novo livro "+novoLivro.getTitulo());

        // metodo construtor com parametros
        Livro livro2 = new Livro(99, "Titanic");
        System.out.println("Livro 2: "+livro2.getTitulo());

        Livro livro3 = new Livro(100, "O morto", "Edward", "123", 200, 3);
        System.out.println("Livro 3: "+livro3.getAutor());

        LivroBiblioteca livroBiblioteca2 = new LivroBiblioteca(100, "Crepusculo", "vampiros", "SA", 200, 3, "AB2", "Romance", 5, "Gabi");
        System.out.println("Livro Biblioteca 2: "+livroBiblioteca2.getNomeQuemEmprestou());
    }
} 
