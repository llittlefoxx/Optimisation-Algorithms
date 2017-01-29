package com.jadecontainers;

import com.algorithms.Afficher;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class AlgoOptimisationChargement extends Agent {

	@Override
	protected void setup() {

		System.out.println("I am acheteur ");
		addBehaviour(new Behaviour(this) {
			
			@Override
			public boolean done() {
				Afficher.aff();
			
				return true;
			}
			
			@Override
			public void action() {
				System.out.println("test");
				ACLMessage message=new ACLMessage(ACLMessage.INFORM);
				message.addReceiver(new AID("decider",AID.ISLOCALNAME));
				message.setContent("mmmmsggg");
				send(message);
				
			}
		});

	}

	@Override
	protected void takeDown() {
		System.out.println("I am down");
	}

}
