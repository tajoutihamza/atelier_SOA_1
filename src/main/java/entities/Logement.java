package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Logement {
    private int reference;
    private String adresse;
    private String delegation;
    private String gouvernorat;
    private String description;
    private String type;
    private float prix;

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    public Logement(){}

    @Override
    public String toString() {
        return "Logement{" +
                "reference=" + reference +
                ", adresse='" + adresse + '\'' +
                ", delegation='" + delegation + '\'' +
                ", gouvernorat='" + gouvernorat + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", prix=" + prix +
                '}';
    }

    public Logement(int reference, String adresse, String delegation, String gouvernorat, String description, String type, float prix) {
        this.reference = reference;
        this.adresse = adresse;
        this.delegation = delegation;
        this.gouvernorat = gouvernorat;
        this.description = description;
        this.type = type;
        this.prix = prix;
    }
}
