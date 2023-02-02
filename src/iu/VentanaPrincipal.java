package iu;


import javax.swing.JLabel;
import modelo.Xogo;





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
    /**
     * Creates new form Tetris
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaOpciones = new javax.swing.JDialog();
        panelOpciones = new javax.swing.JPanel();
        panelBotones2 = new javax.swing.JPanel();
        botonDificultad = new javax.swing.JButton();
        botonColorFondo = new javax.swing.JButton();
        botonColorPiezas = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        ventanaColores = new javax.swing.JDialog();
        jColor = new javax.swing.JColorChooser();
        panelBotones3 = new javax.swing.JPanel();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botonIniciar = new javax.swing.JButton();
        botonOpciones = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panelXogo = new javax.swing.JPanel();
        juego = new javax.swing.JPanel();
        tqlbtnPausa = new javax.swing.JToggleButton();
        panelTempo = new javax.swing.JPanel();
        tempo = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        panelPuntuacion = new javax.swing.JPanel();
        puntos = new javax.swing.JLabel();
        puntuacion = new javax.swing.JLabel();
        panelLinas = new javax.swing.JPanel();
        lblLblnumlinas = new javax.swing.JLabel();
        numlinas = new javax.swing.JLabel();
        PROBAS = new javax.swing.JPanel();
        lblCadrado = new javax.swing.JLabel();

        ventanaOpciones.setTitle("Opciones");
        ventanaOpciones.setAlwaysOnTop(true);
        ventanaOpciones.setMinimumSize(new java.awt.Dimension(635, 561));

        panelOpciones.setPreferredSize(new java.awt.Dimension(600, 600));

        panelBotones2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonDificultad.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonDificultad.setText("Dificultad");
        botonDificultad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonColorFondo.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonColorFondo.setText("Color de Fondo");
        botonColorFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonColorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorFondoActionPerformed(evt);
            }
        });

        botonColorPiezas.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonColorPiezas.setText("Color de Piezas");
        botonColorPiezas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cerrar.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotones2Layout = new javax.swing.GroupLayout(panelBotones2);
        panelBotones2.setLayout(panelBotones2Layout);
        panelBotones2Layout.setHorizontalGroup(
            panelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotones2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonColorFondo)
                    .addComponent(botonDificultad)
                    .addComponent(botonColorPiezas)
                    .addComponent(cerrar)))
        );

        panelBotones2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonColorFondo, botonColorPiezas, botonDificultad, cerrar});

        panelBotones2Layout.setVerticalGroup(
            panelBotones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotones2Layout.createSequentialGroup()
                .addComponent(botonDificultad)
                .addGap(18, 18, 18)
                .addComponent(botonColorFondo)
                .addGap(18, 18, 18)
                .addComponent(botonColorPiezas)
                .addGap(18, 18, 18)
                .addComponent(cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotones2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonColorFondo, botonColorPiezas, botonDificultad, cerrar});

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(panelBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(panelBotones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaOpcionesLayout = new javax.swing.GroupLayout(ventanaOpciones.getContentPane());
        ventanaOpciones.getContentPane().setLayout(ventanaOpcionesLayout);
        ventanaOpcionesLayout.setHorizontalGroup(
            ventanaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        ventanaOpcionesLayout.setVerticalGroup(
            ventanaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        ventanaColores.setSize(700, 500);

        jColor.setSize(700, 700);
        jColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonAceptar.setText("Aceptar");
        botonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotones3Layout = new javax.swing.GroupLayout(panelBotones3);
        panelBotones3.setLayout(panelBotones3Layout);
        panelBotones3Layout.setHorizontalGroup(
            panelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotones3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar)
                .addContainerGap())
        );

        panelBotones3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonAceptar, botonCancelar});

        panelBotones3Layout.setVerticalGroup(
            panelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotones3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout ventanaColoresLayout = new javax.swing.GroupLayout(ventanaColores.getContentPane());
        ventanaColores.getContentPane().setLayout(ventanaColoresLayout);
        ventanaColoresLayout.setHorizontalGroup(
            ventanaColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaColoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventanaColoresLayout.setVerticalGroup(
            ventanaColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaColoresLayout.createSequentialGroup()
                .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TETRIS 2.0");

        panelPrincipal.setSize(500, 500);
        panelPrincipal.setToolTipText("");
        panelPrincipal.setLayout(new java.awt.CardLayout());

        panelBotones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonIniciar.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonIniciar.setText("Inicio");
        botonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonOpciones.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonOpciones.setText("Configuración");
        botonOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionesActionPerformed(evt);
            }
        });

        botonCerrar.setFont(new java.awt.Font("Sitka Heading", 0, 36)); // NOI18N
        botonCerrar.setText("Salir");
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 68)); // NOI18N
        titulo.setText("TETRIS 2.0");

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonCerrar)
                    .addComponent(botonOpciones)
                    .addComponent(botonIniciar)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonCerrar, botonIniciar, botonOpciones});

        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(titulo)
                .addGap(78, 78, 78)
                .addComponent(botonIniciar)
                .addGap(28, 28, 28)
                .addComponent(botonOpciones)
                .addGap(33, 33, 33)
                .addComponent(botonCerrar)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonCerrar, botonIniciar, botonOpciones});

        panelPrincipal.add(panelBotones, "card3");

        panelXogo.setBackground(new java.awt.Color(0, 0, 0));

        juego.setBackground(new java.awt.Color(255, 255, 255));
        juego.setPreferredSize(new java.awt.Dimension(450, 800));
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tqlbtnPausa.setBackground(new java.awt.Color(150, 150, 150));
        tqlbtnPausa.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tqlbtnPausa.setForeground(new java.awt.Color(255, 255, 255));
        tqlbtnPausa.setText("PAUSA");
        tqlbtnPausa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102)));
        tqlbtnPausa.setFocusable(false);

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
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTempoLayout.setVerticalGroup(
            panelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTempoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addGap(12, 12, 12)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout panelXogoLayout = new javax.swing.GroupLayout(panelXogo);
        panelXogo.setLayout(panelXogoLayout);
        panelXogoLayout.setHorizontalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLinas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelXogoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(tqlbtnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelXogoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelLinas, panelPuntuacion, panelTempo});

        panelXogoLayout.setVerticalGroup(
            panelXogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelXogoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(tqlbtnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(panelLinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(panelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(panelXogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(juego, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelXogoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelLinas, panelPuntuacion, panelTempo});

        panelPrincipal.add(panelXogo, "card3");

        PROBAS.setBackground(new java.awt.Color(255, 255, 255));

        lblCadrado.setBackground(new java.awt.Color(0, 0, 0));
        lblCadrado.setForeground(new java.awt.Color(0, 0, 0));
        lblCadrado.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCadrado.setMinimumSize(new java.awt.Dimension(50, 50));
        lblCadrado.setOpaque(true);
        lblCadrado.setPreferredSize(new java.awt.Dimension(50, 50));
        lblCadrado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCadradoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout PROBASLayout = new javax.swing.GroupLayout(PROBAS);
        PROBAS.setLayout(PROBASLayout);
        PROBASLayout.setHorizontalGroup(
            PROBASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROBASLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(lblCadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        PROBASLayout.setVerticalGroup(
            PROBASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROBASLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblCadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(766, Short.MAX_VALUE))
        );

        panelPrincipal.add(PROBAS, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTÓN QUE DA INICIO AO XOGO CHAMANDO A INICIARPARTIDA()
    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
        panelBotones.setVisible(false);
        panelXogo.setVisible(true);
        juego.setFocusable(true);
        iniciarPartida();
    }//GEN-LAST:event_botonIniciarActionPerformed

    
    //CERRA O XOGO
    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    //ABRE A VENTÁ DE CONFIGURACIÓN
    private void botonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionesActionPerformed
        // TODO add your handling code here:
        ventanaOpciones.setVisible(true);
    }//GEN-LAST:event_botonOpcionesActionPerformed

    
    //ABRE A PALETA DE CORES PARA ESCOLLER UN E APLICAO AO FONDO DO TETRIS
    private void botonColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColorFondoActionPerformed
        // TODO add your handling code here:
        ventanaOpciones.setVisible(false);
        ventanaColores.setVisible(true);
    }//GEN-LAST:event_botonColorFondoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        ventanaColores.setVisible(false);
        ventanaOpciones.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    //ACEPTA A COR ESCOLLIDA E APLÍCAA A TODO O XOGO
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setBackground(jColor.getColor());
        panelBotones.setBackground(jColor.getColor());
        panelBotones2.setBackground(jColor.getColor());
        panelOpciones.setBackground(jColor.getColor());
        ventanaColores.setVisible(false);
        ventanaOpciones.setVisible(true);
        panelXogo.setBackground(jColor.getColor());
    }//GEN-LAST:event_botonAceptarActionPerformed

    
    
    //CERRA A VENTÁ DE OPCIÓNS
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        ventanaOpciones.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    private void juegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juegoKeyPressed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_juegoKeyPressed

    private void lblCadradoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCadradoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCadradoPropertyChange

    
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
        
    }
    
    public void pintarCadrado(JLabel lblCadrado){
        juego.add(lblCadrado);
        juego.updateUI();
    }
    
    public void borrarCadrado(JLabel lblCadrado){
        juego.remove(lblCadrado);
        juego.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PROBAS;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonColorFondo;
    private javax.swing.JButton botonColorPiezas;
    private javax.swing.JButton botonDificultad;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonOpciones;
    private javax.swing.JButton cerrar;
    private javax.swing.JColorChooser jColor;
    private javax.swing.JPanel juego;
    private javax.swing.JLabel lblCadrado;
    private javax.swing.JLabel lblLblnumlinas;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel numlinas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelBotones2;
    private javax.swing.JPanel panelBotones3;
    private javax.swing.JPanel panelLinas;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelPuntuacion;
    private javax.swing.JPanel panelTempo;
    private javax.swing.JPanel panelXogo;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel puntuacion;
    private javax.swing.JLabel tempo;
    private javax.swing.JLabel titulo;
    private javax.swing.JToggleButton tqlbtnPausa;
    private javax.swing.JDialog ventanaColores;
    private javax.swing.JDialog ventanaOpciones;
    // End of variables declaration//GEN-END:variables
}
