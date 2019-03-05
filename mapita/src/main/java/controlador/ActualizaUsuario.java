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
public class ActualizaUsuario {

    private String nombre;  
    private String correo;
    private String contrasenia;
    private Date fechanacimiento;

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
    
    public void actualizaUsuario(Usuario u){
  
    u.setNombre(nombre);
    u.setCorreo(correo);
    u.setContrasenia(contrasenia);
    u.setFechanacimiento(fechanacimiento);
    UsuarioDAO udb = new UsuarioDAO();
    udb.update(u);
    }
}
