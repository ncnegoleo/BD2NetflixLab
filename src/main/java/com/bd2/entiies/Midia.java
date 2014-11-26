/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd2.entiies;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author leonardo
 */
@Entity
public class Midia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "midia_id")
    private Long id;
    @Column(name = "classificacao_indicativa")
    private String classificacaoIndicativa;
    private String duracao;
    private String diretor;
    @Column(name = "data_lancamento")
    private String dataLancamento;
    private String nacionalidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassificacao_indicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacao_indicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getData_lancamento() {
        return dataLancamento;
    }

    public void setData_lancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Midia)) {
            return false;
        }
        Midia other = (Midia) object;
        if ((this.id == null && other.id != null) 
                || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Midia{" + "id=" + id + ", classificacao_indicativa=" 
                + classificacaoIndicativa + ", duracao=" + duracao 
                + ", diretor=" + diretor + ", data_lancamento=" 
                + dataLancamento + ", nacionalidade=" + nacionalidade + '}';
    }

}
