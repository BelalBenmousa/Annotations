package n1.ex2;

public abstract class Treballador {
    private String nom;
    private String cognom;
    private Double preuHora;

    public Treballador(String nom, String cognom, Double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public Double getPreuHora() {
        return preuHora;
    }
    public  Double calcularSou(Double numHoresTreballades){
        Double souTotal = numHoresTreballades * preuHora;

        return souTotal;
    }

    public abstract Double calcularSou(Double numHoresTreballades, Double kmRecorreguts);

    @Override
    public String toString() {
        return "Treballador{" +
                "nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", preuHora=" + preuHora +
                '}';
    }

}
