package Exercicio;

public class ConfirmaDados {

    public static void main(String[] args) {

        PesFisica pesFisica = new PesFisica();
            pesFisica.setNome("Jessica");
            pesFisica.setSobrenome("Gomes");
            pesFisica.setIdade("22");
            pesFisica.setSexo("Feminina");
            pesFisica.setCpf("1515156486");
            imprimir(pesFisica);
        System.out.println("CPF: " + pesFisica.getCpf());


        PesJuridica pesJuridica = new PesJuridica();
            pesJuridica.setNome("Jubirildo");
            pesJuridica.setSobrenome("Gomes");
            pesJuridica.setIdade("23");
            pesJuridica.setSexo("Masculino");
            pesJuridica.setCnpj("001465515");
            imprimir(pesJuridica);
            System.out.println("CNPJ: " + pesJuridica.getCnpj());

    }

    public static void imprimir (Pessoa pessoa) {
        System.out.println("Bem vindo: " + pessoa.getNome());
        System.out.println("Confirme seus dados: " + pessoa.getSobrenome() + ", " + pessoa.getIdade() + ", " + pessoa.getSexo());
    }
}
