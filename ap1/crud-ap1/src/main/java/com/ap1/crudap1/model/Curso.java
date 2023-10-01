package com.ap1.crudap1.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    @NotBlank(message = "Campo de nome do curso nao pode ser vazio")
    private String nome;
    @Column(nullable = false)
    @NotBlank(message = "Campo de nome da categoria nao pode ser vazio")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "aulas_id")
    private List<Aulas> aulas;

    public List<Aulas> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aulas> aulas) {
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public void addAulas(Aulas aulas){
        this.aulas.add(aulas);
    }
}
