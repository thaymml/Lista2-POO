/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thays
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno();
        aluno1.setNumAluno(100110);
        aluno1.setNome("Beltrano");
        aluno1.setIdade(19);
        aluno1.setP1(8.7f);
        aluno1.setP2(9.2f);
        
        
        aluno1.NotaFinal();
        aluno1.dadosAluno();
        
        
        Aluno aluno2 = new Aluno(122112, "Ciclano", 20, 
                9.6f, 8.8f);
        
        aluno2.NotaFinal();
        aluno2.dadosAluno();

    }
    
}
