package Tema9;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.edad = 27;
        cliente1.nombre = "Ruben";
        cliente1.telefono = 987456123;
        cliente1.credito = 25.9;

        System.out.println(cliente1.nombre + " es un Cliente que posee "+ cliente1.credito + " de credito, tiene "
                        + cliente1.edad + " años y su numero de telefono es " + cliente1.telefono);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 27;
        trabajador1.nombre = "Ruben";
        trabajador1.telefono = 987456123;
        trabajador1.salario = 1200;

        System.out.println(trabajador1.nombre + " es un Trabajador que posee "+ trabajador1.salario + " de salario, tiene "
                + trabajador1.edad + " años y su numero de telefono es " + trabajador1.telefono);
    }


}
