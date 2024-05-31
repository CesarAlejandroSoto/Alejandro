
package uis.edu.co.banco_de_sangre.controlador;

import uis.edu.co.banco_de_sangre.vista.VDonante;
import uis.edu.co.banco_de_sangre.vista.VMenuPrincipal;
import uis.edu.co.banco_de_sangre.vista.VUnidadesDeSangre;

public class ControladorPantallas {
    private static VDonante pantallaDonante;
    private static VMenuPrincipal PantallaMenu; // Corrección: Cambiado el nombre de la variable
    private static VUnidadesDeSangre pantallaUnidadesSangre;

    public static void abrirPantallaDonante() {
        pantallaDonante = new VDonante();
        pantallaDonante.setVisible(true);
        pantallaDonante.setLocationRelativeTo(null);
    }

    public static void cerrarPantallaDonante() {
        pantallaDonante.dispose();
        pantallaDonante = null;
    }

    public static void abrirpantallaMenu() {
        PantallaMenu = new VMenuPrincipal();
        PantallaMenu.setVisible(true);
        PantallaMenu.setLocationRelativeTo(null);
    }

    public static void cerrarPantallaMenu() {
        PantallaMenu.dispose();
        PantallaMenu = null;
    }

    public static void abrirPantallaUnidadesSangre() {
        pantallaUnidadesSangre = new VUnidadesDeSangre();
        pantallaUnidadesSangre.setVisible(true);
        pantallaUnidadesSangre.setLocationRelativeTo(null);
    }

    public static void cerrarPantallaUnidadesSangre() {
        pantallaUnidadesSangre.dispose();
        pantallaUnidadesSangre = null;
    }
}
