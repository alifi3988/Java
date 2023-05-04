package com.biblioteca.biblioteca.model.controle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 
 * @author alifi
 *
 *  A parte de segurança será tratado por esse vídeo
 *
 *https://www.youtube.com/watch?time_continue=1614&v=t6prPki7daU&embeds_euri=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3DSpring%2Bboot%2Bsecurity%26sxsrf%3DAPwXEdeNH6HiLDWxNN5IvfHkEiHfpNlNzA%3A1682533016622%26source%3Dlnms%26tbm%3Dvid%26&source_ve_path=MzY4NDIsMzY4NDIsMjM4NTE&feature=emb_title
 */

@RestController
public class InicialControle {
	
	//mensagem inicial
	@RequestMapping("/")
	public String mensagemInicial() {
		return "Seja Bem Vindo ao Sistema de Biblioteca";
	}

}
