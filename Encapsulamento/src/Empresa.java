public class Empresa {
    
    private String nome;
    private String cnpj;
    private String endereco;
    private float faturamento;

    public void Imprimir(){
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("CNPJ da Empresa: " + cnpj);
        System.out.println("Endereço da Empresa: " + endereco);
        System.out.println("Faturamento da Empresa: " + faturamento);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public float getFaturamento(){
        return faturamento;
    }
    public void setFaturamento(float faturamento){
        this.faturamento = faturamento;
    }
}
