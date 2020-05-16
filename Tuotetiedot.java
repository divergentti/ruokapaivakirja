/*
 *  Tekijä: Jari Hiltunen, Hanko, Finland.
 *  Location: KO19LU (maidenhead).
 *  Free to reuse/distribute with written permission by the author.
 */
package ruokapaivakirja;

/**
 * Tekijä: @author Jari Hiltunen
 * Versio: @version 1.0a
 * Lisätään ja muokataan tuotetietoja. Tässä on ideana lukea viivakoodi laitteella
 * muistiin ja käsitellä sitä viivakoodilähtöisesti.
 */

//** Tuodaan tuotteet-lista käsiteltäväksi. */
import java.util.Objects;
import javax.swing.JOptionPane;
/** Tuodaan käsiteltävä taulu. */
import static ruokapaivakirja.Ruokapaivakirja.tuotteet;
/** Tuodaan tarvittava tiedostopolku tietokannalle. */
import static ruokapaivakirja.Ruokapaivakirja.tuotetietokanta;
/** Lisätään ja muokataan tuotetietoja. Tässä on ideana lukea viivakoodi laitteella
 muistiin ja käsitellä sitä viivakoodilähtöisesti. */

public class Tuotetiedot extends javax.swing.JFrame {
/** Laskee monennettako tuotetta käsitellään, yleiskäyttöinen. */    
private int selausTuote=0;  
    /**
     * Creates new form Tuotetiedot
     */
    public Tuotetiedot() {
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

        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        LabelViivakoodi = new javax.swing.JLabel();
        gtin = new javax.swing.JTextField();
        LabelTuote = new javax.swing.JLabel();
        LabelEnergia = new javax.swing.JLabel();
        LabelYksikko = new javax.swing.JLabel();
        LabelProteiini = new javax.swing.JLabel();
        LabelHiilihydraatti = new javax.swing.JLabel();
        LabelRasva = new javax.swing.JLabel();
        LabelHuomautus = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 0), new java.awt.Dimension(500, 32767));
        tuotteenNimi = new javax.swing.JFormattedTextField();
        energiaSisalto = new javax.swing.JTextField();
        yksikko = new javax.swing.JTextField();
        proteiinia = new javax.swing.JTextField();
        hiilihydraattia = new javax.swing.JTextField();
        rasvaa = new javax.swing.JTextField();
        huomautus = new javax.swing.JTextField();
        nappainMuokkausValmis = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        nappainOK = new javax.swing.JButton();
        tyokaluRivi = new javax.swing.JToolBar();
        nappainPeruuta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        tuoteNappainEdellinen = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        tuoteNappainSeuraava = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        nappainMuokkaa = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        valintaAktiivinen = new javax.swing.JCheckBox();
        jSeparator11 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tuotetietokannan muokkaus - (c) Jari Hiltunen");
        setName("Tuotelisays"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tuotetietokannan muokkaus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        LabelViivakoodi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelViivakoodi.setText("Viivakoodi");

        gtin.setToolTipText("Uuden GTIN/EAN-viivakoodi (13 merkkiä). Paina ENTER tarkistaaksesi.");
        gtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtinActionPerformed(evt);
            }
        });

        LabelTuote.setText("Tuotteen nimi");

        LabelEnergia.setText("Energiasisältö");

        LabelYksikko.setText("Yksikkö");

        LabelProteiini.setText("Proteiinia");

        LabelHiilihydraatti.setText("Hiilihydraattia");

        LabelRasva.setText("Rasvaa");

        LabelHuomautus.setText("Huomautus");

        tuotteenNimi.setToolTipText("Tuotteen kuvaava nimi");
        tuotteenNimi.setEnabled(false);
        tuotteenNimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuotteenNimiActionPerformed(evt);
            }
        });

        energiaSisalto.setToolTipText("kcal/yksikkö");
        energiaSisalto.setEnabled(false);
        energiaSisalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energiaSisaltoActionPerformed(evt);
            }
        });

        yksikko.setToolTipText("Vaihtoehdot:\n- 100 (energiaa per 100 grammaa)\n- kpl (energiaa per kpl)\n- annos (energiaa per annos)\n");
        yksikko.setEnabled(false);
        yksikko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yksikkoActionPerformed(evt);
            }
        });

        proteiinia.setToolTipText("Desimaaliarvo 0.0");
        proteiinia.setEnabled(false);
        proteiinia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteiiniaActionPerformed(evt);
            }
        });

        hiilihydraattia.setToolTipText("Desimaaliarvo 0.0");
        hiilihydraattia.setEnabled(false);
        hiilihydraattia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiilihydraattiaActionPerformed(evt);
            }
        });

        rasvaa.setToolTipText("Desimaaliarvo 0.0");
        rasvaa.setEnabled(false);
        rasvaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasvaaActionPerformed(evt);
            }
        });

        huomautus.setToolTipText("Vapaamuotoinen teksti");
        huomautus.setEnabled(false);

        nappainMuokkausValmis.setText("MUOKKAUS VALMIS");
        nappainMuokkausValmis.setToolTipText("Tallenna ja sulje.");
        nappainMuokkausValmis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nappainMuokkausValmis.setEnabled(false);
        nappainMuokkausValmis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nappainMuokkausValmisActionPerformed(evt);
            }
        });

        nappainOK.setText("OK");
        nappainOK.setToolTipText("Tallenna ja sulje.");
        nappainOK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nappainOK.setEnabled(false);
        nappainOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nappainOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelViivakoodi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gtin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(LabelRasva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(rasvaa, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LabelHiilihydraatti, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hiilihydraattia))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelYksikko, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelProteiini, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(energiaSisalto, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(yksikko)
                                        .addComponent(proteiinia))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nappainOK, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nappainMuokkausValmis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelHuomautus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(huomautus))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelTuote, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tuotteenNimi, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(403, 403, 403)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelViivakoodi)
                    .addComponent(gtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTuote, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuotteenNimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(energiaSisalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelYksikko, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yksikko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProteiini, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteiinia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHiilihydraatti, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiilihydraattia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRasva, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rasvaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelHuomautus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huomautus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nappainOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nappainMuokkausValmis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tyokaluRivi.setRollover(true);

        nappainPeruuta.setText("PERUUTA");
        nappainPeruuta.setToolTipText("Peruuta tiedon syöttäminen");
        nappainPeruuta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nappainPeruuta.setFocusable(false);
        nappainPeruuta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nappainPeruuta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nappainPeruuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nappainPeruutaMouseClicked(evt);
            }
        });
        nappainPeruuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nappainPeruutaActionPerformed(evt);
            }
        });
        tyokaluRivi.add(nappainPeruuta);
        tyokaluRivi.add(jSeparator1);

        tuoteNappainEdellinen.setText("<-EDELLINEN");
        tuoteNappainEdellinen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tuoteNappainEdellinen.setFocusable(false);
        tuoteNappainEdellinen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tuoteNappainEdellinen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tuoteNappainEdellinen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuoteNappainEdellinenMouseClicked(evt);
            }
        });
        tyokaluRivi.add(tuoteNappainEdellinen);
        tyokaluRivi.add(jSeparator12);

        tuoteNappainSeuraava.setText("SEURAAVA->");
        tuoteNappainSeuraava.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tuoteNappainSeuraava.setFocusable(false);
        tuoteNappainSeuraava.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tuoteNappainSeuraava.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tuoteNappainSeuraava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuoteNappainSeuraavaMouseClicked(evt);
            }
        });
        tyokaluRivi.add(tuoteNappainSeuraava);
        tyokaluRivi.add(jSeparator2);

        nappainMuokkaa.setText("MUOKKAA");
        nappainMuokkaa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nappainMuokkaa.setFocusable(false);
        nappainMuokkaa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nappainMuokkaa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nappainMuokkaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nappainMuokkaaActionPerformed(evt);
            }
        });
        tyokaluRivi.add(nappainMuokkaa);
        tyokaluRivi.add(jSeparator10);

        valintaAktiivinen.setText("AKTVIIVINEN");
        valintaAktiivinen.setToolTipText("Kertoo onko tuote aktviinen vai merkitty poistettavaksi.");
        valintaAktiivinen.setFocusable(false);
        valintaAktiivinen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        valintaAktiivinen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tyokaluRivi.add(valintaAktiivinen);
        tyokaluRivi.add(jSeparator11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tyokaluRivi, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tyokaluRivi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Tällä lomakkeellla voidaan lisätä ja muokata tuotetietokannassa olevia elementtejä.");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtinActionPerformed
     /** Estetään kenttiin kirjoittaminen. */
     tuotteenNimi.setEnabled(false);
     energiaSisalto.setEnabled(false);
     yksikko.setEnabled(false);
     proteiinia.setEnabled(false);
     hiilihydraattia.setEnabled(false);
     rasvaa.setEnabled(false);
     huomautus.setEnabled(false);
     nappainMuokkausValmis.setEnabled(false);
     valintaAktiivinen.setEnabled(false);
     
     
    /** Tarkistetaan ettei tuotetta ole ennestään olemassa. */
     boolean loytyyTuote=false;
     Long syotettyGtin=0L;
     if (gtin.getText().length()!=13) {
           JOptionPane.showMessageDialog(null,
           "EAN/GTIN tulee olla 13 numeroa pitkä! \nTarkista numero.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
         } //endif pituus    
     if(gtin.getText().length()==13) {
      /** Testataan onko arvo Long. */    
       try {
         syotettyGtin = Long.parseLong(gtin.getText());
         /** Meni läpi, tutkitaan onko ennestään. */
          for (Tuote e : tuotteet) {
          /** Tarkistetaan löytyykö syötetty gtin. */    
          if (Objects.equals(e.getGtin(), syotettyGtin)) {
                // ilmoitetaan, että löytyy ja haetaan kenttiin tiedot
                    tuotteenNimi.setText(e.getTuoteNimi());
                    energiaSisalto.setText(String.valueOf(e.getEnergia()));
                    yksikko.setText(e.getYksikko());
                    proteiinia.setText(String.valueOf(e.getProteiini()));
                    hiilihydraattia.setText(String.valueOf(e.getHiilihydraatti()));
                    rasvaa.setText(String.valueOf(e.getHiilihydraatti()));
                    huomautus.setText(e.getHuomautus());
                    valintaAktiivinen.setEnabled(e.getAktivointi());
                    JOptionPane.showMessageDialog(null,
                    "EAN/GTIN löytyy ennestään! \nTarkista numero.",
                    "Tiedonsyöttövirhe!",
                    JOptionPane.ERROR_MESSAGE);
                    loytyyTuote=true;
                } //endif
           } //end Tuote for ja jos tänne päästiin, kaikki ok
        /** Arvo ei ollut Long. */
       } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,
           "EAN/GTIN tulee olla numeroita! \nTarkista numero.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
       } //catch
     } //if
     /** Aloitetaan uuden tuotteen syöttäminen. */
     if (loytyyTuote==false && syotettyGtin>0L) {
     /** Sallitaan kenttiin kirjoittaminen. */
     tuotteenNimi.setEnabled(true);
     energiaSisalto.setEnabled(true);
     yksikko.setEnabled(true);
     proteiinia.setEnabled(true);
     hiilihydraattia.setEnabled(true);
     rasvaa.setEnabled(true);
     huomautus.setEnabled(true);
     valintaAktiivinen.setEnabled(true);
     /** Tyhjennetään kentät */
     tuotteenNimi.setText("");
     energiaSisalto.setText("0.0");
     yksikko.setText("100");
     proteiinia.setText("0.0");
     hiilihydraattia.setText("0.0");
     rasvaa.setText("0.0");
     huomautus.setText("");
     /** Sallitaan OK  */
     nappainOK.setEnabled(true);
     /** Siirrytään Tuotteen nimi kenttään */
      tuotteenNimi.requestFocus();
    } //if
     //actionListener
    }//GEN-LAST:event_gtinActionPerformed
    
  
     
    private void nappainMuokkausValmisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nappainMuokkausValmisActionPerformed
     /** Näytetään vain aktiiviset. */ 
        Boolean aktiivinen=false;
        if (valintaAktiivinen.isSelected()) {aktiivinen=true;}
     /** Käydään elementit läpi. */   
        for (Tuote e : tuotteet) {
          /** Tarkistetaan löytyykö syötetty gtin. */    
          if (Objects.equals(e.getGtin(), Long.parseLong(gtin.getText()))) {
                  e.setTuoteNimi(tuotteenNimi.getText());
                  e.setEnergia(Double.parseDouble(energiaSisalto.getText()));
                  e.setYksikko(yksikko.getText());
                  e.setProteiini(Double.parseDouble(proteiinia.getText()));
                  e.setHiilihydraatti(Double.parseDouble(hiilihydraattia.getText()));
                  e.setRasva(Double.parseDouble(rasvaa.getText()));
                  e.setHuomautus(huomautus.getText());
                  e.setAktivointi(aktiivinen);
                } //endif
           } //end Tuote for ja jos tänne päästiin, kaikki ok
        nappainMuokkausValmis.setEnabled(false);
        valintaAktiivinen.setEnabled(false);
        gtin.setEnabled(true);
        tuotteenNimi.setEnabled(false);
        energiaSisalto.setEnabled(false);
        yksikko.setEnabled(false);
        proteiinia.setEnabled(false);
        hiilihydraattia.setEnabled(false);
        rasvaa.setEnabled(false);
        huomautus.setEnabled(false);
        nappainOK.setEnabled(true);
        gtin.setText(""); 
        /** Tallennetaan tuotteet levylle. */
      Levytoiminta.tallenna(tuotteet, tuotetietokanta);
           JOptionPane.showMessageDialog(null,
           "Tiedot lisätty ja tallennettu",
                       "Tiedot tallennettu",
                        JOptionPane.INFORMATION_MESSAGE);
       // end - testattu ok //       
        
    }//GEN-LAST:event_nappainMuokkausValmisActionPerformed

    private void tuotteenNimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuotteenNimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuotteenNimiActionPerformed

    private void energiaSisaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energiaSisaltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_energiaSisaltoActionPerformed

    private void hiilihydraattiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiilihydraattiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiilihydraattiaActionPerformed

    private void yksikkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yksikkoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yksikkoActionPerformed

    private void proteiiniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteiiniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteiiniaActionPerformed

    private void rasvaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasvaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rasvaaActionPerformed

    private void nappainPeruutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nappainPeruutaActionPerformed
          dispose();
    }//GEN-LAST:event_nappainPeruutaActionPerformed

    private void nappainMuokkaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nappainMuokkaaActionPerformed
       /** Ollaan muokkaamassa, jolloin ei saa lisätä vaan muuttaa. */    
       /** Sallitaan kenttien muokkaaminen. */
        gtin.setEnabled(false);
        tuotteenNimi.setEnabled(true);
        energiaSisalto.setEnabled(true);
        yksikko.setEnabled(true);
        proteiinia.setEnabled(true);
        hiilihydraattia.setEnabled(true);
        rasvaa.setEnabled(true);
        huomautus.setEnabled(true);
        nappainMuokkausValmis.setEnabled(true);
        valintaAktiivinen.setEnabled(true);
        // end - testattu - ok //
           
               
    }//GEN-LAST:event_nappainMuokkaaActionPerformed

    private void nappainOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nappainOKActionPerformed
