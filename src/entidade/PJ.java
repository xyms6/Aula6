package entidade;

import entidade.Cargo;

public class PJ extends Funcionario {

    public PJ(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional = adicional;
        calcularSalario();
	}

	private double adicional;


    @Override
    public void calcularSalario() {
        salario += adicional;
        salario -= salario * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + " [adicional=" + adicional + "]";
    }
}
