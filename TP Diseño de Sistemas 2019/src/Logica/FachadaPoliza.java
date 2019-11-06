package Logica;

import DTO.*;

public class FachadaPoliza {

	public void altaPoliza(PolizaDTO polDTO) {
		GestorPoliza gestorP = new GestorPoliza();
		gestorP.altaPoliza(polDTO);
	}
}
