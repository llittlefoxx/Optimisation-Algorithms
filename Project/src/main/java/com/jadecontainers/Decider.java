package com.jadecontainers;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Decider extends Agent {
	@Override
	protected void setup() {
		ACLMessage message=new ACLMessage(ACLMessage.INFORM);

		super.setup();
	}

}
