package agentesmoveis.agentes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AgenteAdapter extends UnicastRemoteObject implements IAgenteAdapterRemote {

	private AgenteMovel agente;
	
	public AgenteAdapter(AgenteMovel agente) throws RemoteException {
		super();
		this.agente = agente;
	}
	
	public AgenteMovel getAgente() throws RemoteException {
		return agente;
	}		
}
