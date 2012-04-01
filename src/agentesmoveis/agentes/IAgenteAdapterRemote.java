package agentesmoveis.agentes;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAgenteAdapterRemote extends Remote {
	AgenteMovel getAgente() throws RemoteException;
}
