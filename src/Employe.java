public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
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
    public int compareTo(Employe o) {
        return this.id - o.id;
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
        if(!(o instanceof Employe)) return false;
        Employe e = (Employe)o;
        return e.id == this.id;
    }
}
