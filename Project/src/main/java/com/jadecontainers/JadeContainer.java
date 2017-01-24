package com.jadecontainers;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

/*this class allows us to create a normal container
that should be created after the creation of a main container*/

public class JadeContainer {

	public static void main(String[] args) throws StaleProxyException {
		Runtime rt = Runtime.instance();
		ProfileImpl pc = new ProfileImpl(false);
		pc.setParameter(ProfileImpl.MAIN_HOST, "localhost");
		AgentContainer ac = rt.createAgentContainer(pc);
		AgentController agentController=ac.createNewAgent("Acheteur1", "com.jadecontainers.Acheteur", new Object[]{});
		agentController.start();
		AgentController agentController1=ac.createNewAgent("decider", "com.jadecontainers.Decider", new Object[]{});
		agentController1.start();
		try {
			ac.start();
		} catch (ControllerException e) {
			e.printStackTrace();
		}
	}
}
