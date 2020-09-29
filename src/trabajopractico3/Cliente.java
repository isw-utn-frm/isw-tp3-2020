package trabajopractico3;

import java.util.regex.Pattern;

public class Cliente {

    //ATRIBUTOS
    String ClienteId;
    String ClienteNom;
    String ClienteApe;
    int ClienteEdad;
    int ClienteDNI;
    String ClienteCelular;
    static int conteoCli = 0;

    static boolean validaQueExistaPorLoMenosUnaInstanciaCliente() {
        return conteoCli >= 1;
    }

    public Cliente(String ClienteNom, String ClienteApe, int ClienteEdad, int ClienteDNI, String ClienteCelular) {
        this.ClienteNom = ClienteNom;
        this.ClienteApe = ClienteApe;
        this.ClienteEdad = ClienteEdad;
        this.ClienteDNI = ClienteDNI;
        this.ClienteCelular = ClienteCelular;
        conteoCli++;
    }

    public String getClienteId() {
        return ClienteId;
    }

    public String getClienteNom() {
        return ClienteNom;
    }

    public String getClienteApe() {
        return ClienteApe;
    }

    public int getClienteEdad() {
        return ClienteEdad;
    }

    public void setClienteDNI(int ClienteDNI) {
        this.ClienteDNI = ClienteDNI;
    }

    public void setClienteCelular(String ClienteCelular) {
        this.ClienteCelular = ClienteCelular;
    }

    public static void setConteoCli(int conteoCli) {
        Cliente.conteoCli = conteoCli;
    }

    public void setClienteId(String ClienteId) {
        this.ClienteId = ClienteId;
    }

    public void setClienteNom(String ClienteNom) {
        this.ClienteNom = ClienteNom;
    }

    public void setClienteApe(String ClienteApe) {
        this.ClienteApe = ClienteApe;
    }

    public void setClienteEdad(int ClienteEdad) {
        this.ClienteEdad = ClienteEdad;
    }

    static boolean validaQueElNombreNoTengaCaracteresEspeciales(Cliente cl) {

        return Pattern.matches("[a-zA-Z]+", cl.ClienteNom);
    }

    static boolean queElTelefonoSoloTengaCaracteresNumericos(Cliente cl) {
        return Pattern.matches("[0-9]+", cl.ClienteCelular);
    }

    public static boolean validaDniNoSeaVacio(Cliente c) {
        return c.ClienteDNI > 0;
    }

    public static boolean validaCelularNoSeaVacio(Cliente c) {
        return !c.ClienteCelular.equals("");
    }

    public static boolean validaNomApeNoSeaVacio(Cliente c) {
        return !c.ClienteNom.equals("") && !c.ClienteApe.equals("");
    }
    
    public static boolean validaEdadMayorADieciocho(Cliente c){
        return c.getClienteEdad()>=18;
    }
}
