package test31.action;

import com.opensymphony.xwork2.ActionSupport;
import test31.dao.VueloDAO;
import test31.model.Vuelo;

import java.util.ArrayList;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by Ingrid on 08/06/2017.
 */
public class VueloAction extends ActionSupport {
    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Vuelo> vuelos = new ArrayList<Vuelo>();

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String test = "hola";
    public String getListaVuelos(){
        VueloDAO vueloDAO = new VueloDAO();
        setVuelos(vueloDAO.listarVuelos());
        return SUCCESS;
    }
}
