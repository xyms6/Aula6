package entidade;

import entidade.Cargo;

public class Clt extends Funcionario {

    private double convenio;

    public Clt(String nome, double salario, Cargo cargo, double convenio) {
        super(nome, salario, cargo);
        this.convenio = convenio;
        calcularSalario();
    }

    @Override
    public void calcularSalario() {
        salario -= convenio;
        salario -= salario * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + " [convenio=" + convenio + "]";
    }
}
