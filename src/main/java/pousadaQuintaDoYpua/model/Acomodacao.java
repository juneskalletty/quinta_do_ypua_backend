package pousadaQuintaDoYpua.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Acomodacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "status")
    private String status;

    @Column(name = "valor_diaria")
    private Double valorDiaria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hospede", referencedColumnName = "id", nullable = false)
    private Hospede hospede;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Acomodacao that = (Acomodacao) o;
        return Objects.equals(id, that.id)
                && Objects.equals(nome, that.nome)
                && Objects.equals(status, that.status)
                && Objects.equals(valorDiaria, that.valorDiaria)
                && Objects.equals(hospede, that.hospede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, status, valorDiaria, hospede);
    }
}
