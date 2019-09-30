package coop.equidad.autos.automas.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@GetMapping("/peticion")
	@ResponseBody
	public String peticion() {
		return "El servicio se encuentra arriba";
	}
}
