public class Main {
    public static void main(String[] args) {
        AffectationHashMap a = new AffectationHashMap();

        Employe e1 = new Employe(3, "Ali");
        Employe e2 = new Employe(1, "Sana");
        Employe e3 = new Employe(2, "Karim");

        Departement d1 = new Departement(10, "RH");
        Departement d2 = new Departement(20, "IT");
        Departement d3 = new Departement(30, "Finance");

        a.ajouterEmployeDepartement(e1, d1);
        a.ajouterEmployeDepartement(e2, d2);
        a.ajouterEmployeDepartement(e3, d3);

        a.afficherEmployesEtDepartements();

        a.ajouterEmployeDepartement(e1, d3);

        System.out.println("Après tentative d'ajout du même employé :");
        a.afficherEmployesEtDepartements();

        System.out.println("Trié :");
        System.out.println(a.trierMap());
    }
}
