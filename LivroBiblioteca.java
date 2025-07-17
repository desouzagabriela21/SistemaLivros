public class LivroBiblioteca extends Livro { // criar uma subclasse de livro
     String localPrateleira;
     String categoria;
     int prazoEntrega;
     String nomeQuemEmprestou;

     //metodos
    
    public void Alugar(){
        System.out.println("Estou alugando...");
     }
    public void Devolver(){
        System.out.println("Estou devolvendo...");
     }
}