public class Employee {
    private String nombre;
    private String id;
    private Double salary;


    public Employee(String nombre, String id, Double salary) {
        this.nombre = nombre;
        this.id = id;
        this.salary = salary;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public Double calcularSalario(){
        return salary;
    }

    public void mostrarDetalles(){
        System.out.printf("""
                Nombre: %s%n
                Id: %s%n
                Salario base: %,.1f%n
                """, getNombre(), getId(), getSalary());
    }

    public void mostrarDetalle(String prefijo){
        System.out.printf("""
                %s Nombre: %s%n
                %s Id: %s%n
                %s Salario base: %,.1f%n
                """, prefijo, getNombre(), prefijo, getId(), prefijo, getSalary());
    }
    public String toString(){
        return String.format("Nombre: %s%nId: %s%nSalario base: %,.1f%n", getNombre(), getId(), getSalary());
    }
    

}
