package atividade_sala;

public class Funcionario extends PessoaFisica implements Imposto {
	protected String registro;
	protected String funcao;
	protected int salario;
	protected  String cargo;

	public Funcionario( String cpf, String rg, String nome, String sexo, String datadenascimento, String endereco, String telefonedecontato, double IR, String registro, String funcao, int salario, String cargo) {
		super();
		this.registro = registro;
		this.salario = salario;
		this.cargo = cargo;
	}
	public Funcionario(){}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public double getbonus (){
		return salario - 0.1;
	}

	public double getDesconto(){
		return  salario - (salario * 0.1);
	}

	public String getCargo(){
		return cargo;
	}
	public void setCardo(String cargo){
		this.cargo = cargo;
	}

	@Override
	public double IR(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}



	public String toString() {
		return "\n registro: ;" + registro + "\n funcao: " + funcao + "\n salario: ;" + salario;
	}
	
	

}
