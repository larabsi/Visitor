import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonVisitorTest {
    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        JsonVisitor visitor = new JsonVisitor();
        assertEquals("{ \"matricula\": 1, \"nome\": \"Ana\", \"curso\": \"Sistemas de Informação\" }", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        JsonVisitor visitor = new JsonVisitor();
        assertEquals("{ \"matricula\": 1, \"nome\": \"Maria\", \"titulacao\": \"Doutorado\" }", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        JsonVisitor visitor = new JsonVisitor();
        assertEquals("{ \"codigo\": 1, \"nome\": \"Pedro\", \"salario\": 5000.0 }", visitor.exibir(funcionario));
    }
}
