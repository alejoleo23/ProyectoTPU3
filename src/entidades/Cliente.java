package entidades;

public class Cliente {
    String Nombres;
    String Apellidos;
    String DNI;
    String email;
    String Departamento;
    String Ciudad;
    String Distrito;
    String direccion;
    String password;
    boolean Activo;
       
    public Cliente() {
        this("tania","vera paredes","12345678","tania@gmail.com","La Libertad","Trujillo","Florencia","los naranjos 777","1234",true);
    }

    public Cliente(String Nombres, String Apellidos, String DNI, String email, String Departamento, String Ciudad, String Distrito, String direccion,String password, boolean Activo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.email = email;
        this.Departamento = Departamento;
        this.Ciudad = Ciudad;
        this.Distrito = Distrito;
        this.direccion = direccion;
        this.password=password;
        this.Activo = Activo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getDistrito() {
        return Distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public boolean isActivo() {
        return Activo;
    }
    public int getTamañoCliente(){
        return getNombres().length()*2 + getApellidos().length()*2 + getDNI().length()*2 + getEmail().length()*2 + getDepartamento().length()*2 + getCiudad().length()*2 + getDistrito().length()*2 + getDireccion().length()*2 +getPassword().length()*2+1+ 2 ;
    }
    @Override
    public String toString() {
        return "Cliente{" + "Nombres=" + getNombres() + ", Apellidos=" + getApellidos() + ", DNI=" + getDNI() + ", email=" + getEmail() + ", Departamento=" + getDepartamento() + ", Ciudad=" + getCiudad() + ", Distrito=" + getDistrito() + ", direccion=" + getDireccion() + ", Activo=" + isActivo() + '}';
    }
}
