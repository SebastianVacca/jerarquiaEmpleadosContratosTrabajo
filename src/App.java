public class App {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("Ana Gerente", "G001", 5000.0, 1000.0);
        Developer developer = new Developer("Juan Dev", "D001", 4000.0, "Java");
        Employee empleadoBase = new Employee("Pedro Base", "E001", 3000.0);

       empleadoBase.mostrarDetalles();
       empleadoBase.mostrarDetalle("Detalles del empleado");

       Employee empleado1 = manager;
       empleado1.mostrarDetalles();
       System.out.println(empleado1.calcularSalario());

       Trabajable t1 = manager;
       t1.trabajar();

       Trabajable t2 = developer;
       t2.trabajar();

    }

}
