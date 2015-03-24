package Main;

import org.jbpt.bp.BehaviouralProfile;
import org.jbpt.bp.CausalBehaviouralProfile;
import org.jbpt.bp.RelSetType;
import org.jbpt.bp.construct.BPCreatorNet;
import org.jbpt.bp.construct.CBPCreatorNet;
import org.jbpt.petri.*;


public class main {

	public static void main(String[] args) {
		// Create the net
		PetriNet net1 = new PetriNet();

		// Create the transitions with according labels
		Transition a = new Transition("a");
		Transition b = new Transition("b");
		Transition c = new Transition("c");
		Transition d = new Transition("d");

		// Add transitions to net
		net1.addNode(a);
		net1.addNode(b);
		net1.addNode(c);
		net1.addNode(d);

		// Create places
		Place p1 = new Place("1");
		Place p2 = new Place("2");
		Place p3 = new Place("3");
		Place p4 = new Place("4");
		Place p5 = new Place("5");
		Place p6 = new Place("6");

		// Set one token as the initial marking for this place
		//p1.setTokens(1);
		
		// Add places to net
		net1.addNode(p1);
		net1.addNode(p2);
		net1.addNode(p3);
		net1.addNode(p4);
		net1.addNode(p5);
		net1.addNode(p6);
		
		Marking m = new Marking();
		m.setPetriNet(net1);
		m.put(p1, 1);
		
		// Add control flow edges
		net1.addFlow(p1, a);
		net1.addFlow(a, p2);
		net1.addFlow(a, p3);
		net1.addFlow(p2, b);
		net1.addFlow(p3, c);
		net1.addFlow(b, p4);
		net1.addFlow(c, p5);
		net1.addFlow(p4, d);
		net1.addFlow(p5, d);
		net1.addFlow(d, p6);
		NetSystem n = new NetSystem(net1);
		
		//BehaviouralProfile<PetriNet, Node> bp1= new BehaviouralProfile<PetriNet, Node>(net1, net1.getEntities());
		BehaviouralProfile<NetSystem, Node> bp1 = BPCreatorNet.getInstance().deriveRelationSet(n);
		RelSetType[][] matrix=bp1.getMatrix();
		System.out.print("---------------Exclusive--------------------------");
		bp1.printAllEntities(RelSetType.Exclusive);
		System.out.print("----------------Interleaving----------------------");
		bp1.printAllEntities(RelSetType.Interleaving);
		System.out.print("---------------None--------------------------");
		bp1.printAllEntities(RelSetType.None);
		System.out.print("---------------Order--------------------------");
		bp1.printAllEntities(RelSetType.Order);
		System.out.print("---------------ReverseOrder--------------------------");
		bp1.printAllEntities(RelSetType.ReverseOrder);
		System.out.print("finsih");
		System.out.println();
		//BehaviouralProfile<PetriNet, Node> bp2 = BPCreatorNet.getInstance().deriveBehaviouralProfile(net1);
		CausalBehaviouralProfile<NetSystem, Node> cbp2 = CBPCreatorNet.getInstance().deriveCausalBehaviouralProfile(n);
		cbp2.printAllEntities(RelSetType.Interleaving);
	}

}
