package model;

public abstract class Empleado {
    // Se definen las variables necesarias para la ejecución
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int edad;
    private String formacionAcademica;
    private int aniosExperiencia;
    private int horasTrabajadas;
    private int pagoPorHora;

    // Se define el método constructor vacío
    protected Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.direccion = "";
        this.edad = 0;
        this.formacionAcademica = "";
        this.aniosExperiencia = 0;
        this.horasTrabajadas = 0;
        this.pagoPorHora = 0;
    }

    // Se define el método constructor con parámetros
    protected Empleado(String nombre, String apellido, String dni, String direccion, int edad,
            String formacionAcademica, int aniosExperiencia, int horasTrabajadas, int pagoHoras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
        this.aniosExperiencia = aniosExperiencia;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoHoras;
    }

    // Se definen los métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public abstract String imprimirBoletaPago();

    public abstract void almacenarBoletaPago();

    public abstract int horasExtras();

    public abstract int numHorasExtras();

    public abstract double sueldoBruto();

    public abstract double sueldoNeto();
}
