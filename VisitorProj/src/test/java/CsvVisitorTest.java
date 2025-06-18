import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvVisitorTest {
    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));
        CsvVisitor visitor = new CsvVisitor();

        assertEquals("1,Ana,Sistemas de Informação", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");
        CsvVisitor visitor = new CsvVisitor();

        assertEquals("1,Maria,Doutorado", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);
        CsvVisitor visitor = new CsvVisitor();

        assertEquals("1,Pedro,5000.0", visitor.exibir(funcionario));
    }
}
