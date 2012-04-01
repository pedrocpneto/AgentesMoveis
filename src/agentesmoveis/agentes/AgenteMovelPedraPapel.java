package agentesmoveis.agentes;

import java.util.ArrayList;

public class AgenteMovelPedraPapel implements AgenteMovel {
	private ArrayList<String> agenciasPendentes;
	private int i;
	public void executarAgente(){
		System.out.println("Pedra, tesoura e papel " + i++);
	}
}
