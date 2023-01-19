package atividade_sala;

public abstract class PessoaFisica implements Imposto {
	private String cpf;
	private String rg;
	private String nome;
	private String sexo;
	private String datadenascimento;
	private String endereco;
	private String telefonedecontato;
	float salario;
	protected double IR;

	public PessoaFisica(String cpf, String rg, String nome, String sexo, String datadenascimento, String endereco, String telefonedecontato, float salario) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.sexo = sexo;
		this.datadenascimento = datadenascimento;
		this.endereco = endereco;
		this.telefonedecontato = telefonedecontato;
		this.salario = salario;

		
	}
	public PessoaFisica (){}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefonedecontato() {
		return telefonedecontato;
	}
	public void setTelefonedecontato(String telefonedecontato) {
		this.telefonedecontato = telefonedecontato;
	}
	public float salario() {
		return salario;
	}

	public void setIR(double salario) {
		if (salario <= 1903.98)
		{
			salario -= faixa1;
		}
		else if (salario > 1903.98 && salario <= 2826.65) // qual é a diferença entre && e & em java?
		{
			salario -= faixa2;
		}
		else if (salario > 2826.66 &&  salario <= 3751.05)
		{
			salario -= faixa3;
		}
		else if (salario > 3751.06 &&  salario <= 4664.68)
		{
			salario -= faixa4;
		}
		else if (salario > 4.66468)
		{
			salario -= faixa5;
		}



		IR = salario;
	}
	public double getIR() {
		return IR;
	}
	public String toString(){
		return "\n cpf: " + cpf + "\n rg: " + rg + "\n nome: " + nome + "\n sexo:" + sexo + "\n datadenascimento:" + datadenascimento + "\n endereco:" + endereco + "\n telefonecontato:" + telefonedecontato + "\n salario:" + salario;

	}
}
