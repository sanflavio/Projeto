package atividade_sala;

public class esp_medica {
	private String codigos;
	private String descricao;
	private String localesp;
	private  String dataesp;
	public esp_medica(String codigos, String descriçao) {
		super();
		this.codigos = codigos;
		this.descricao = descriçao;
		this.localesp = localesp;
		this.dataesp = dataesp;

	}
	public esp_medica(){}
	public String getCodigos() {
		return codigos;
	}
	public void setCodigos(String codigos) {
		this.codigos = codigos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descriçao) {
		this.descricao = descriçao;
	}

	public String setLocalesp(String localesp) {
		return localesp;
	}
	public String setDataesp(String dataesp){
		return  dataesp;
	}

	public String toString() {
		return "\n codigos: " + codigos + "\n descriçao: " + descricao;
	}

}
