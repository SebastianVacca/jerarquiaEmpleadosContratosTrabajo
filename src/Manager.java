public class Manager extends Employee implements Trabajable{
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

    @Override
    public void trabajar() {
        System.out.println("Este es el gerente y su función es dirigir y supervisar");
    }
}
