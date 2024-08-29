package genericidad;

public class Genericidad {

    public static void main(String[] args) {
        Persona newPerson = new Persona("Camilo", 19, "Sanitas", "19/10");
        System.out.println(newPerson.toString());
        Pair nombreEdad = new Pair("Carlos", "32");
        Pair epsNacimiento = new Pair("Salud Total", "10/02");
        Persona otherPerson = new Persona(nombreEdad, epsNacimiento);
        System.out.println(otherPerson.toString());
    }
    
}
