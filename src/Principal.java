public class Principal {
    public static void main(String[]args) {
        Planta p1 = new Planta();
        p1.nombre = "Lavanda";
        p1.altura = 35.5;

        Planta p2 = new Planta();
        p2.nombre = "Romero";
        p2.altura = 40.0;

        System.out.println(p1.nombre + " - " + p1.altura + " cm.");
        System.out.println(p2.nombre + " - " + p2.altura + " cm.");
    }
}
