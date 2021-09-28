public class Animal{

    private String especie;
    private int qtdPatas;

    //construtor padrão
    Animal(){
        System.out.println("Construct padrão");
    }

    //construtor que recebe uma String a ser atribuida ao nome do animal
    Animal(String especie){
        this.especie = especie;
    }

    //construtor que recebe quantidade de patas e o nome
    Animal(String especie, int qtdPatas){
        this.qtdPatas = qtdPatas;
        this.especie = especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }
    
    public void setQtdPatas(int qtdPatas){
        this.qtdPatas = qtdPatas;
    }

    public int getQtdPatas(){
        return qtdPatas;
    }
}