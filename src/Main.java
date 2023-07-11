public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Ruben");
        persona1.setTelefono(951425852);
        persona1.setEdad(27);

        Persona persona2 = new Persona();
        persona2.setNombre("Carol");
        persona2.setTelefono(945685258);
        persona2.setEdad(41);

        System.out.println("La Persona1 se llama "+persona1.getNombre()+ ", tiene "+
                +persona1.getEdad()+ " y su numero telefonico es "+ persona1.getTelefono());

        System.out.println("La Persona2 se llama "+persona2.getNombre()+ ", tiene "+
                +persona2.getEdad()+ " y su numero telefonico es "+ persona2.getTelefono());
    }
}
