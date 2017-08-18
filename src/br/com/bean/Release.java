package br.com.bean;

import java.io.Serializable;

/**
 *
 * @author WevKleyton
 * Bean de geração de relatorios
 */
@SuppressWarnings("serial")
public class Release implements Serializable {
	
	private String loja;
	private String releaseBaixada;
	private String releaseAplicada;

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getReleaseBaixada() {
		return releaseBaixada;
	}

	public void setReleaseBaixada(String releaseBaixada) {
		this.releaseBaixada = releaseBaixada;
	}

	public String getReleaseAplicada() {
		return releaseAplicada;
	}

	public void setReleaseAplicada(String releaseAplicada) {
		this.releaseAplicada = releaseAplicada;
	}

}
