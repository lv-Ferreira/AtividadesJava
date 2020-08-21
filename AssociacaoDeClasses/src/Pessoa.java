import java.util.Date;

public class Pessoa {
    
    private String Nome;
    private String Endereco;
    private String Telefone;
    private Date dataNascimento;

    //Relacionamento com a classe Carro
    private Carro carro;

    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public String getEndereco(){
        return Endereco;
    }
    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }
    public String getTelefone(){
        return Telefone;
    }
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    //
    public Carro getCarro(){
        return carro;
    }
    public void setCarro(Carro carro){
        this.carro = carro;
    }
}