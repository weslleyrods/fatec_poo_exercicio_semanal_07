public class TesteAnimal {
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro("rex");
        Gato cat = new Gato("mingau");

        
        System.out.printf("A especie do cachorro e %s e tem %d patas\n", dog.getNome(), dog.getQtdPatas());
        System.out.println("A especie do gato " + cat.getNome() + " e tem "+ cat.getQtdPatas()+" patas");
    }
}
