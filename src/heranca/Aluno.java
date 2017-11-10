
package heranca;

public class Aluno extends Pessoa {
    
    private String matricula;
    private int prova1;
    private int prova2;

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the prova1
     */
    public int getProva1() {
        return prova1;
    }

    /**
     * @param prova1 the prova1 to set
     */
    public void setProva1(int prova1) {
        this.prova1 = prova1;
    }

    /**
     * @return the prova2
     */
    public int getProva2() {
        return prova2;
    }

    /**
     * @param prova2 the prova2 to set
     */
    public void setProva2(int prova2) {
        this.prova2 = prova2;
    }
    
}

