package classes_abstratas;

public class Programa {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
	    pf.setNome("Marcelo");
		pf.setCpf("1545");
		
		pj.setNome("EBAC");
		pj.setCnpj("4557.0001");
		

		
		System.out.println("Dados pessoa fisica: NOME: " + pf.getNome() + ". CPF: " + pf.getCpf());
		
		System.out.println("Dados pessoa jurídica: NOME: " + pj.getNome() + ". CNPJ: " + pj.getCnpj());

	}

}
