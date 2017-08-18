package br.com.utilitarios;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import br.com.constantes.ConstantesUsers;

/**
 *
 * @author WevKleyton
 * Classe de conexão via ssh com servidor cliente
 *
 */
public class Conecta {

	Logger log = Logger.getLogger(Conecta.class.getName());

	public Conecta(){
		//Contrutor vazio
	};

	public String Conecta(String host, String command) throws JSchException,IOException, InterruptedException {

		ConstantesUsers constantes = new ConstantesUsers();
		String usuario ;
		String senha;

		JSch jsch = new JSch();
		java.util.Properties config = new java.util.Properties();
		config.put("StrictHostKeyChecking", "no");
		if ( host.contains("aba") || host.contains("sti") || host.contains("rbc") || host.contains("bnv") || host.contains("rmo")){
			usuario = constantes.getUser();
			senha = constantes.getPassword();
		}else{
			usuario = constantes.getUsersocic();
			senha = constantes.getPasswordsocic();
		}
		Session session = jsch.getSession(usuario, host, constantes.getPort());
		session.setPassword(senha);
		session.setConfig(config);
		String saida = null ;
		if(!session.isConnected()){
			session.connect();
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			InputStream in = channel.getInputStream();
			channel.connect();
		     byte[] tmp=new byte[1024];
		      while(true){
		        while(in.available()> 0){
		          int i=in.read(tmp, 0, 1024);
		          if(i<0)break;
//		          System.out.print(new String(tmp, 0, i));
		          saida = new String(tmp,0,i);
		        }
				if (channel.isClosed() == true) {
					channel.disconnect();
					break;

				}
			}
		     
		}else {
			System.out.println("Conexao já estabelecida");
		}
		return saida;
	}

//	public static void main(String[] args) throws JSchException, IOException,
//			InterruptedException {
//
//		String ip = JOptionPane.showInputDialog(null,"Informe o nome ou ip do servidor \n" + "Ex: scobme");
//		String comando = JOptionPane.showInputDialog("Digite o comando");
//
//		Conecta conecta = new Conecta();
//		System.out.println(conecta.Conecta(ip, comando, true));
//	}

}
