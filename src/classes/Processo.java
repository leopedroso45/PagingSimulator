/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Leonardo Severo Pedroso
 * @email leopedroso45@gmail.com
 */
public class Processo {

    private final String id;
    private final int numeroPaginas;
    private final List paginas;
    private Color cor;

    public Processo(String id, int numeroPaginas, Color cor) {
        this.id = id;
        this.numeroPaginas = numeroPaginas;
        this.paginas = new <Pagina>ArrayList();
        this.cor = cor;
    }

    public boolean umaPagina(Pagina pagina0) {
        if (this.numeroPaginas == 1) {
            this.paginas.add(0, pagina0);
            return true;
        } else {
            return false;
        }
    }

    public boolean duasPaginas(Pagina pagina0, Pagina pagina1) {
        if (this.numeroPaginas == 2) {
            this.paginas.add(0, pagina0);
            this.paginas.add(1, pagina1);
            return true;
        } else {
            return false;
        }
    }

    public boolean tresPaginas(Pagina pagina0, Pagina pagina1, Pagina pagina2) {
        if (this.numeroPaginas == 3) {
            this.paginas.add(0, pagina0);
            this.paginas.add(1, pagina1);
            this.paginas.add(2, pagina2);
            return true;
        } else {
            return false;
        }
    }

    public boolean quatroPaginas(Pagina pagina0, Pagina pagina1, Pagina pagina2, Pagina pagina3) {
        if (this.numeroPaginas == 4) {
            this.paginas.add(0, pagina0);
            this.paginas.add(1, pagina1);
            this.paginas.add(2, pagina2);
            this.paginas.add(3, pagina3);
            return true;
        } else {
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public List getPaginas() {
        return paginas;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + this.numeroPaginas;
        hash = 83 * hash + Objects.hashCode(this.paginas);
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
        final Processo other = (Processo) obj;
        if (this.numeroPaginas != other.numeroPaginas) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.paginas, other.paginas)) {
            return false;
        }
        return true;
    }

}
