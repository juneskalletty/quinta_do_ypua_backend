package pousadaQuintaDoYpua.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Hospede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_entrada")
    private Date dataEntrada;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_saida")
    private Date dataSaida;

    @Column(name = "servico_quarto")
    private Boolean servicoQuarto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_acomodacao", referencedColumnName = "id", nullable = false)
    private Acomodacao acomodacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pagamento", referencedColumnName = "id", nullable = false)
    private Pagamento pagamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Boolean getServicoQuarto() {
        return servicoQuarto;
    }

    public void setServicoQuarto(Boolean servicoQuarto) {
        this.servicoQuarto = servicoQuarto;
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hospede hospede = (Hospede) o;
        return Objects.equals(id, hospede.id)
                && Objects.equals(nome, hospede.nome)
                && Objects.equals(cpf, hospede.cpf)
                && Objects.equals(telefone, hospede.telefone)
                && Objects.equals(dataEntrada, hospede.dataEntrada)
                && Objects.equals(dataSaida, hospede.dataSaida)
                && Objects.equals(servicoQuarto, hospede.servicoQuarto)
                && Objects.equals(acomodacao, hospede.acomodacao)
                && Objects.equals(pagamento, hospede.pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, telefone, dataEntrada, dataSaida, servicoQuarto, acomodacao, pagamento);
    }
}
