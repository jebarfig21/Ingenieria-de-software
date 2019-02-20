/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.controlador;

import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author yisus
 */
@ManagedBean
public class AgregarUsuario {
    
     private String nombre;

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }
     private String correo;
     private String contrasenia;
    private Date fechanacimiento;
public void agregaUsuario(){
    Usuario u= new Usuario();
    u.setNombre(nombre);
    u.setCorreo(correo);
    u.setContrasenia(contrasenia);
    u.setFechanacimiento(fechanacimiento);
    UsuarioDAO udb = new UsuarioDAO();
    udb.save(u);
}

}

