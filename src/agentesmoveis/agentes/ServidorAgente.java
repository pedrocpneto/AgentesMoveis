package agentesmoveis.agentes;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorAgente {
	public static void main(String[] args) {
		AgenteAdapter agente;
		try {
			agente = new AgenteAdapter(new AgenteMovelPedraPapel());
			Naming.rebind(args[0], agente);
			System.out.println("registrado " + args[0]);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
