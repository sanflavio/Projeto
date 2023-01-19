package atividade_sala;

public class Paciente extends PessoaFisica{
    protected int codpaciente;

    public Paciente(String cpf, String rg, String nome, String sexo, String datadenascimento, String endereco, String telefonedecontato, float salario, int codpaciente) {
        super(cpf, rg, nome, sexo, datadenascimento, endereco, telefonedecontato, salario);
        this.codpaciente = codpaciente;
    }

    public Paciente(int codpaciente) {
        this.codpaciente = codpaciente;
    }

    public Paciente() {}


    public int getCodpaciente() {
        return codpaciente;
    }

    public void setCodpaciente(int codpaciente) {
        this.codpaciente = codpaciente;
    }

    public String toString(){
        return "codigo paciente" + this.codpaciente;
    }

    @Override
    public double IR(double salario) {
        return 0;
    }
}
