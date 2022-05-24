package n1.ex2;
//En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes i el nombre de kilòmetres recorreguts. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més els kilòmetres recorreguts pel preu per kilòmetre.

public class TreballadorPresencial extends Treballador {


    public TreballadorPresencial(String nom, String cognom, Double preuHora) {
        super(nom, cognom, preuHora);

    }

    @Override
    public Double calcularSou(Double numHoresTreballades, Double kmRecorreguts) {
        Double souTotal = numHoresTreballades * getPreuHora() + kmRecorreguts;
        return souTotal;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Deprecated
    public void horasExtra(Double horasTrabajadasExtra, Double numHoresTreballades, Double kmRecorreguts){
        Double sueldoExtra = calcularSou(numHoresTreballades, kmRecorreguts);
        System.out.println("Te toca un total de  "+ (horasTrabajadasExtra * 0.5 + sueldoExtra) +" € extra en tu sueldo ");
    }
}
