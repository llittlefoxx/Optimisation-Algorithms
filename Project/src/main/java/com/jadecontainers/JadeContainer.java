package com.jadecontainers;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class JadeContainer {

	public static void main(String[] args){
		Runtime rt=Runtime.instance();
		ProfileImpl pc=new ProfileImpl(false);
		pc.setParameter(ProfileImpl.MAIN_HOST, "localhost");
		AgentContainer ac=rt.createAgentContainer(pc);
		try {
			ac.start();
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
