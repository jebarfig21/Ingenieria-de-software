/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import com.mycompany.modelo.Usuario;
import com.mycompany.modelo.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author jorge
 */
@ManagedBean
public class EliminaUsuario {
    private int idusuario;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public void eliminaUsuario(){
        //Usuario u = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.find(idusuario);
        if(u!=null){
            udao.delete(u);
        }
        
    }
}
