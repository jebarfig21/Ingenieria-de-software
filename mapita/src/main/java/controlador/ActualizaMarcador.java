/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.controlador;
import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;

/**
 *
 * @author yisus
 */
public class ActualizaMarcador {
     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latitud;
     
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    
    public void actualizaMarcador(Marcador m){
 
    m.setIdmarcador(idmarcador);
    m.setDescripcion(descripcion);
    m.setLatitud(latitud);
    m.setLongitud(longitud);
    MarcadorDAO udb = new MarcadorDAO();
    udb.update(m);
    }
}
