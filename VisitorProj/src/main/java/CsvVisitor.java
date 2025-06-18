public class CsvVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return aluno.getMatricula() + "," + aluno.getNome() + "," + aluno.getNomeCurso();
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return professor.getMatricula() + "," + professor.getNome() + "," + professor.getTitulacao();
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return funcionario.getCodigo() + "," + funcionario.getNome() + "," + funcionario.getSalario();
    }
}