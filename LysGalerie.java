import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;

public class LysGalerie extends javax.swing.JFrame {
    
    
   
    public LysGalerie() {
        initComponents();
        afficherImagesParCategories(); // Appel de la méthode pour charger et afficher les images par catégorie
    
    }

     // Méthode pour charger et afficher les images par catégorie
    private void afficherImagesParCategories() {
        // Chemin du dossier contenant les dossiers de catégories
        String cheminBase = "C:\\Users\\PC\\Desktop\\CodeJavaAvancé\\Lysandre\\src\\Images";

        // Noms des catégories
        String[] categories = {"Chambres", "EspacesCommuns", "Loisirs", "Evenements", "Exterieur", "Services", "Uniques", "Proximite", "Speciaux", "Temoignages"};

        // Panel pour afficher les images
        JPanel panelImages = new JPanel(new FlowLayout());

        for (String categorie : categories) {
            String cheminCategorie = cheminBase + "/" + categorie;
            File dossierCategorie = new File(cheminCategorie);

            if (dossierCategorie.isDirectory()) {
                File[] fichiersImages = dossierCategorie.listFiles();
                if (fichiersImages != null) {
                    for (File fichier : fichiersImages) {
                        if (fichier.isFile()) {
                             BufferedImage image = ImageLoader.loadImage(fichier.getAbsolutePath());
                             if (image != null) {
                            ImageIcon imageIcon = new ImageIcon(fichier.getAbsolutePath());
//                            JLabel label = new JLabel(imageIcon);
                            panelImages.add(label);
                        }
                    }
                }
            }
        }}

        // Ajout du panel contenant les images à la fenêtre
        getContentPane().add(panelImages);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImages = new javax.swing.JPanel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelImagesLayout = new javax.swing.GroupLayout(panelImages);
        panelImages.setLayout(panelImagesLayout);
        panelImagesLayout.setHorizontalGroup(
            panelImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelImagesLayout.setVerticalGroup(
            panelImagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LysGalerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LysGalerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LysGalerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LysGalerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LysGalerie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private javax.swing.JPanel panelImages;
    // End of variables declaration//GEN-END:variables
}
