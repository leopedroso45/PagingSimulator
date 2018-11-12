/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Pagina;
import classes.Processo;
import classes.Quadro;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leope
 */
public final class Simulador extends javax.swing.JFrame {

    public List<Quadro> quadros;
    public List<Processo> processos;
    public List<Color> cores;
    public int colorIndex = 0;
    
    public Tabela filha;

    public Simulador() {
        initComponents();
        this.quadros = new <Quadro>ArrayList();
        this.processos = new <Processo>ArrayList();
        this.cores = new <Color>ArrayList();
        criarQuadros();
        criarCores();

    }

    public void criarCores() {
        cores.add(0, Color.red);
        cores.add(1, Color.blue);
        cores.add(2, Color.green);
        cores.add(3, Color.gray);
        cores.add(4, Color.pink);
        cores.add(5, Color.orange);
        cores.add(6, Color.yellow);
        cores.add(7, Color.magenta);
        cores.add(8, Color.cyan);
        cores.add(9, Color.black);
        cores.add(10, Color.darkGray);
    }

    public void criarQuadros() {
        Quadro quadro0 = new Quadro("Q0", mf0);
        Quadro quadro1 = new Quadro("Q1", mf1);
        Quadro quadro2 = new Quadro("Q2", mf2);
        Quadro quadro3 = new Quadro("Q3", mf3);
        Quadro quadro4 = new Quadro("Q4", mf4);
        Quadro quadro5 = new Quadro("Q5", mf5);
        Quadro quadro6 = new Quadro("Q6", mf6);
        Quadro quadro7 = new Quadro("Q7", mf7);
        Quadro quadro8 = new Quadro("Q8", mf8);
        Quadro quadro9 = new Quadro("Q9", mf9);
        Quadro quadro10 = new Quadro("Q10", mf10);
        Quadro quadro11 = new Quadro("Q11", mf11);
        Quadro quadro12 = new Quadro("Q12", mf12);
        Quadro quadro13 = new Quadro("Q13", mf13);
        Quadro quadro14 = new Quadro("Q14", mf14);
        Quadro quadro15 = new Quadro("Q15", mf15);
        Quadro quadro16 = new Quadro("Q16", mf16);
        Quadro quadro17 = new Quadro("Q17", mf17);
        Quadro quadro18 = new Quadro("Q18", mf18);
        Quadro quadro19 = new Quadro("Q19", mf19);
        Quadro quadro20 = new Quadro("Q20", mf20);
        Quadro quadro21 = new Quadro("Q21", mf21);
        Quadro quadro22 = new Quadro("Q22", mf22);
        Quadro quadro23 = new Quadro("Q23", mf23);
        Quadro quadro24 = new Quadro("Q24", mf24);
        Quadro quadro25 = new Quadro("Q25", mf25);
        Quadro quadro26 = new Quadro("Q26", mf26);
        Quadro quadro27 = new Quadro("Q27", mf27);
        Quadro quadro28 = new Quadro("Q28", mf28);
        Quadro quadro29 = new Quadro("Q29", mf29);
        Quadro quadro30 = new Quadro("Q30", mf30);
        Quadro quadro31 = new Quadro("Q31", mf31);
        this.quadros.add(0, quadro0);
        this.quadros.add(1, quadro1);
        this.quadros.add(2, quadro2);
        this.quadros.add(3, quadro3);
        this.quadros.add(4, quadro4);
        this.quadros.add(5, quadro5);
        this.quadros.add(6, quadro6);
        this.quadros.add(7, quadro7);
        this.quadros.add(8, quadro8);
        this.quadros.add(9, quadro9);
        this.quadros.add(10, quadro10);
        this.quadros.add(11, quadro11);
        this.quadros.add(12, quadro12);
        this.quadros.add(13, quadro13);
        this.quadros.add(14, quadro14);
        this.quadros.add(15, quadro15);
        this.quadros.add(16, quadro16);
        this.quadros.add(17, quadro17);
        this.quadros.add(18, quadro18);
        this.quadros.add(19, quadro19);
        this.quadros.add(20, quadro20);
        this.quadros.add(21, quadro21);
        this.quadros.add(22, quadro22);
        this.quadros.add(23, quadro23);
        this.quadros.add(24, quadro24);
        this.quadros.add(25, quadro25);
        this.quadros.add(26, quadro26);
        this.quadros.add(27, quadro27);
        this.quadros.add(28, quadro28);
        this.quadros.add(29, quadro29);
        this.quadros.add(30, quadro30);
        this.quadros.add(31, quadro31);
    }

