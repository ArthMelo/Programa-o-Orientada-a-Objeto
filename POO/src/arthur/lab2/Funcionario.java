package study.arthur.lab2;
public class Funcionario {
	private String nome;
	private double salarioHora;
	private final int ID_FUNC;
	private static int proxID = 0;
	public static final double SALARIO_HORA_MINIMO = 12.50;
	private double horasTrabalhadasMes = 0;
	
	public Funcionario(String name) {
		this.nome = name;
		this.ID_FUNC = getProximoID();
		this.salarioHora = SALARIO_HORA_MINIMO;
	}
	
	public Funcionario(String name, double _salarioHora) {
		this.nome = name;
		this.salarioHora = _salarioHora;
		this.ID_FUNC = getProximoID();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getID() {
		return Funcionario.proxID;
	}
	
	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public double calculaSalarioMes() {
		return this.horasTrabalhadasMes * this.salarioHora;
	}
	
	public void reiniciaMesTrabalho() {
		this.horasTrabalhadasMes = 0;
	}
	
	public void atualizaNome(String nome) {
		if(nome.trim().contains(" ")) {
			this.nome = nome;
		}
	}
	
	public void atualizaSalarioHora(double _salarioHora) {
		if(_salarioHora>this.salarioHora){
			this.salarioHora = _salarioHora;
		}
	}
	
	public int getProximoID() {
		return Funcionario.proxID++;
	}
	
	public void adicionaDiaDeTrabalho(double horasTrabalhadas) {
		if(horasTrabalhadas >= 4 && horasTrabalhadas <= 24) {
			this.horasTrabalhadasMes = horasTrabalhadasMes + horasTrabalhadas;
		}
	}
}