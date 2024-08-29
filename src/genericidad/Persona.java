/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericidad;


class Persona {
    
    private Pair nameAge;
    private Pair epsFnacimiento;

    public Persona(String nombre, Integer edad, String eps, String fnacimiento) {
        nameAge = new Pair<>(nombre, edad);
        epsFnacimiento = new Pair<>(eps, fnacimiento);
    }

    public Persona(Pair nameAge, Pair epsFnacimiento) {
        this.nameAge = nameAge;
        this.epsFnacimiento = epsFnacimiento;
    }
    
    @Override
    public String toString() {
        String message = "Nombre y Edad: " + nameAge.toString() + "\nEps y Fecha de Nacimiento: " + epsFnacimiento.toString();
        return message;
    }

    public void setNameAge(Pair nameAge) {
        this.nameAge = nameAge;
    }

    public void setEpsFnacimiento(Pair epsFnacimiento) {
        this.epsFnacimiento = epsFnacimiento;
    }
    
    
}
