public class Manager extends Employee{
    private Double bonoAnual;

    public Manager(String nombre, String id, double salary, Double bonoAnual){
        super(nombre, id, salary);
        this.bonoAnual = bonoAnual;
    }

    public Double getBonoAnual() {
        return bonoAnual;
    }

    @Override
    public Double calcularSalario() {
        return super.getSalary() + bonoAnual;
    }

    @Override
    public void mostrarDetalles() {
        
        super.mostrarDetalles();
        System.out.printf("Bono anual: %,.1f%n", getBonoAnual());
    }
}
