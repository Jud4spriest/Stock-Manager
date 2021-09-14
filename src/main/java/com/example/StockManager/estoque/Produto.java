package com.example.StockManager.estoque;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat; //Qual objeto de data devo usar?
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table
public class Produto {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private long id;
    @NotNull
    @Size(min = 4, max = 50)
    private String nome;
    private String descricao;
    @NotNull
    private String categoria;
    private String cor;
    @NotNull
    @Size(min = 4, max = 50)
    private String fabricante;
    @NotNull
    @Size(min = 4, max = 50)
    private String fornecedor;
    private String modelo;
    @NotNull
    private float peso;
    @NotNull
    private float investimento;
    @NotNull
    private float preco;

    private int qtd;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

/*    public Produto() {
    }

    public Produto(String nome, String categoria, float investimento, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.peso = 0f;
        this.fabricante = "Nenhum";
        this.fornecedor = "Nenhum";
        this.investimento = investimento;
        this.preco = preco;
        this.dataEntrada = LocalDate.now();
    }*/
    /////////////////////////////////////////////////////////////


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cor='" + cor + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", investimento=" + investimento +
                ", preco=" + preco +
                ", qtd=" + qtd +
                ", dataEntrada=" + dataEntrada +
                ", dataSaida=" + dataSaida +
                '}';
    }
}
