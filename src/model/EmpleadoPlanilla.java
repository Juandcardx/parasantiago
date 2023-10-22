package model;

public class EmpleadoPlanilla extends Empleado {
    // Se definen las variables necesarias para la ejecución
    private int numHijos;
    private String afp;
    private String onp;

    // Se define el método constructor vacío
    public EmpleadoPlanilla() {
        this.numHijos = 0;
        this.afp = "";
        this.onp = "";
    }

    // Se define el método constructor con parámetros
    public EmpleadoPlanilla(String nombre, String apellido, String dni, String direccion, int edad,
            String formacionAcademica, int aniosExperiencia, int horasTrabajadas, int pagoHoras, int numHijos,
            String afp, String onp) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, aniosExperiencia, horasTrabajadas, pagoHoras);
        this.numHijos = numHijos;
        this.afp = afp;
        this.onp = onp;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getOnp() {
        return onp;
    }

    public void setOnp(String onp) {
        this.onp = onp;
    }

    private double pension() {
        if (onp.equals("ONP 2.5%"))
            return sueldoBruto() * 0.025;
        else if (afp.equals("AFP 1.5%"))
            return sueldoBruto() * 0.015;
        else
            return 0.0;
    }

    private double bonoHijos() {
        if (getNumHijos() > 0 && getNumHijos() <= 2)
            return sueldoBruto() * 0.032;
        else if (getNumHijos() > 2 && getNumHijos() <= 4)
            return sueldoBruto() * 0.05;
        else if (getNumHijos() > 4 && getNumHijos() <= 6)
            return sueldoBruto() * 0.075;
        else
            return 0.0;
    }

    @Override
    public double sueldoNeto() {
        return sueldoBruto() + horasExtras() + bonoHijos() - pension();
    }

    @Override
    public int horasExtras() {
        int horaExtras = getHorasTrabajadas() - 40;
        if (getHorasTrabajadas() > 40)
            return getPagoPorHora() * 2 * horaExtras;
        else
            return 0;
    }

    @Override
    public int numHorasExtras() {
        int horasExtras = getHorasTrabajadas() - 40;
        if (getHorasTrabajadas() > 40)
            return horasExtras;
        else
            return 0;
    }

    @Override
    public double sueldoBruto() {
        return getHorasTrabajadas() * getPagoPorHora();
    }

    @Override
    public String imprimirBoletaPago() {

        return "INFORME DEL TRABAJADOR" + "\n" +
                "----------------------------------" + "\n" +
                "\n" +
                "Datos del Empleado: " + "\n" +
                "Nombres: " + super.getNombre() + "\n" +
                "Apellidos: " + super.getApellido() + "\n" +
                "DNI: " + super.getDni() + "\n" +
                "Telefono: " + super.getEdad() + "\n" +
                "Email: " + super.getDireccion() + "\n" +
                "Formación Academica: " + super.getFormacionAcademica() + "\n" +
                "Años de experiencia: " + super.getAniosExperiencia() + "\n" +
                "\n" +
                "Resumen de Pago: " + "\n" +
                "Sueldo Bruto: $" + this.sueldoBruto() + "\n" +
                "Horas Extras: " + numHorasExtras() + "\n" +
                "Pago por horas Extras: $" + horasExtras() + "\n" +
                "Pension: $" + pension() + "\n" +
                "Bono por hijos: $" + bonoHijos() + "\n" +
                "Sueldo Neto: $" + sueldoNeto();
    }

    @Override
    public void almacenarBoletaPago() {
        model.BaseDeDatos.setDataPlanilla(
                "INSERT INTO planilla (nombre, apellido, dni, edad, direccion, titulo, experiencia, sueldo, horasextra, pagoextra, pension, bono, sueldoneto) VALUES ("
                        + "'" + super.getNombre() + "', '" + super.getApellido() + "', " + super.getDni() + ", "
                        + super.getEdad()
                        + ", '" + super.getDireccion() + "', '" + super.getFormacionAcademica() + "',"
                        + super.getAniosExperiencia() + ", " + sueldoBruto() + ", " + numHorasExtras() + ", "
                        + horasExtras() + ", " + pension() + ", " + bonoHijos() + ", " + sueldoNeto() + ");");
    }
}
