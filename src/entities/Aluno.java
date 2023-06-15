package entities;

public class Aluno {

    private Integer qtdeAlunos;
    private Integer codAluno;

    public Aluno() {
    }

    public Aluno(Integer qtdeAlunos, Integer codAluno) {
        this.qtdeAlunos = qtdeAlunos;
        this.codAluno = codAluno;
    }

    public Integer getQtdeAlunos() {
        return qtdeAlunos;
    }

    public void setQtdeAlunos(Integer qtdeAlunos) {
        this.qtdeAlunos = qtdeAlunos;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAluno == null) ? 0 : codAluno.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (codAluno == null) {
            if (other.codAluno != null)
                return false;
        } else if (!codAluno.equals(other.codAluno))
            return false;
        return true;
    }
}