    public boolean setarQuadrosVazios() {
        int index = 0;
        for (Quadro quadro : quadros) {
            index++;
            if (quadro.isDisponibilidade()) {
                Processo pross = processos.get(processos.size() - 1);
                int qntPag = pross.getNumeroPaginas();
                List<Pagina> pags = pross.getPaginas();
                if (qntPag == 1) {
                    quadro.getPainel().setBackground(pross.getCor());
                    //
                    quadro.setPagina(pags.get(0));
                    //
                    quadro.setDisponibilidade(false);
                    return true;

                } else if (qntPag == 2) {
                    try {
                        if (quadros.get(index).isDisponibilidade()) {
                            quadro.getPainel().setBackground(pross.getCor());
                            //
                            quadro.setPagina(pags.get(0));
                            quadros.get(index).setPagina(pags.get(1));
                            //
                            quadro.setDisponibilidade(false);
                            quadros.get(index).setDisponibilidade(false);
                            Quadro quad = quadros.get(index);
                            quad.getPainel().setBackground(pross.getCor());
                            return true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                        break;
                    };
                } else if (qntPag == 3) {
                    try {
                        if (quadros.get(index).isDisponibilidade() && quadros.get(index + 1).isDisponibilidade()) {
                            quadro.getPainel().setBackground(pross.getCor());
                            //
                            quadro.setPagina(pags.get(0));
                            quadros.get(index).setPagina(pags.get(1));
                            quadros.get(index + 1).setPagina(pags.get(2));
                            //
                            quadro.setDisponibilidade(false);
                            quadros.get(index).setDisponibilidade(false);
                            quadros.get(index + 1).setDisponibilidade(false);
                            quadros.get(index).getPainel().setBackground(pross.getCor());
                            quadros.get(index + 1).getPainel().setBackground(pross.getCor());
                            return true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                        return false;
                    };
                } else if (qntPag == 4) {
                    try {
                        if (quadros.get(index).isDisponibilidade() && quadros.get(index + 1).isDisponibilidade() && quadros.get(index + 2).isDisponibilidade()) {
                            quadro.getPainel().setBackground(pross.getCor());
                            //
                            quadro.setPagina(pags.get(0));
                            quadros.get(index).setPagina(pags.get(1));
                            quadros.get(index + 1).setPagina(pags.get(2));
                            quadros.get(index + 2).setPagina(pags.get(3));
                            //
                            quadros.get(index).getPainel().setBackground(pross.getCor());
                            quadros.get(index + 1).getPainel().setBackground(pross.getCor());
                            quadros.get(index + 2).getPainel().setBackground(pross.getCor());
                            quadro.setDisponibilidade(false);
                            quadros.get(index).setDisponibilidade(false);
                            quadros.get(index + 1).setDisponibilidade(false);
                            quadros.get(index + 2).setDisponibilidade(false);
                            return true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                        return false;
                    };
                } else {
                    return false;
                }

            }
        }
        return false;
    }

    public void fecharFilha(){
        this.filha.setVisible(false);
        this.filha = null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mf0 = new java.awt.Panel();
        mf1 = new java.awt.Panel();
        mf2 = new java.awt.Panel();
        mf3 = new java.awt.Panel();
        mf4 = new java.awt.Panel();
        mf5 = new java.awt.Panel();
        mf6 = new java.awt.Panel();
        mf7 = new java.awt.Panel();
        mf8 = new java.awt.Panel();
        mf9 = new java.awt.Panel();
        mf10 = new java.awt.Panel();
        mf11 = new java.awt.Panel();
        mf12 = new java.awt.Panel();
        mf13 = new java.awt.Panel();
        mf14 = new java.awt.Panel();
        mf15 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        mf24 = new java.awt.Panel();
        mf25 = new java.awt.Panel();
        mf26 = new java.awt.Panel();
        mf27 = new java.awt.Panel();
        mf28 = new java.awt.Panel();
        mf29 = new java.awt.Panel();
        mf30 = new java.awt.Panel();
        mf31 = new java.awt.Panel();
        label28 = new java.awt.Label();
        label29 = new java.awt.Label();
        label35 = new java.awt.Label();
        label36 = new java.awt.Label();
        label37 = new java.awt.Label();
        label38 = new java.awt.Label();
        label39 = new java.awt.Label();
        label40 = new java.awt.Label();
        mf16 = new java.awt.Panel();
        mf17 = new java.awt.Panel();
        mf18 = new java.awt.Panel();
        mf19 = new java.awt.Panel();
        mf20 = new java.awt.Panel();
        mf21 = new java.awt.Panel();
        mf22 = new java.awt.Panel();
        mf23 = new java.awt.Panel();
        label41 = new java.awt.Label();
        label42 = new java.awt.Label();
        label43 = new java.awt.Label();
        label44 = new java.awt.Label();
        label45 = new java.awt.Label();
        label46 = new java.awt.Label();
        label47 = new java.awt.Label();
        label48 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numPag = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pegaPPR = new javax.swing.JTextField();
        retirarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pegaProcPT = new javax.swing.JTextField();
        criarTabButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        sairButton = new javax.swing.JButton();
        pegaIDPCP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historico = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        mf0.setBackground(new java.awt.Color(251, 248, 248));
        mf0.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout mf0Layout = new javax.swing.GroupLayout(mf0);
        mf0.setLayout(mf0Layout);
        mf0Layout.setHorizontalGroup(
            mf0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf0Layout.setVerticalGroup(
            mf0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf1.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf1Layout = new javax.swing.GroupLayout(mf1);
        mf1.setLayout(mf1Layout);
        mf1Layout.setHorizontalGroup(
            mf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf1Layout.setVerticalGroup(
            mf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf2.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf2Layout = new javax.swing.GroupLayout(mf2);
        mf2.setLayout(mf2Layout);
        mf2Layout.setHorizontalGroup(
            mf2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf2Layout.setVerticalGroup(
            mf2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf3.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf3Layout = new javax.swing.GroupLayout(mf3);
        mf3.setLayout(mf3Layout);
        mf3Layout.setHorizontalGroup(
            mf3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf3Layout.setVerticalGroup(
            mf3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf4.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf4Layout = new javax.swing.GroupLayout(mf4);
        mf4.setLayout(mf4Layout);
        mf4Layout.setHorizontalGroup(
            mf4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf4Layout.setVerticalGroup(
            mf4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf5.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf5Layout = new javax.swing.GroupLayout(mf5);
        mf5.setLayout(mf5Layout);
        mf5Layout.setHorizontalGroup(
            mf5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf5Layout.setVerticalGroup(
            mf5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf6.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf6Layout = new javax.swing.GroupLayout(mf6);
        mf6.setLayout(mf6Layout);
        mf6Layout.setHorizontalGroup(
            mf6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf6Layout.setVerticalGroup(
            mf6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf7.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf7Layout = new javax.swing.GroupLayout(mf7);
        mf7.setLayout(mf7Layout);
        mf7Layout.setHorizontalGroup(
            mf7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf7Layout.setVerticalGroup(
            mf7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf8.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf8Layout = new javax.swing.GroupLayout(mf8);
        mf8.setLayout(mf8Layout);
        mf8Layout.setHorizontalGroup(
            mf8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf8Layout.setVerticalGroup(
            mf8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf9.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf9Layout = new javax.swing.GroupLayout(mf9);
        mf9.setLayout(mf9Layout);
        mf9Layout.setHorizontalGroup(
            mf9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf9Layout.setVerticalGroup(
            mf9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf10.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf10Layout = new javax.swing.GroupLayout(mf10);
        mf10.setLayout(mf10Layout);
        mf10Layout.setHorizontalGroup(
            mf10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf10Layout.setVerticalGroup(
            mf10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf11.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf11Layout = new javax.swing.GroupLayout(mf11);
        mf11.setLayout(mf11Layout);
        mf11Layout.setHorizontalGroup(
            mf11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf11Layout.setVerticalGroup(
            mf11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf12.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf12Layout = new javax.swing.GroupLayout(mf12);
        mf12.setLayout(mf12Layout);
        mf12Layout.setHorizontalGroup(
            mf12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf12Layout.setVerticalGroup(
            mf12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf13.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf13Layout = new javax.swing.GroupLayout(mf13);
        mf13.setLayout(mf13Layout);
        mf13Layout.setHorizontalGroup(
            mf13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf13Layout.setVerticalGroup(
            mf13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf14.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf14Layout = new javax.swing.GroupLayout(mf14);
        mf14.setLayout(mf14Layout);
        mf14Layout.setHorizontalGroup(
            mf14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf14Layout.setVerticalGroup(
            mf14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf15.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf15Layout = new javax.swing.GroupLayout(mf15);
        mf15.setLayout(mf15Layout);
        mf15Layout.setHorizontalGroup(
            mf15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf15Layout.setVerticalGroup(
            mf15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("0");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("1");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("2");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setText("3");

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setText("4");

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setText("5");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setText("6");

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setText("7");

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setText("8");

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setText("9");

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setText("10");

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setText("11");

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setText("12");

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setText("13");

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setText("14");

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setText("15");

        mf24.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf24Layout = new javax.swing.GroupLayout(mf24);
        mf24.setLayout(mf24Layout);
        mf24Layout.setHorizontalGroup(
            mf24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf24Layout.setVerticalGroup(
            mf24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf25.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf25Layout = new javax.swing.GroupLayout(mf25);
        mf25.setLayout(mf25Layout);
        mf25Layout.setHorizontalGroup(
            mf25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf25Layout.setVerticalGroup(
            mf25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf26.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf26Layout = new javax.swing.GroupLayout(mf26);
        mf26.setLayout(mf26Layout);
        mf26Layout.setHorizontalGroup(
            mf26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf26Layout.setVerticalGroup(
            mf26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf27.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf27Layout = new javax.swing.GroupLayout(mf27);
        mf27.setLayout(mf27Layout);
        mf27Layout.setHorizontalGroup(
            mf27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf27Layout.setVerticalGroup(
            mf27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf28.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf28Layout = new javax.swing.GroupLayout(mf28);
        mf28.setLayout(mf28Layout);
        mf28Layout.setHorizontalGroup(
            mf28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf28Layout.setVerticalGroup(
            mf28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf29.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf29Layout = new javax.swing.GroupLayout(mf29);
        mf29.setLayout(mf29Layout);
        mf29Layout.setHorizontalGroup(
            mf29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf29Layout.setVerticalGroup(
            mf29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf30.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf30Layout = new javax.swing.GroupLayout(mf30);
        mf30.setLayout(mf30Layout);
        mf30Layout.setHorizontalGroup(
            mf30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf30Layout.setVerticalGroup(
            mf30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf31.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf31Layout = new javax.swing.GroupLayout(mf31);
        mf31.setLayout(mf31Layout);
        mf31Layout.setHorizontalGroup(
            mf31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf31Layout.setVerticalGroup(
            mf31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        label28.setAlignment(java.awt.Label.CENTER);
        label28.setText("31");

        label29.setAlignment(java.awt.Label.CENTER);
        label29.setText("30");

        label35.setAlignment(java.awt.Label.CENTER);
        label35.setText("29");

        label36.setAlignment(java.awt.Label.CENTER);
        label36.setText("28");

        label37.setAlignment(java.awt.Label.CENTER);
        label37.setText("27");

        label38.setAlignment(java.awt.Label.CENTER);
        label38.setText("26");

        label39.setAlignment(java.awt.Label.CENTER);
        label39.setText("25");

        label40.setAlignment(java.awt.Label.CENTER);
        label40.setText("24");

        mf16.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf16Layout = new javax.swing.GroupLayout(mf16);
        mf16.setLayout(mf16Layout);
        mf16Layout.setHorizontalGroup(
            mf16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf16Layout.setVerticalGroup(
            mf16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf17.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf17Layout = new javax.swing.GroupLayout(mf17);
        mf17.setLayout(mf17Layout);
        mf17Layout.setHorizontalGroup(
            mf17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf17Layout.setVerticalGroup(
            mf17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf18.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf18Layout = new javax.swing.GroupLayout(mf18);
        mf18.setLayout(mf18Layout);
        mf18Layout.setHorizontalGroup(
            mf18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf18Layout.setVerticalGroup(
            mf18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf19.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf19Layout = new javax.swing.GroupLayout(mf19);
        mf19.setLayout(mf19Layout);
        mf19Layout.setHorizontalGroup(
            mf19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf19Layout.setVerticalGroup(
            mf19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf20.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf20Layout = new javax.swing.GroupLayout(mf20);
        mf20.setLayout(mf20Layout);
        mf20Layout.setHorizontalGroup(
            mf20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf20Layout.setVerticalGroup(
            mf20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf21.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf21Layout = new javax.swing.GroupLayout(mf21);
        mf21.setLayout(mf21Layout);
        mf21Layout.setHorizontalGroup(
            mf21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf21Layout.setVerticalGroup(
            mf21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf22.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf22Layout = new javax.swing.GroupLayout(mf22);
        mf22.setLayout(mf22Layout);
        mf22Layout.setHorizontalGroup(
            mf22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf22Layout.setVerticalGroup(
            mf22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mf23.setBackground(new java.awt.Color(251, 248, 248));

        javax.swing.GroupLayout mf23Layout = new javax.swing.GroupLayout(mf23);
        mf23.setLayout(mf23Layout);
        mf23Layout.setHorizontalGroup(
            mf23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        mf23Layout.setVerticalGroup(
            mf23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        label41.setAlignment(java.awt.Label.CENTER);
        label41.setText("23");

        label42.setAlignment(java.awt.Label.CENTER);
        label42.setText("22");

        label43.setAlignment(java.awt.Label.CENTER);
        label43.setText("21");

        label44.setAlignment(java.awt.Label.CENTER);
        label44.setText("20");

        label45.setAlignment(java.awt.Label.CENTER);
        label45.setText("19");

        label46.setAlignment(java.awt.Label.CENTER);
        label46.setText("18");

        label47.setAlignment(java.awt.Label.CENTER);
        label47.setText("17");

        label48.setAlignment(java.awt.Label.CENTER);
        label48.setText("16");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(mf31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mf0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mf16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mf31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carregar Processo");

        jLabel2.setText("ID do Processo:");

        jLabel4.setText("Nmr Paginas:");

        numPag.setMaximumRowCount(4);
        numPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        numPag.setToolTipText("");
        numPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPagActionPerformed(evt);
            }
        });

        jButton1.setText("Carregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Retirar Processo");

        jLabel6.setText("ID do Processo:");

        pegaPPR.setAutoscrolls(false);

        retirarButton.setText("Retirar");
        retirarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tabela de Paginas");

        jLabel8.setText("ID do Processo:");

        criarTabButton.setText("Criar");
        criarTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarTabButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(retirarButton))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(criarTabButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(pegaPPR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(pegaProcPT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numPag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pegaIDPCP)))
                            .addComponent(sairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pegaIDPCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pegaPPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retirarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pegaProcPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarTabButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 0, -1, -1));

        historico.setBackground(new java.awt.Color(0, 153, 153));
        historico.setColumns(20);
        historico.setForeground(new java.awt.Color(255, 255, 255));
        historico.setRows(5);
        jScrollPane1.setViewportView(historico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, 400, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Histórico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPagActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //essse
        String processoId = this.pegaIDPCP.getText();
        String aux = (String) numPag.getSelectedItem();
        int numeroPag = Integer.parseInt(aux);
        Processo processo = new Processo(processoId, numeroPag, cores.get(this.colorIndex));
        this.colorIndex++;
        if (this.colorIndex == 11) {
            this.colorIndex = 0;
        }

        if (processo.getNumeroPaginas() == 1) {
            processo.umaPagina(new Pagina(processo.getId() + "00"));
        } else if (processo.getNumeroPaginas() == 2) {
            processo.duasPaginas(new Pagina(processo.getId() + "00"), new Pagina(processo.getId() + "01"));
        } else if (processo.getNumeroPaginas() == 3) {
            processo.tresPaginas(new Pagina(processo.getId() + "00"), new Pagina(processo.getId() + "01"), new Pagina(processo.getId() + "02"));
        } else {
            processo.quatroPaginas(new Pagina(processo.getId() + "00"), new Pagina(processo.getId() + "01"), new Pagina(processo.getId() + "02"), new Pagina(processo.getId() + "03"));
        }
        processos.add(processo);
        if (setarQuadrosVazios()) {
            this.historico.append("Processo de ID: " + processo.getId() + " foi adicionado com " + processo.getNumeroPaginas() + " paginas...\n");
        } else {
            this.historico.append("Não foi possível concluir a solicitação!");
            processos.remove(processo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void retirarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarButtonActionPerformed
        // TODO add your handling code here:
        String nomeProc = this.pegaPPR.getText();
        for (Processo processo : processos) {
            if (processo.getId().equals(nomeProc)) {
                List paginasProc = processo.getPaginas();
                if (processo.getNumeroPaginas() == 1) {
                    try {
                        for (Quadro quadro : quadros) {
                            if (paginasProc.get(0).equals(quadro.getPagina())) {
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                                this.historico.append("Processo: " + processo.getId() + " removido da fila.\n");
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                    };

                } else if (processo.getNumeroPaginas() == 2) {
                    try {
                        for (Quadro quadro : quadros) {
                            if (paginasProc.get(0).equals(quadro.getPagina())) {
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                                this.historico.append("Processo: " + processo.getId() + " removido da fila.\n");
                            } else if (paginasProc.get(1).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                    };
                } else if (processo.getNumeroPaginas() == 3) {
                    try {
                        for (Quadro quadro : quadros) {
                            if (paginasProc.get(0).equals(quadro.getPagina())) {
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                                this.historico.append("Processo: " + processo.getId() + " removido da fila.\n");
                            } else if (paginasProc.get(1).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            } else if (paginasProc.get(2).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                    };
                } else {
                    try {
                        for (Quadro quadro : quadros) {
                            if (paginasProc.get(0).equals(quadro.getPagina())) {
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                                this.historico.append("Processo: " + processo.getId() + " removido da fila.\n");
                            } else if (paginasProc.get(1).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            } else if (paginasProc.get(2).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            } else if (paginasProc.get(3).equals(quadro.getPagina())) {
                                this.historico.append("Pagina: " + quadro.getId() + ".\n");
                                quadro.setPagina(null);
                                quadro.setDisponibilidade(true);
                                quadro.getPainel().setBackground(Color.white);
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ops, algo de errado não está certo!");
                    };
                }

            }
        }
    }//GEN-LAST:event_retirarButtonActionPerformed

    private void criarTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarTabButtonActionPerformed
        // TODO add your handling code here:
        String nome = this.pegaProcPT.getText();
        for (Processo processo : this.processos) {
            if (processo.getId().equals(nome)) {
                filha = new Tabela(processo, this.quadros, this);
                filha.setVisible(true);
            }
        }
    }//GEN-LAST:event_criarTabButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarTabButton;
    private javax.swing.JTextArea historico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label2;
    private java.awt.Label label28;
    private java.awt.Label label29;
    private java.awt.Label label3;
    private java.awt.Label label35;
    private java.awt.Label label36;
    private java.awt.Label label37;
    private java.awt.Label label38;
    private java.awt.Label label39;
    private java.awt.Label label4;
    private java.awt.Label label40;
    private java.awt.Label label41;
    private java.awt.Label label42;
    private java.awt.Label label43;
    private java.awt.Label label44;
    private java.awt.Label label45;
    private java.awt.Label label46;
    private java.awt.Label label47;
    private java.awt.Label label48;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Panel mf0;
    private java.awt.Panel mf1;
    private java.awt.Panel mf10;
    private java.awt.Panel mf11;
    private java.awt.Panel mf12;
    private java.awt.Panel mf13;
    private java.awt.Panel mf14;
    private java.awt.Panel mf15;
    private java.awt.Panel mf16;
    private java.awt.Panel mf17;
    private java.awt.Panel mf18;
    private java.awt.Panel mf19;
    private java.awt.Panel mf2;
    private java.awt.Panel mf20;
    private java.awt.Panel mf21;
    private java.awt.Panel mf22;
    private java.awt.Panel mf23;
    private java.awt.Panel mf24;
    private java.awt.Panel mf25;
    private java.awt.Panel mf26;
    private java.awt.Panel mf27;
    private java.awt.Panel mf28;
    private java.awt.Panel mf29;
    private java.awt.Panel mf3;
    private java.awt.Panel mf30;
    private java.awt.Panel mf31;
    private java.awt.Panel mf4;
    private java.awt.Panel mf5;
    private java.awt.Panel mf6;
    private java.awt.Panel mf7;
    private java.awt.Panel mf8;
    private java.awt.Panel mf9;
    private javax.swing.JComboBox<String> numPag;
    private javax.swing.JTextField pegaIDPCP;
    private javax.swing.JTextField pegaPPR;
    private javax.swing.JTextField pegaProcPT;
    private javax.swing.JButton retirarButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
