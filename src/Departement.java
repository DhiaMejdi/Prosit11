public class Departement {
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return id + " - " + nom;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Departement)) return false;
        Departement d = (Departement)o;
        return d.id == this.id;
    }
}
