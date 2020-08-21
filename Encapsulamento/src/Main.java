package Encapsulamento.src;

public class Main {
    public static void main(String[] args) {
     
        Empresa empresa1 = new Empresa();
        empresa1.setNome("Empresa Um");
        empresa1.setCnpj("987654321");
        empresa1.setEndereco("Rua Teste");
        empresa1.setFaturamento(1000000);
        empresa1.Imprimir();

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Empresa Dois");
        empresa2.setCnpj("123456789");
        empresa2.setEndereco("Avenida Teste");
        empresa2.setFaturamento(200000);
        empresa2.Imprimir();

    }

    
}