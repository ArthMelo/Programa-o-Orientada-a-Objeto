package study.arthur.lab3;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.idade = idade;
        this.salario = salario;
        this.chefe = chefe;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario getChefe() {
        return this.chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public boolean mesmaChefia(Funcionario f) {
        if (this.chefe == null || f.getChefe() == null) {
            return this.chefe == f.getChefe();
        }
        return this.chefe.equals(f.getChefe());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Funcionario)) {
            return false;
        }

        Funcionario f = (Funcionario) obj;
        if (this.chefe == null || f.getChefe() == null) {
            return this.chefe == f.getChefe();
        }
        return this.chefe.matricula == f.getChefe().matricula;
    }
}
