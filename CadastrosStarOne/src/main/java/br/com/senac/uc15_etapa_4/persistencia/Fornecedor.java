package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String razaoSocial;
    private String cpfCnpj;
    private String cep;
    private String endereco;
    private String numeroEndereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String email;
    private int statusCadastroId;
    private int condicaoPagamentoId;
    private int bancoId;
    private String agencia;
    private String conta;
    private String vendedor;
    private String telefone;
    private String criadoEm;
    private String criadoPor;
    private String modificadoEm;

    public Fornecedor() {

    }

    public Fornecedor(int id, String razaoSocial, String cpfCnpj, String cep, String endereco, String numeroEndereco, String bairro, String cidade, String uf, String email, int statusCadastroId, int condicaoPagamentoId, int bancoId, String agencia, String conta, String vendedor, String telefone, String criadoEm, String criadoPor, String modificadoEm) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cpfCnpj = cpfCnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.statusCadastroId = statusCadastroId;
        this.condicaoPagamentoId = condicaoPagamentoId;
        this.bancoId = bancoId;
        this.agencia = agencia;
        this.conta = conta;
        this.vendedor = vendedor;
        this.telefone = telefone;
        this.criadoEm = criadoEm;
        this.criadoPor = criadoPor;
        this.modificadoEm = modificadoEm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatusCadastroId() {
        return statusCadastroId;
    }

    public void setStatusCadastroId(int statusCadastroId) {
        this.statusCadastroId = statusCadastroId;
    }

    public int getCondicaoPagamentoId() {
        return condicaoPagamentoId;
    }

    public void setCondicaoPagamentoId(int condicaoPagamentoId) {
        this.condicaoPagamentoId = condicaoPagamentoId;
    }

    public int getBancoId() {
        return bancoId;
    }

    public void setBancoId(int bancoId) {
        this.bancoId = bancoId;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(String criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    public String getModificadoEm() {
        return modificadoEm;
    }

    public void setModificadoEm(String modificadoEm) {
        this.modificadoEm = modificadoEm;
    }

}