/** Loopitetaan kunnes kaikki OK. */               
  boolean arvotOK=false;        
/** Tarkistetaan ovatko annetut arvot sallittuja. GTIN on tarkastettu jo. */    
Double energiaSisaltoApu, proteiiniApu, hiilihydraattiApu, rasvaaApu;
/** Energiasisältö. */
       try {
        energiaSisaltoApu  = Double.parseDouble(energiaSisalto.getText());
       } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,
           "Energiasisältö tulee olla desimaalipisteellä erotettu luku.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
       } //catch
/** Proteiinisisältö. */
       try {
        proteiiniApu  = Double.parseDouble(proteiinia.getText());
       } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,
           "Proteiinimäärän tulee olla desimaalipisteellä erotettu luku.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
       } //catch
/** Hilihydraattisisältö. */
       try {
        hiilihydraattiApu  = Double.parseDouble(hiilihydraattia.getText());
       } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,
           "Hiilihydraattimäärän tulee olla desimaalipisteellä erotettu luku.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
       } //catch
/** Rasvasisältö. */
       try {
        rasvaaApu  = Double.parseDouble(rasvaa.getText());
       } catch (NumberFormatException nfe) {
          JOptionPane.showMessageDialog(null,
           "Rasvamäärän tulee olla desimaalipisteellä erotettu luku.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);
       } //catch
 /** Tuotteen nimi. */
       if (tuotteenNimi.getText().length()<1 || tuotteenNimi.getText().length()>199) {
          JOptionPane.showMessageDialog(null,
           "Tuotteen nimessä on oltava yli 1 merkkiä ja alle 200 merkkiä.",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);    
       } //if       
/** Yksikön tarkastus, voisi muuttaa taulukoksi jos tulee paljon yksiköitä. */   
  String yksikkoApu = yksikko.getText();
      if (yksikkoApu.equals("100") || yksikkoApu.equals("kpl") || yksikkoApu.equals("annos" )) {
            //kaikki ok 
        arvotOK=true;    
      } else { //ei ok
          JOptionPane.showMessageDialog(null,
           "Yksikön tulee olla joko 100, kpl tai annos!",
                       "Tiedonsyöttövirhe!",
                        JOptionPane.ERROR_MESSAGE);    
       } //else
      if (arvotOK) {
       //* Tarkistetaan onko tuote asetettu aktiiviseksi vai eikö ole. */
       Boolean aktiivinen=false;
       if (valintaAktiivinen.isSelected()) {aktiivinen=true;}
        /** Tuotetaan uusi objekti ja tallennetaan se LinkedListiin. */
        tuotteet.add(new Tuote(Long.parseLong(gtin.getText()),tuotteenNimi.getText(), 
               Double.parseDouble(energiaSisalto.getText()), yksikko.getText(),
               Double.parseDouble(proteiinia.getText()),
               Double.parseDouble(hiilihydraattia.getText()),
               Double.parseDouble(rasvaa.getText()),
               huomautus.getText(), aktiivinen));
       /** Tallennetaan tiedot levylle. */
       Levytoiminta.tallenna(tuotteet, tuotetietokanta);
       JOptionPane.showMessageDialog(null,
           "Tiedot lisätty ja tallennettu",
                       "Tiedot tallennettu",
                        JOptionPane.INFORMATION_MESSAGE); 
       /** Tuote lisätty, estetään kaksoissyöttö. */
        tuotteenNimi.setEnabled(false);
        energiaSisalto.setEnabled(false);
        yksikko.setEnabled(false);
        proteiinia.setEnabled(false);
        hiilihydraattia.setEnabled(false);
        rasvaa.setEnabled(false);
        huomautus.setEnabled(false);
        nappainOK.setEnabled(false);
        valintaAktiivinen.setEnabled(false);
         } //ifarvotOK
   
    }//GEN-LAST:event_nappainOKActionPerformed

    private void tuoteNappainEdellinenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuoteNappainEdellinenMouseClicked
        /** Iteroidaan taulun läpi. */
       if (selausTuote>=1 && selausTuote<(tuotteet.size())) {
            selausTuote--;  
       } else {selausTuote=0;}
     /** Näytetään tiedot kentissä. */  
       gtin.setText(String.valueOf(tuotteet.get(selausTuote).getGtin()));
       tuotteenNimi.setText(String.valueOf(tuotteet.get(selausTuote).getTuoteNimi()));
       energiaSisalto.setText(String.valueOf(tuotteet.get(selausTuote).getEnergia()));
       yksikko.setText(String.valueOf(tuotteet.get(selausTuote).getYksikko()));
       proteiinia.setText(String.valueOf(tuotteet.get(selausTuote).getProteiini()));
       hiilihydraattia.setText(String.valueOf(tuotteet.get(selausTuote).getHiilihydraatti()));
       rasvaa.setText(String.valueOf(tuotteet.get(selausTuote).getRasva()));
       huomautus.setText(String.valueOf(tuotteet.get(selausTuote).getHuomautus()));
       valintaAktiivinen.setSelected(tuotteet.get(selausTuote).getAktivointi());
       valintaAktiivinen.setEnabled(false);
                
    }//GEN-LAST:event_tuoteNappainEdellinenMouseClicked

    private void tuoteNappainSeuraavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuoteNappainSeuraavaMouseClicked
     /** Iteroidaan taulun läpi. */
       if (selausTuote>=0 && selausTuote<(tuotteet.size())) {
            selausTuote++;  
       } else {selausTuote=0;}
     /** Näytetään tiedot kentissä. */  
       gtin.setText(String.valueOf(tuotteet.get(selausTuote).getGtin()));
       tuotteenNimi.setText(String.valueOf(tuotteet.get(selausTuote).getTuoteNimi()));
       energiaSisalto.setText(String.valueOf(tuotteet.get(selausTuote).getEnergia()));
       yksikko.setText(String.valueOf(tuotteet.get(selausTuote).getYksikko()));
       proteiinia.setText(String.valueOf(tuotteet.get(selausTuote).getProteiini()));
       hiilihydraattia.setText(String.valueOf(tuotteet.get(selausTuote).getHiilihydraatti()));
       rasvaa.setText(String.valueOf(tuotteet.get(selausTuote).getRasva()));
       huomautus.setText(String.valueOf(tuotteet.get(selausTuote).getHuomautus()));
       valintaAktiivinen.setSelected(tuotteet.get(selausTuote).getAktivointi());
       valintaAktiivinen.setEnabled(false);
        
    }//GEN-LAST:event_tuoteNappainSeuraavaMouseClicked

    private void nappainPeruutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nappainPeruutaMouseClicked
         dispose();
         
    }//GEN-LAST:event_nappainPeruutaMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEnergia;
    private javax.swing.JLabel LabelHiilihydraatti;
    private javax.swing.JLabel LabelHuomautus;
    private javax.swing.JLabel LabelProteiini;
    private javax.swing.JLabel LabelRasva;
    private javax.swing.JLabel LabelTuote;
    private javax.swing.JLabel LabelViivakoodi;
    private javax.swing.JLabel LabelYksikko;
    private javax.swing.JTextField energiaSisalto;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField gtin;
    private javax.swing.JTextField hiilihydraattia;
    private javax.swing.JTextField huomautus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton nappainMuokkaa;
    private javax.swing.JButton nappainMuokkausValmis;
    private javax.swing.JButton nappainOK;
    private javax.swing.JButton nappainPeruuta;
    private javax.swing.JTextField proteiinia;
    private javax.swing.JTextField rasvaa;
    private javax.swing.JButton tuoteNappainEdellinen;
    private javax.swing.JButton tuoteNappainSeuraava;
    private javax.swing.JFormattedTextField tuotteenNimi;
    private javax.swing.JToolBar tyokaluRivi;
    private javax.swing.JCheckBox valintaAktiivinen;
    private javax.swing.JTextField yksikko;
    // End of variables declaration//GEN-END:variables
}
