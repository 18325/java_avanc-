import javax.swing.ImageIcon;

public class GalerieImages {
    // Chemin de base des images dans le projet
    private static final String CHEMIN_BASE_IMAGES = "/images/";

    // Méthode pour obtenir une image en fonction de la catégorie et du nom de l'image
    public static ImageIcon getImage(String categorie, String nomImage) {
        // Construire le chemin complet de l'image
        String cheminImage = CHEMIN_BASE_IMAGES + categorie + "/" + nomImage;
        // Charger et retourner l'image sous forme d'ImageIcon
        return new ImageIcon(GalerieImages.class.getResource(cheminImage));
    
}
}
