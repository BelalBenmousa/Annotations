package n1.ex1;
public class main {
    public static void main(String[] args) {
        TreballadorOnline treballadorOnline1 = new TreballadorOnline ("Manolo", "Perez", 20.0, 20.0);
        System.out.println("Dades treballador online ");
        System.out.println(treballadorOnline1.toString());
//        Aqui cridem al overwirite amb un paràmetre només
        System.out.println("Sou treballador 1 -> "+treballadorOnline1.calcularSou(50.0));

        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Pepe", "Gutierrez", 30.0);
        System.out.println("Dades treballador Presencial ");
        System.out.println(treballadorPresencial.toString());
//        Aqui cridem al overwirite amb dos paràmetres
        System.out.println("Sou treballador 1 -> "+treballadorPresencial.calcularSou(50.0, 20.0));
    }
}
