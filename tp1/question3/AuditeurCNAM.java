package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public String login() {
        nom = nom.substring(0, 6);
        char prenomFirstChar = prenom.charAt(0);
        String login = nom + "_" + prenomFirstChar;
        return login.toLowerCase();
    }

     public String nom() {
        return this.nom;
    }

    public String prenom() {
        return this.prenom;
    }

    public String matricule() {
        return this.matricule;
    }

    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
