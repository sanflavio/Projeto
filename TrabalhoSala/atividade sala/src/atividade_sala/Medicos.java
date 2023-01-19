package atividade_sala;

public class Medicos extends PessoaFisica {
	
	private String crm;
	private String crmuf;
	private String Especialidade;

	public Medicos(){
		super();

	}

	public Medicos(String cpf, String rg, String nome, String sexo, String datadenascimento,  String endereco, String telefonedecontato, float salario, String crm, String crmuf, String Especialidade) {
		super();
		this.crm = crm;
		this.crmuf = crmuf;
		this.Especialidade = Especialidade;
}


	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCrmuf() {
		return crmuf;
	}
	public void setCrmuf(String crmuf) {
		this.crmuf = crmuf;
	}
	public String getEspecialidade() {
		return Especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Especialidade = especialidade;
	}

	
	public double getBonus() {
		return  salario;
	}




	public  double getDesconto(){
		return  salario - (salario * 0.25);
	}

	@Override
	public double IR(double salario){
		return 0;
	}

	public String toString() {
		return "\n crm: " + crm + "\n crmuf: " + crmuf + "\n Especialidade: " + Especialidade;
	}
	

}
