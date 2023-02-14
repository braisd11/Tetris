package iu;


import java.awt.Image;
import javax.swing.JLabel;
import modelo.Xogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author a22braisdr
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    Xogo xogo1;
    public Timer timer;
    /**
     * Creates new form Tetris
     */
    public VentanaPrincipal() {
        initComponents();
        juego.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        panelXogo = new javax.swing.JPanel();
        juego = new javax.swing.JPanel();
        panelTempo = new javax.swing.JPanel();
        tempo = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        panelPuntuacion = new javax.swing.JPanel();
        puntos = new javax.swing.JLabel();
        puntuacion = new javax.swing.JLabel();
        panelLinas = new javax.swing.JPanel();
        lblLblnumlinas = new javax.swing.JLabel();
        numlinas = new javax.swing.JLabel();
        tqlbtnPausa = new javax.swing.JToggleButton();
        tqlbtnPlay = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TETRIS 2.0");

        panelPrincipal.setSize(500, 500);
        panelPrincipal.setBackground(new java.awt.Color(100, 200, 100));
        panelPrincipal.setForeground(new java.awt.Color(100, 200, 100));
        panelPrincipal.setToolTipText("");
        panelPrincipal.setLayout(new java.awt.CardLayout());

        panelBotones.setBackground(new java.awt.Color(100, 200, 100));
        panelBotones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 68)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("TETRIS 2.0");

        botonIniciar.setFont(new java.awt.Font("Sitka Heading", 0, 48)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(0, 0, 0));
        botonIniciar.setText("JUGAR");
        botonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonCerrar.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(0, 0, 0));
        botonCerrar.setText("Salir");
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonCerrar)
                    .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(titulo)
                .addGap(78, 78, 78)
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(botonCerrar)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBotones, "card3");

        panelXogo.setBackground(new java.awt.Color(100, 200, 100));
        panelXogo.setMaximumSize(new java.awt.Dimension(900, 850));
        panelXogo.setPreferredSize(new java.awt.Dimension(900, 810));

        juego.setSize(450, 800);
        juego.setBackground(new java.awt.Color(0, 0, 0));
        juego.setMaximumSize(new java.awt.Dimension(450, 900));
        juego.setMinimumSize(new java.awt.Dimension(450, 900));
        juego.setPreferredSize(new java.awt.Dimension(450, 900));
        juego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                juegoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout juegoLayout = new javax.swing.GroupLayout(juego);
        juego.setLayout(juegoLayout);
        juegoLayout.setHorizontalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        juegoLayout.setVerticalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        panelTempo.setBackground(new java.awt.Color(0, 0, 0));
        panelTempo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, java.awt.Color.green, java.awt.Color.pink, java.awt.Color.red));
        panelTempo.setForeground(new java.awt.Color(0, 0, 0));

        tempo.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        tempo.setForeground(new java.awt.Color(255, 255, 255));
        tempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo.setText("0");

        lblTempo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTempo.setText("TEMPO:");

        javax.swing.GroupLayout panelTempoLayout = new javax.swing.GroupLayout(panelTempo);
        panelTempo.setLayout(panelTempoLayout);
        panelTempoLayout.setHorizontalGroup(
            panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTempoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTempoLayout.setVerticalGroup(
            panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo)
                .addContainerGap())
        );

        panelPuntuacion.setBackground(new java.awt.Color(0, 0, 0));
        panelPuntuacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, java.awt.Color.green, java.awt.Color.pink, java.awt.Color.red));
        panelPuntuacion.setForeground(new java.awt.Color(255, 255, 255));

        puntos.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 255, 255));
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos.setText("0");

        puntuacion.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        puntuacion.setForeground(new java.awt.Color(255, 255, 255));
        puntuacion.setText("PUNTUACIÓN:");

        javax.swing.GroupLayout panelPuntuacionLayout = new javax.swing.GroupLayout(panelPuntuacion);
        panelPuntuacion.setLayout(panelPuntuacionLayout);
        panelPuntuacionLayout.setHorizontalGroup(
            panelPuntuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntuacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPuntuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPuntuacionLayout.createSequentialGroup()
                        .addComponent(puntuacion)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPuntuacionLayout.createSequentialGroup()
                        .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelPuntuacionLayout.setVerticalGroup(
            panelPuntuacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntuacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puntuacion)
                .addGap(18, 18, 18)
                .addComponent(puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelLinas.setBackground(new java.awt.Color(0, 0, 0));
        panelLinas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, java.awt.Color.green, java.awt.Color.pink, java.awt.Color.red));
        panelLinas.setForeground(new java.awt.Color(0, 0, 0));

        lblLblnumlinas.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblLblnumlinas.setForeground(new java.awt.Color(255, 255, 255));
        lblLblnumlinas.setText("NUMERO DE LIÑAS:");

        numlinas.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        numlinas.setForeground(new java.awt.Color(255, 255, 255));
        numlinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numlinas.setText("0");

        javax.swing.GroupLayout panelLinasLayout = new javax.swing.GroupLayout(panelLinas);
        panelLinas.setLayout(panelLinasLayout);
        panelLinasLayout.setHorizontalGroup(
            panelLinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLblnumlinas)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLinasLayout.createSequentialGroup()
                        .addComponent(numlinas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        panelLinasLayout.setVerticalGroup(
            panelLinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLblnumlinas)
                .addGap(18, 18, 18)
                .addComponent(numlinas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tqlbtnPausa.setBackground(new java.awt.Color(150, 150, 150));
        tqlbtnPausa.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tqlbtnPausa.setForeground(new java.awt.Color(255, 255, 255));
        tqlbtnPausa.setText("PAUSA");
        tqlbtnPausa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102)));
        tqlbtnPausa.setFocusPainted(false);
        tqlbtnPausa.setFocusable(false);
        tqlbtnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tqlbtnPausaActionPerformed(evt);
            }
        });

        tqlbtnPlay.setBackground(new java.awt.Color(150, 150, 150));
        tqlbtnPlay.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tqlbtnPlay.setForeground(new java.awt.Color(255, 255, 255));
        tqlbtnPlay.setText("PLAY");
        tqlbtnPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102)));
        tqlbtnPlay.setFocusPainted(false);
        tqlbtnPlay.setFocusable(false);
        tqlbtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tqlbtnPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelXogoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLinas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelXogoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tqlbtnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tqlbtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelXogoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelLinas, panelPuntuacion, panelTempo});

        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addGroup(panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelXogoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tqlbtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tqlbtnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(panelLinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(panelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(panelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelXogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(juego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelXogoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelLinas, panelPuntuacion, panelTempo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelXogo, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelXogo, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTÓN QUE DA INICIO AO XOGO CHAMANDO A INICIARPARTIDA()
    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
        panelBotones.setVisible(false);
        panelPrincipal.setVisible(false);
        panelXogo.setVisible(true);
        iniciarPartida();
    }//GEN-LAST:event_botonIniciarActionPerformed

    
    //CERRA O XOGO
    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    
    
    
    private void juegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juegoKeyPressed
        // TODO add your handling code here:
        if (xogo1.isPausa()){
            
        }
        else {
            if (evt.getKeyChar()=='a' || evt.getKeyChar()=='A' || evt.getKeyCode()==37){
                xogo1.moverFichaEsquerda();
            }
            if (evt.getKeyChar()=='d' || evt.getKeyChar()=='D' || evt.getKeyCode()==39){
                xogo1.moverFichaDereita();
            }
            if (evt.getKeyChar()=='s' || evt.getKeyChar()=='S' || evt.getKeyCode()==40){
               xogo1.moverFichaAbaixo();
            }
            if (evt.getKeyChar()=='w' || evt.getKeyChar()=='W' || evt.getKeyCode()==38){
                xogo1.rotarFicha();
            }
        }
        
    }//GEN-LAST:event_juegoKeyPressed

    private void tqlbtnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tqlbtnPausaActionPerformed
        // TODO add your handling code here:
        timer.stop();
        xogo1.setPausa(true);
    }//GEN-LAST:event_tqlbtnPausaActionPerformed

    private void tqlbtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tqlbtnPlayActionPerformed
        // TODO add your handling code here:
        timer.restart();
        xogo1.setPausa(false);
    }//GEN-LAST:event_tqlbtnPlayActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    //MÉTODO QUE CREA UN OBXETO DA CLASE XOGO E DA INICIO O XOGO
    private void iniciarPartida(){
        xogo1=new Xogo(this);
        crearTimer();
        timer.start();
    }
    
    public void pintarCadrado(JLabel lblCadrado){
        juego.add(lblCadrado);
        juego.updateUI();
    }
    
    public void borrarCadrado(JLabel lblCadrado){
        juego.remove(lblCadrado);
        juego.updateUI();
    }
    
    
    public void crearTimer (){
        timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=tempo.getText();
                int b=(int) Double.parseDouble(a);
                b++;
                tempo.setText(b+"");
                xogo1.moverFichaAbaixo();
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JPanel juego;
    private javax.swing.JLabel lblLblnumlinas;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel numlinas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelLinas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelPuntuacion;
    private javax.swing.JPanel panelTempo;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel puntuacion;
    private javax.swing.JLabel tempo;
    private javax.swing.JLabel titulo;
    private javax.swing.JToggleButton tqlbtnPausa;
    private javax.swing.JToggleButton tqlbtnPlay;
    // End of variables declaration//GEN-END:variables
}
