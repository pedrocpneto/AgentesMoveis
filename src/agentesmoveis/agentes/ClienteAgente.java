package agentesmoveis.agentes;

import java.rmi.Naming;

public class ClienteAgente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AgenteMovel j = null;
		try {
			IAgenteAdapterRemote adapter = (IAgenteAdapterRemote)Naming.lookup(args[0]);
			j = adapter.getAgente();
			j.executarAgente();
			IAgenteAdapterRemote novoAdapter = new AgenteAdapter(j);
			Naming.rebind(args[0], novoAdapter);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
