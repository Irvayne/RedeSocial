package br.com.engenharia;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class HomeController {

	@Get("/")
	public void inicio() {}
}
