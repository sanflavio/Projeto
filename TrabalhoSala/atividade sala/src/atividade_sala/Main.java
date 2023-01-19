package atividade_sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		convenios cov = new convenios();
		esp_medica esp = new esp_medica();
		Funcionario fun = new Funcionario();
		Medicos med = new Medicos();
		Paciente paci = new Paciente();

		int tab;


		do {

			System.out.println("\nMenu Principal");
			System.out.print("\n1-Cadastra");
			System.out.print("\n2-Exibir");
			System.out.print("\n3-Exibir Bonus fun ");
			System.out.print("\n4-Exibir bonus medico");
			System.out.print("\n5-Exibir desconto fun e med");

			tab = ler.nextInt();
			int opc = 0;
			switch (tab) {

				case 1: {
					System.out.println("\nSelecione uma opção.");
					System.out.print("\n1-Cadastra pessoa paciente ");
					System.out.print("\n2-Cadastra medico ");
					System.out.print("\n3-Cadastra especialidade medica ");
					System.out.print("\n4-Cadastra convenio");
					System.out.print("\n5-Cadastra funcionario");
					System.out.print("\n6-sair");
					opc = ler.nextInt();
				}
				break;

				case 2: {
					int var = 0;

					System.out.print("\n1-exibir medico");
					System.out.print("\n2-exibir funcionario");
					System.out.print("\n3-exibir paciente");
					System.out.print("\n4-exibir espmed");
					System.out.print("\n5-exibir convenio");
					var = ler.nextInt();

					switch (var) {
						case 1:
							System.out.print("exibir medico");
							System.out.print(med);
							break;

						case 2:
							System.out.print("exibir funcionario");
							System.out.print(fun);
							break;

						case 3:
							System.out.print("\n2-exibir paciente");
							System.out.print(paci);
							break;

						case 4:
							System.out.print("exibir esp med");
							System.out.print(esp);
							break;

						case 5:
							System.out.print("exibir convenio");
							System.out.print(cov);
							break;
					}

				}
				break;

				case 3: {
					System.out.print(fun.getbonus());
				}
				break;

				case 4: {
					System.out.print(med.getBonus());
				}
				break;
				case 5: {

					System.out.print("desconto funcionario:");
					System.out.println(fun.getDesconto());
					System.out.print("Desconto medico:");
					System.out.println(med.getDesconto());
				}

			}




			switch (opc) {

				case 1:
				{
					System.out.print("cpf: ");
					String cpf = ler.next();
					while (true) {
						if (cpf.length() != 11) {
							System.out.print(" cpf incorreto digite novamente: ");
							cpf = ler.next();
						} else {
							break;
						}
					}
					paci.setCpf(cpf);
					System.out.print("rg: ");
					String rg = ler.next();
					paci.setRg(rg);
					System.out.print("nome: ");
					String nome = ler.next();
					paci.setNome(nome.toUpperCase());

					System.out.print("sexo: ");
					String sexo = ler.next();
					paci.setSexo(sexo);
					System.out.print("data de nascimento:");
					String datadenascimento = ler.next();
					paci.setDatadenascimento(datadenascimento);
					System.out.print("endereço: ");
					String endereco = ler.next();
					paci.setEndereco(endereco);
					System.out.print("telefone de contato: ");
					String telefonedecontato = ler.next();
					paci.setTelefonedecontato(telefonedecontato);
			}break;


				case 2:
				{
					System.out.print("crm: ");
					String crm = ler.next();
					med.setCrm(crm);

					System.out.print("crmuf: ");
					String crmuf = ler.next();
					med.setCrmuf(crmuf);
					System.out.print("Especialidade: ");
					String Especialidade = ler.next();
					med.setEspecialidade(Especialidade);					System.out.print("salario");
					int salmed = ler.nextInt();
					//med.setSalario(salmed);
			}break;


						case 3: {

							System.out.print("codigos: ");
							String codigos = ler.next();
							esp.setCodigos(codigos);

							System.out.print("descricao: ");
							String descricao = ler.next();
							esp.setDescricao(descricao);

							System.out.print("local especialidade: ");
							String localesp = ler.next();
							esp.setLocalesp(localesp);

							System.out.print("data especialidade: ");
							String dataesp = ler.next();
							esp.setDataesp(dataesp);
						}break;


						case 4: {
							System.out.print("cnpj: ");
							String cnpj = ler.next();
							cov.setCnpj(cnpj);

							System.out.print("EmpresaConveniada: ");
							String EmpresaConveniada = ler.next();
							cov.setEmpresaConveniada(EmpresaConveniada);

							System.out.print("telefone: ");
							String telefone = ler.next();
							cov.setTelefone(telefone);

							System.out.print("desconto: ");
							String desconto = ler.next();
							cov.setDesconto(desconto);
						}break;


						case 5: {


							System.out.print("registro: ");
							String registro = ler.next();
							fun.setRegistro(registro);
							System.out.print("funcao: ");
							String funcao = ler.next();
							fun.setFuncao(funcao);
							System.out.print("salario: ");
							int salario = ler.nextInt();
							fun.setSalario(salario);
							while (true) {
								if (salario < 0) {

									System.out.print("saldo incorreto");
									salario = ler.nextInt();
								} else {
									break;
								}

							}

						}break;


						case 6:
						{
							System.out.print("concluido :)");
					}break;

			//ler.close();


		}

	}while (tab == 1 || tab == 2 || tab == 3 || tab == 4 || tab == 5);
}
}

