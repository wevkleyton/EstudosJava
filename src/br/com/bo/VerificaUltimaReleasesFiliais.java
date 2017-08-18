package br.com.bo;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.com.bean.Release;
import br.com.constantes.ConstanteComandos;
import br.com.constantes.ConstanteTeste;
import br.com.gui.FRelease;
import br.com.utilitarios.Conecta;
import br.com.utilitarios.FWaitDialog;

/**
 *
 * @author WevKleyton
 *
 */
public class VerificaUltimaReleasesFiliais  extends javax.swing.JDialog {
	Release release = new Release();
	ConstanteComandos constantes = new ConstanteComandos();
	Conecta conecta = new Conecta();

	@SuppressWarnings("static-access")
	public String verRelease(String loja, int qtdloja) {

		String lojaComParametros = null;
		String releaseAplicada = "cat /var/lib/tomcat6/webapps/cliente_" + loja.toLowerCase() + "/socic-" + loja.toLowerCase() + "-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3";
		
		try {
					
			System.out.println("Loja :" + loja);

		    if (loja.equals("STI")){
				release.setLoja(loja.toUpperCase());
				release.setReleaseAplicada(conecta.Conecta("ubt" + loja.toLowerCase(), releaseAplicada));
				release.setReleaseBaixada(conecta.Conecta("ubt" + loja.toLowerCase(), constantes.getUltima_releaseJap()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + "," +  release.getReleaseAplicada();
			}else if (loja.equals("BME")) {
				String releaseAplicadabmt = "cat /var/lib/tomcat6/webapps/cliente_bmt" + "/socic-bmt" + "-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3";
				release.setLoja(loja.toUpperCase());
				release.setReleaseAplicada(conecta.Conecta("172.17.7.2" , releaseAplicadabmt));
				release.setReleaseBaixada(conecta.Conecta("172.17.7.2" , constantes.getUltima_releaseJap()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + "," +  release.getReleaseAplicada();
				
				
			}else{
				release.setLoja(loja.toUpperCase());
				release.setReleaseBaixada(conecta.Conecta("sco" + loja.toLowerCase(), constantes.getUltima_release()));
				release.setReleaseAplicada(conecta.Conecta("sco" + loja.toLowerCase(), releaseAplicada));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + ","
						+ release.getReleaseAplicada();
			}
//		    fwDialog.disable();
		    
		} catch (Exception e) {
			System.out.println(e);
			lojaComParametros = release.getLoja() + "," + "Falha de Autenticação" + "," + "Falha de Autenticação";
		}
		return lojaComParametros;

	}

	@SuppressWarnings("static-access")
	public void BaixarRelease(String loja, int tdloja) {
		try {
			release.setLoja(loja.toUpperCase());
			
			if (loja.equals("AMT")){
				conecta.Conecta("alt" + loja.toLowerCase(), constantes.getBaixaRelase());
			}else if (loja.equals("STI")){
				conecta.Conecta("ubt" + loja.toLowerCase(), constantes.getBaixaRelase());
			}else if (loja.equals("SAA")){
				conecta.Conecta("sta" + loja.toLowerCase(), constantes.getBaixaRelase());
			}else{
				conecta.Conecta("sco" + loja.toLowerCase(), constantes.getBaixaRelase());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
