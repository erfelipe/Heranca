package heranca;

import java.util.ArrayList;
import java.util.List;

public class Heranca {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setMatricula("1234");
        a1.setNome("Fulano de Tal e Tal");
        a1.setIdade(21);
        a1.setEndereco("Rua Alcides, 23, Centro");
        a1.setProva1(35);
        a1.setProva2(40);

        Professor p1 = new Professor();
        p1.setInscricao("897342");
        p1.setNome("Beltrano da Silva");
        p1.setIdade(32);
        p1.setSalario(1000.99);
        p1.setEndereco("Rua Nogueira, 765, Bairro D. Pedro");

        List<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(a1);
        listaPessoas.add(p1);

        for (Pessoa item : listaPessoas) {
            System.out.println("******");
            
            if (item instanceof Aluno) {
                System.out.println("Matricula: " + ((Aluno)item).getMatricula());
                System.out.println("Nome: " + item.getNome());
                System.out.println("Endereco: " + item.getEndereco());
                System.out.println("Nova da prova1: " + ((Aluno) item).getProva1());
            } else if (item instanceof Professor) {
                System.out.println("Inscrição: " + ((Professor) item).getInscricao());
                System.out.println("Nome: " + item.getNome());
                System.out.println("Endereço: " + item.getEndereco());
                System.out.println("Salário: " + ((Professor) item).getSalario());
            }
        }

    }

}
