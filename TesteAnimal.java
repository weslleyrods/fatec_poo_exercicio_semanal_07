public class TesteAnimal {
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro("labrador");
        Gato cat = new Gato("malhado");

        
        System.out.printf("A especie do cachorro e %s e tem %d patas\n", dog.getEspecie(), dog.getQtdPatas());
        System.out.println("A especie do gato " + cat.getEspecie() + " e tem "+ cat.getQtdPatas()+" patas");
    }
}
