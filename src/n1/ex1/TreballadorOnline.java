package n1.ex1;

//En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.


public class TreballadorOnline extends Treballador {
    private Double tarifaPlana;

    public TreballadorOnline(String nom, String cognom, Double preuHora, Double tarifaPlana) {
        super(nom, cognom, preuHora);
        this.tarifaPlana = tarifaPlana;
    }

    public Double getTarifaPlana() {
        return tarifaPlana;
    }

    @Override
    public Double calcularSou(Double horesTreballadesMensuals ) {
        Double soutTotal = this.getPreuHora() * horesTreballadesMensuals + this.tarifaPlana ;
        return soutTotal;
    }

    @Deprecated
    @Override
    public Double calcularSou(Double numHoresTreballades, Double kmRecorreguts) {
        return null;
    }
}
