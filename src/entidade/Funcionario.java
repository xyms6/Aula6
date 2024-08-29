package entidade;

import entidade.Cargo;

public abstract class Funcionario {

    protected String nome;
    protected double salario;
    protected Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public abstract void calcularSalario();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
    }
}
