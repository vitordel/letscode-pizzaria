package Objetos;

public class Cliente extends ArmazenaDados{

    private String nome;
    private String login;
    private String senha;
    private String endereco;
    private int bairro;
    private String telefone;

    public Cliente(String nome, String login, String senha, String endereco, int bairro, String telefone) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getBairro() {
        return bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public static Cliente findCliente(String login) {
        for(Cliente cliente : listaClientes) {
            if(cliente.getLogin().equals(login)) {
                return cliente;
            }
        }
        return null;
    }
}
