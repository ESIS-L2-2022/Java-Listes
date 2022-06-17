public class Etudiant extends Personne implements Comparable<Etudiant> {
    private String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public int compareTo(Etudiant o) {
//        if (o.getNom() > this.getNom())
        return 0;
    }

    @Override
    public String toString() {
        return "Etudiant(nom = "+this.getNom()+", prenom, "+this.getPrenom()+"mat ="+this.getMatricule()+")";
    }
}
