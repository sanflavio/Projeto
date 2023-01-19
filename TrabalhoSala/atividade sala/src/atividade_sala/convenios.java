package atividade_sala;

public class convenios {
	
	private String cnpj;
	private String EmpresaConveniada;
	private String telefone;
	private String desconto;
	public convenios(String cnpj, String empresaConveniada, String telefone, String desconto) {
		super();
		this.cnpj = cnpj;
		EmpresaConveniada = empresaConveniada;
		this.telefone = telefone;
		this.desconto = desconto;

	}
	public convenios(){}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmpresaConveniada() {
		return EmpresaConveniada;
	}
	public void setEmpresaConveniada(String empresaConveniada) {
		EmpresaConveniada = empresaConveniada;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDesconto() {
		return desconto;
	}
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String toString() {
		return "\n cnpj: ;" + cnpj + "\n EmpresaConveniada: " + EmpresaConveniada + "\n telefone: ;" + telefone + "\n desconto: " + desconto;
	}
	
	

}
