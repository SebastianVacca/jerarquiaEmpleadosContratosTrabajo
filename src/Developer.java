public class Developer extends Employee implements Trabajable{
    private String lenguajePrincipal;

    public Developer(String nombre, String id, Double salary, String lenguajePrincipal){
        super(nombre, id, salary);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal(){
        return lenguajePrincipal;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.printf("Lenguaje de programación: %s%n", getLenguajePrincipal());
    }

    @Override
    public void trabajar() {
        System.out.println("Este el desarrollador y se encarga de programar todo y que el negocio siga funcionando");
    }
}
