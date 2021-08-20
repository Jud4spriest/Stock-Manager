package com.example.StockManager.estoque;

import java.text.SimpleDateFormat; //Qual objeto de data devo usar?
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;


public class Produto {

    private long id;

    private String nome;
    private String descricao;
    private String categoria;
    private String cor;
    private String peso;
    private String fabricante;
    private String fornecedor;
    private String modelo;
    private double valorInvestido;
    private double precoVenda;

    private int qtd;
    private String rfid;
    private String EAN;
    private Map<String,String> caracteristicas;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    //VERIFICAR OS CONSTRUTUROES.

    public Produto() {
    }

    public Produto(String nome, String categoria, Double valorInvestido, Double precoVenda) {
        this.nome = nome;
        this.categoria = categoria;
        this.valorInvestido = valorInvestido;
        this.precoVenda = precoVenda;
//        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        this.dataEntrada = LocalDate.now();
    }

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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
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

    public Double getValor_investido() {
        return valorInvestido;
    }

    public void setValor_investido(Double valor_investido) {
        this.valorInvestido = valor_investido;
    }

    public Double getPreco_venda() {
        return precoVenda;
    }

    public void setPreco_venda(Double preco_venda) {
        this.precoVenda = preco_venda;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public Map<String, String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Map<String, String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public LocalDate getData_entrada() {
        return dataEntrada;
    }

    public void setData_entrada(LocalDate data_entrada) {
        this.dataEntrada = data_entrada;
    }

    public LocalDate getData_saida() {
        return dataSaida;
    }

    public void setData_saida(LocalDate data_saida) {
        this.dataSaida = data_saida;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cor='" + cor + '\'' +
                ", peso='" + peso + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor_investido=" + valorInvestido +
                ", preco_venda=" + precoVenda +
                ", qtd=" + qtd +
                ", rfid='" + rfid + '\'' +
                ", EAN='" + EAN + '\'' +
                ", caracteristicas=" + caracteristicas +
                ", data_entrada=" + dataEntrada +
                ", data_saida=" + dataSaida +
                '}';
    }

}
