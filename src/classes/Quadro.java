/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Panel;
import java.util.Objects;

/**
 *
 * @author leope
 */
public class Quadro {

    private String Id;
    private boolean disponibilidade;
    private Panel painel;
    private Pagina pagina;

    public Quadro(String Id, Panel painel) {
        this.painel = painel;
        this.Id = Id;
        this.disponibilidade = true;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Panel getPainel() {
        return painel;
    }

    public void setPainel(Panel painel) {
        this.painel = painel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.Id);
        hash = 61 * hash + (this.disponibilidade ? 1 : 0);
        hash = 61 * hash + Objects.hashCode(this.painel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quadro other = (Quadro) obj;
        if (this.disponibilidade != other.disponibilidade) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.painel, other.painel)) {
            return false;
        }
        return true;
    }

}
