/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

public class GeneradorPelicula {
    
    private APIMovie llave;
    private String url;
    private String user;
    // agregar un user (tipo String)

    public void establecerLlave(APIMovie l) { // APINetflix, APIAmazon
        llave = l;
    }

    public void establecerUser(String u) {
        user = u;
    }

    public void establecerUrl(String l) {
        url = String.format("%s%s:%s", l, 
                obtenerLlave().obtenerApiKey(), user);
    }

    public APIMovie obtenerLlave() {
        return llave;
    }

    public String obtenerUser() {
        return user;
    }

    public String obtenerUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url+"\n";
    }
    
}
