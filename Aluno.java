/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thays
 */
public class Aluno {
    private int numAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno(){
        
    }
    public Aluno(int numAluno, String nome, int idade, float p1, float p2){
        this.setNumAluno(numAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    //////// SETTERS////////////////

    public final void setNumAluno(int numAluno) {
        if(numAluno == 6){
            this.numAluno = numAluno;
        }else{
            System.out.println("Número Inválido!");
            
        }
    }

    public final void setNome(String nome) {
        if(nome.length() == 30){
            this.nome = nome;
        } else{
            this.nome = " ";
            System.out.println(" Nome excedeu o tamanho permitido!");
        }
    }

    public final void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade não pode ser negativa!");
        }
    }

    public final void setP1(float p1) {
        if(p1>=0){
            this.p1 = p1;
        }else{
            System.out.println("A P1 não pode ter valor negativo!");
        }
        this.p1 = p1;
    }

    public final void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        } else{
            System.out.println("A P2 não pode ter valor negativo!");
        }
    }
    
    ////////Getters///////////
    public int getNumAluno() {
        return numAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    public void NotaFinal(){
        float media = (getP1() + getP2()/2);
        System.out.println("Média Final: " + media);
    }
    public void dadosAluno(){
        System.out.println("Número do Aluno " + getNumAluno());
        System.out.println("Nome " + getNome());
        System.out.println("Idade " + getIdade());


    }
    
}
