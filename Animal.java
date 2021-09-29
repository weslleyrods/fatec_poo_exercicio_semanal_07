public class Animal{

    private String nome;
    private int qtdPatas;
    

    //construtor padrão
    Animal(){
        System.out.println("Construct padrão");
    }

    //construtor que recebe uma String a ser atribuida ao nome do animal
    Animal(String nome){
        this.nome = nome;
    }

    //construtor que recebe quantidade de patas e o nome
    Animal(String nome, int qtdPatas){
        this.qtdPatas = qtdPatas;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setQtdPatas(int qtdPatas){
        this.qtdPatas = qtdPatas;
    }

    public int getQtdPatas(){
        return qtdPatas;
    }
}