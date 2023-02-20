public class Trabajador extends Persona {
    private float salario;

    public Trabajador (int edad, String nombre, int telefono, float salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void mostrarDatosExtra(){
        System.out.println("Edad: "+getEdad()+
                "\nNombre: "+ getNombre()+
                "\nTelefono: "+ getTelefono()+
                "\nSalario: "+ salario);
    }
}
