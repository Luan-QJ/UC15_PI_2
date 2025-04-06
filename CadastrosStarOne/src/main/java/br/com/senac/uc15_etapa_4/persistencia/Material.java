package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "dado_mestre")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private String unidadeMedida;
    private String pesoBruto;
    private String pesoLiquido;
    private int categoriaProdutoId;
    private int familiaProdutoId;
    private int compradorProdutoId;
    private int statusCadastroId;
    private String codigoBarras;
    private String prazoValidade;
    private int fornecedorId;
    private int utilizacaoProdutoId;
    private String precoCompra;
    private String criadoEm;
    private String criadoPor;
    private String modificadoEm;

    public Material() {
    }

    public Material(int id, String descricao, String unidadeMedida, String pesoBruto, String pesoLiquido, int categoriaProdutoId, int familiaProdutoId, int compradorProdutoId, int statusCadastroId, String codigoBarras, String prazoValidade, int fornecedorId, int utilizacaoProdutoId, String precoCompra, String criadoEm, String criadoPor, String modificadoEm) {
        this.id = id;
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.pesoBruto = pesoBruto;
        this.pesoLiquido = pesoLiquido;
        this.categoriaProdutoId = categoriaProdutoId;
        this.familiaProdutoId = familiaProdutoId;
        this.compradorProdutoId = compradorProdutoId;
        this.statusCadastroId = statusCadastroId;
        this.codigoBarras = codigoBarras;
        this.prazoValidade = prazoValidade;
        this.fornecedorId = fornecedorId;
        this.utilizacaoProdutoId = utilizacaoProdutoId;
        this.precoCompra = precoCompra;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(String pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public String getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(String pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public int getCategoriaProdutoId() {
        return categoriaProdutoId;
    }

    public void setCategoriaProdutoId(int categoriaProdutoId) {
        this.categoriaProdutoId = categoriaProdutoId;
    }

    public int getFamiliaProdutoId() {
        return familiaProdutoId;
    }

    public void setFamiliaProdutoId(int familiaProdutoId) {
        this.familiaProdutoId = familiaProdutoId;
    }

    public int getCompradorProdutoId() {
        return compradorProdutoId;
    }

    public void setCompradorProdutoId(int compradorProdutoId) {
        this.compradorProdutoId = compradorProdutoId;
    }

    public int getStatusCadastroId() {
        return statusCadastroId;
    }

    public void setStatusCadastroId(int statusCadastroId) {
        this.statusCadastroId = statusCadastroId;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getPrazoValidade() {
        return prazoValidade;
    }

    public void setPrazoValidade(String prazoValidade) {
        this.prazoValidade = prazoValidade;
    }

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public int getUtilizacaoProdutoId() {
        return utilizacaoProdutoId;
    }

    public void setUtilizacaoProdutoId(int utilizacaoProdutoId) {
        this.utilizacaoProdutoId = utilizacaoProdutoId;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
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
