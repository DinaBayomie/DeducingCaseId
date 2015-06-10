//Java class 
package Main;

import java.awt.List;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.rmi.CORBA.Util;

import org.jbpt.bp.BehaviouralProfile;
import org.jbpt.bp.RelSetType;
import org.jbpt.bp.construct.BPCreatorNet;
import org.jbpt.petri.*;
import org.jbpt.pm.*;
import org.jbpt.pm.bpmn.*;

import py4j.GatewayServer;

public class BehaviouralProfileEntryPoint {

	private BehaviouralProfile<NetSystem, Node> bp1;
	private java.util.List<Node> entities;

	public BehaviouralProfileEntryPoint bpep = null;
	public String startActivity = "";
	NetSystem n = null;
	Set<Transition> transitions = null;

	public BehaviouralProfileEntryPoint() {

		PetriNet net1 = new PetriNet();
		// traffic road example
//based on 50 record
//		Transition t1 = new Transition("Create Fine");
//		Transition t2 = new Transition("Send Fine");
//		Transition t3 = new Transition("Insert Fine Notification");
//		Transition t4 = new Transition("Insert Date Appeal to Prefecture");
//		Transition t5 = new Transition("Add penalty");
//		Transition t6 = new Transition("Send for Credit Collection");
//		Transition t7 = new Transition("Payment");
//		Transition t8 = new Transition("Send Appeal to Prefecture");
//		Transition tt1 = new Transition("tau split");
//		Transition tt2 = new Transition("tau from tree 1");
//		Transition tt3 = new Transition("tau from tree 2");
//		Transition tt4 = new Transition("tau from tree 3");
//		Transition tt5 = new Transition("tau from tree 4");
//
//		net1.addNode(t1);
//		net1.addNode(t2);
//		net1.addNode(t3);
//		net1.addNode(t4);
//		net1.addNode(t5);
//		net1.addNode(t6);
//		net1.addNode(t7);
//		net1.addNode(t8);
//		net1.addNode(tt1);
//		net1.addNode(tt2);
//		net1.addNode(tt3);
//		net1.addNode(tt4);
//		net1.addNode(tt5);
//
//		Place p1 = new Place("1");
//		Place p2 = new Place("2");
//		Place p3 = new Place("3");
//		Place p4 = new Place("4");
//		Place p5 = new Place("5");
//		Place p6 = new Place("6");
//		Place p7 = new Place("7");
//
//		net1.addNode(p1);
//		net1.addNode(p2);
//		net1.addNode(p3);
//		net1.addNode(p4);
//		net1.addNode(p5);
//		net1.addNode(p6);
//		net1.addNode(p7);
//
//		
//		net1.addFlow(p1,t1);
//		net1.addFlow(t1, p2);
//		net1.addFlow(p2, t2);
//		net1.addFlow(p2, tt1);
//		net1.addFlow(t2, p3);
//		net1.addFlow(tt1, p3);
//		net1.addFlow(p3, tt2);
//		net1.addFlow(p3, t3);
//		net1.addFlow(tt2, p4);
//		net1.addFlow(t3, p4);
//		net1.addFlow(p4, tt3);
//		net1.addFlow(p4, t4);
//		net1.addFlow(tt3, p5);
//		net1.addFlow(t4, p5);
//		net1.addFlow(p5, tt4);
//		net1.addFlow(p5, t5);
//		net1.addFlow(tt4, p6);
//		net1.addFlow(t5, p6);
//		net1.addFlow(p6, t6);
//		net1.addFlow(p6, t7);
//		net1.addFlow(p6, t8);
//		net1.addFlow(p6, tt5);
//		net1.addFlow(t6, p7);
//		net1.addFlow(t7, p7);
//		net1.addFlow(t8, p7);
//		net1.addFlow(tt5, p7);
		
		/* Receipt model for 100 case */
//		Transition t1 = new Transition("Confirmation of receipt");
//		Transition t2 = new Transition("T02 Check confirmation of receipt");
//		Transition t3 = new Transition("T04 Determine confirmation of receipt");
//		Transition t4 = new Transition(
//				"T05 Print and send confirmation of receipt");
//		Transition t5 = new Transition("T07-1 Draft intern advice aspect 1");
//		Transition t6 = new Transition("T08 Draft and send request for advice");
//		Transition t7 = new Transition(
//				"T09-1 Process or receive external advice from party 1");
//		Transition t8 = new Transition("T06 Determine necessity of stop advice");
//		Transition t9 = new Transition(
//				"T10 Determine necessity to stop indication");
//		Transition t10 = new Transition("T16 Report reasons to hold request");
//		Transition t11 = new Transition("T17 Check report Y to stop indication");
//		Transition t12 = new Transition(
//				"T19 Determine report Y to stop indication");
//		Transition t13 = new Transition("T20 Print report Y to stop indication");
//		Transition t14 = new Transition(
//				"T11 Create document X request unlicensed");
//		Transition t15 = new Transition(
//				"T12 Check document X request unlicensed");
//		Transition t16 = new Transition(
//				"T14 Determine document X request unlicensed");
//		Transition t17 = new Transition(
//				"T15 Print document X request unlicensed");
//
//		Transition tt1 = new Transition("tau from tree");
//		Transition tt2 = new Transition("tau from tree");
//		Transition tt3 = new Transition("tau from tree");
//		Transition tt4 = new Transition("tau from tree");
//		Transition tt5 = new Transition("tau from tree");
//		Transition tt6 = new Transition("tau from tree");
//		Transition tt7 = new Transition("tau from tree");
//		Transition tt8 = new Transition("tau from tree");
//		Transition tt9 = new Transition("tau from tree");
//
//		net1.addNode(t1);
//		net1.addNode(t2);
//		net1.addNode(t3);
//		net1.addNode(t4);
//		net1.addNode(t5);
//		net1.addNode(t6);
//		net1.addNode(t7);
//		net1.addNode(t8);
//		net1.addNode(t9);
//		net1.addNode(t10);
//		net1.addNode(t11);
//		net1.addNode(t12);
//		net1.addNode(t13);
//		net1.addNode(t14);
//		net1.addNode(t15);
//		net1.addNode(t16);
//		net1.addNode(t17);
//
//		net1.addNode(tt1);
//		net1.addNode(tt2);
//		net1.addNode(tt3);
//		net1.addNode(tt4);
//		net1.addNode(tt5);
//		net1.addNode(tt6);
//		net1.addNode(tt7);
//		net1.addNode(tt8);
//		net1.addNode(tt9);
//
//		Place p1 = new Place("1");
//		Place p2 = new Place("2");
//		Place p3 = new Place("3");
//		Place p4 = new Place("4");
//		Place p5 = new Place("5");
//		Place p6 = new Place("6");
//		Place p7 = new Place("7");
//		Place p8 = new Place("8");
//		Place p9 = new Place("9");
//		Place p10 = new Place("10");
//		Place p11 = new Place("11");
//		Place p12 = new Place("12");
//		Place p13 = new Place("13");
//		Place p14 = new Place("14");
//		Place p15 = new Place("15");
//		Place p16 = new Place("16");
//		Place p17 = new Place("17");
//		Place p18 = new Place("18");
//
//		net1.addNode(p1);
//		net1.addNode(p2);
//		net1.addNode(p3);
//		net1.addNode(p4);
//		net1.addNode(p5);
//		net1.addNode(p6);
//		net1.addNode(p7);
//		net1.addNode(p8);
//		net1.addNode(p9);
//		net1.addNode(p10);
//		net1.addNode(p11);
//		net1.addNode(p12);
//		net1.addNode(p13);
//		net1.addNode(p14);
//		net1.addNode(p15);
//		net1.addNode(p16);
//		net1.addNode(p17);
//		net1.addNode(p18);
//
//		net1.addFlow(p1, t1);
//		net1.addFlow(t1, p2);
//		net1.addFlow(p2, tt1);
//		net1.addFlow(p2, tt2);
//		net1.addFlow(tt2, p3);
//		net1.addFlow(p3, t2);
//		net1.addFlow(t2, p4);
//		net1.addFlow(p4, t3);
//		net1.addFlow(t3, p5);
//		net1.addFlow(p5, t4);
//		net1.addFlow(t4, p6);
//		net1.addFlow(p6, t5);
//		net1.addFlow(p6, tt3);
//		net1.addFlow(t5, p7);
//		net1.addFlow(tt3, p7);
//		net1.addFlow(p7, t6);
//		net1.addFlow(p7, tt4);
//		net1.addFlow(t6, p8);
//		net1.addFlow(tt4, p8);
//		net1.addFlow(p8, t7);
//		net1.addFlow(p8, tt5);
//		net1.addFlow(t7, p9);
//		net1.addFlow(tt5, p9);
//		net1.addFlow(p9, t8);
//		net1.addFlow(t8,p10);
//		net1.addFlow(p10, t9);
//		net1.addFlow(t9, p11);
//		
//		net1.addFlow(tt1, p11);
//		
//		net1.addFlow(p11, tt6);
//		net1.addFlow(p11, t10);
//		net1.addFlow(p11, t14);
//		
//		net1.addFlow(tt6, p18);
//		
//		net1.addFlow(t10,p12);
//		net1.addFlow(p12,t11);
//		net1.addFlow(t11,p13);
//		net1.addFlow(p13,t12);
//		net1.addFlow(t12,p14);
//		net1.addFlow(p14,t13);
//		net1.addFlow(t13,p18);
//		
//		net1.addFlow(t14,p15);
//		net1.addFlow(p15,t15);
//		net1.addFlow(p15,tt7);
//		net1.addFlow(t15,p16);
//		net1.addFlow(tt7,p16);
//		net1.addFlow(p16,t16);
//		net1.addFlow(p16,tt8);
//		net1.addFlow(t16,p17);
//		net1.addFlow(tt8,p17);
//		net1.addFlow(p17,t17);
//		net1.addFlow(p17,tt9);
//		net1.addFlow(t17,p18);
//		net1.addFlow(tt9,p18);
		
		
		Transition t1 = new Transition("Confirmation of receipt");
		Transition t2 = new Transition("T02 Check confirmation of receipt");
		Transition t3 = new Transition("T04 Determine confirmation of receipt");
		Transition t4 = new Transition(
				"T05 Print and send confirmation of receipt");
		Transition t5 = new Transition("T07-1 Draft intern advice aspect 1");
		Transition t6 = new Transition("T08 Draft and send request for advice");
		Transition t7 = new Transition(
				"T09-1 Process or receive external advice from party 1");
		Transition t8 = new Transition("T06 Determine necessity of stop advice");
		Transition t9 = new Transition(
				"T10 Determine necessity to stop indication");
		Transition t10 = new Transition("T16 Report reasons to hold request");
		Transition t11 = new Transition("T17 Check report Y to stop indication");
		Transition t12 = new Transition(
				"T19 Determine report Y to stop indication");
		Transition t13 = new Transition("T20 Print report Y to stop indication");
		Transition t14 = new Transition(
				"T11 Create document X request unlicensed");
		Transition t15 = new Transition(
				"T12 Check document X request unlicensed");
		Transition t16 = new Transition(
				"T14 Determine document X request unlicensed");
		Transition t17 = new Transition(
				"T15 Print document X request unlicensed");
		
		Transition tt1 = new Transition("tau from tree");
		Transition tt2 = new Transition("tau from tree");
		Transition tt3 = new Transition("tau from tree");
		Transition tt4 = new Transition("tau from tree");
		Transition tt5 = new Transition("tau from tree");
		Transition tt6 = new Transition("tau from tree");
		Transition tt7 = new Transition("tau from tree");
		Transition tt8 = new Transition("tau from tree");

		net1.addNode(t1);
		net1.addNode(t2);
		net1.addNode(t3);
		net1.addNode(t4);
		net1.addNode(t5);
		net1.addNode(t6);
		net1.addNode(t7);
		net1.addNode(t8);
		net1.addNode(t9);
		net1.addNode(t10);
		net1.addNode(t11);
		net1.addNode(t12);
		net1.addNode(t13);
		net1.addNode(t14);
		net1.addNode(t15);
		net1.addNode(t16);
		net1.addNode(t17);

		net1.addNode(tt1);
		net1.addNode(tt2);
		net1.addNode(tt3);
		net1.addNode(tt4);
		net1.addNode(tt5);
		net1.addNode(tt6);
		net1.addNode(tt7);
		net1.addNode(tt8);

		Place p1 = new Place("1");
		Place p2 = new Place("2");
		Place p3 = new Place("3");
		Place p4 = new Place("4");
		Place p5 = new Place("5");
		Place p6 = new Place("6");
		Place p7 = new Place("7");
		Place p8 = new Place("8");
		Place p9 = new Place("9");
		Place p10 = new Place("10");
		Place p11 = new Place("11");
		Place p12 = new Place("12");
		Place p13 = new Place("13");
		Place p14 = new Place("14");
		Place p15 = new Place("15");
		Place p16 = new Place("16");
		Place p17 = new Place("17");

		net1.addNode(p1);
		net1.addNode(p2);
		net1.addNode(p3);
		net1.addNode(p4);
		net1.addNode(p5);
		net1.addNode(p6);
		net1.addNode(p7);
		net1.addNode(p8);
		net1.addNode(p9);
		net1.addNode(p10);
		net1.addNode(p11);
		net1.addNode(p12);
		net1.addNode(p13);
		net1.addNode(p14);
		net1.addNode(p15);
		net1.addNode(p16);
		net1.addNode(p17);

		net1.addFlow(p1, t1);
		net1.addFlow(t1, p2);
		net1.addFlow(p2, tt1);
		net1.addFlow(p2, t2);
		
		net1.addFlow(tt1, p10);
		
		
		net1.addFlow(t2, p3);
		net1.addFlow(p3, t3);
		net1.addFlow(t3, p4);
		net1.addFlow(p4, t4);
		net1.addFlow(t4, p5);
		net1.addFlow(p5, t5);
		net1.addFlow(p5, tt2);
		net1.addFlow(t5,p6);
		net1.addFlow(tt2,p6);
		net1.addFlow(p6, t6);
		net1.addFlow(p6, tt3);
		net1.addFlow(t6, p7);
		net1.addFlow(tt3, p7);
		net1.addFlow(p7, t7);
		net1.addFlow(p7, tt4);
		net1.addFlow(t7, p8);
		net1.addFlow(tt4, p8);
		net1.addFlow(p8, t8);
		net1.addFlow(t8, p9);
		net1.addFlow(p9, t9);
		net1.addFlow(t9,p10);
		
		net1.addFlow(p10, t10);
		net1.addFlow(p10, t14);
		net1.addFlow(p10, tt5);
		
		net1.addFlow(tt5,p17);
		
		net1.addFlow( t10,p11);
		net1.addFlow(p11,t11);
		net1.addFlow(t11,p12);
		net1.addFlow(p12,t12);
		net1.addFlow(t12,p13);
		net1.addFlow(p13,t13);
		net1.addFlow(t13,p17);
		
		net1.addFlow(t14,p14);
		net1.addFlow(p14,t15);
		net1.addFlow(p14,tt6);
		net1.addFlow(t15,p15);
		net1.addFlow(tt6,p15);
		net1.addFlow(p15,t16);
		net1.addFlow(p15,tt7);
		net1.addFlow(t16,p16);
		net1.addFlow(tt7,p16);
		net1.addFlow(p16,t17);
		net1.addFlow(p16,tt8);
		net1.addFlow(t17,p17);
		net1.addFlow(tt8,p17);
		
				
		n = new NetSystem(net1);

		n.loadNaturalMarking();
		Node Start_Activity = n.getEnabledTransitionsAtMarking(n.getMarking())
				.iterator().next();

		bp1 = BPCreatorNet.getInstance().deriveRelationSet(n);

		entities = bp1.getEntities();
		transitions = bp1.getModel().getTransitions();

		startActivity = Start_Activity.getLabel();

	}

	public String getStartActivityName() {
		return startActivity.toLowerCase();
	}

	public Hashtable<String, Hashtable> getMatrixRelations() {
		Hashtable<String, Hashtable> matrix = null;

		matrix = new Hashtable<String, Hashtable>();
		Dictionary<String, String> subDic = new Hashtable<String, String>();

		for (Node node : transitions) {
			if (node.getLabel().startsWith("tau"))
				continue;
			Hashtable<String, String> nodeRelationSubDic = new Hashtable<String, String>();
			for (Node node1 : transitions) {
				if (node1.getLabel().startsWith("tau"))
					continue;
				String relation = "none";
				RelSetType rel = bp1.getRelationForEntities(node, node1);
				if (rel == RelSetType.Exclusive) {
					relation = "xor";
				} else if (rel == RelSetType.Interleaving) {
					relation = "and";
				} else if (rel == RelSetType.Order) {
					// check if activity is a direct parent to symbol or not
					Collection<Node> nodes = n.getDirectPredecessors(node1);
					for (Node p : nodes) {
						// System.out.println(""+node.getLabel())
						Collection<Node> pNodes = n.getDirectPredecessors(p);
						if (pNodes.contains(node)) {
							relation = "seq";

						} else {
							for (Node nt : pNodes) {
								/*
								 * Boolean flag = false; if
								 * (nt.getLabel().contains("tau")) {
								 * Collection<Node> tNodes = n
								 * .getDirectPredecessors
								 * (n.getDirectPredecessors(nt)); flag =
								 * tNodes.contains(node); } if (flag) { relation
								 * = "seq"; }
								 */
								if (nt.getLabel().contains("tau")) {
									/*
									 * System.out.println();
									 * System.out.println("info sent : " +
									 * nt.getLabel() + "  node1 " +
									 * node1.getLabel() + " current Node : " +
									 * node.getLabel());
									 */
									Collection<Node> tNodes = GetPredecessors(
											nt, new HashSet<Node>(), node);
									if (tNodes.size() > 0) {
										// System.out.println("seq relation");
										relation = "seq";
									}
								} else if (nt == node) {
									relation = "seq";
								}
							}
						}
					}

				}
				nodeRelationSubDic
						.put(node1.getLabel().toLowerCase(), relation);
			}
			matrix.put(node.getLabel().toLowerCase(), nodeRelationSubDic);
		}

		return matrix;
	}

	public Collection<Node> GetPredecessors(Node currentCheckNode,
			Collection<Node> PredTransNodes, Node nodeForSeq) {

		Collection<Node> Prednodes = n.getDirectPredecessors(n
				.getDirectPredecessors(currentCheckNode));

		for (Node nt : Prednodes) {
			// System.out.println("currentCheckNode nt : " + nt.getLabel());

			Boolean flag = false;
			// boolean tau=false;
			if (nt == nodeForSeq) {
				PredTransNodes.add(nt);
				// System.out.println("continue node is the same");
				return PredTransNodes;

			} else if (nt.getLabel().contains("tau")) {
				Collection<Node> tNodes = n.getDirectPredecessors(n
						.getDirectPredecessors(nt));
				flag = tNodes.contains(nodeForSeq);
				// System.out.println("flag " + flag);
				// tau=true;
			} else {
				// System.out.println("not same or tau");
				continue;
			}
			if (flag) {
				// System.out.println("flag " + flag);
				PredTransNodes.add(nt);
				return PredTransNodes;

			} else {
				PredTransNodes.addAll(GetPredecessors(nt, PredTransNodes,
						nodeForSeq));
			}
		}

		return PredTransNodes;
	}

	public Dictionary<String, ArrayList<String>> getAllParents() {
		Dictionary<String, ArrayList<String>> parentsMatrix = new Hashtable<String, ArrayList<String>>();

		for (Node transition : transitions) {
			if (transition.getLabel().startsWith("tau"))
				continue;
			Collection<Node> nodes = n.getDirectPredecessors(transition);
			ArrayList<String> parentTransitions = new ArrayList<String>();
			for (Node place : nodes) {
				Collection<Node> pNodes = n.getDirectPredecessors(place);
				for (Node pt : pNodes) {
					if (pt.getLabel().startsWith("tau"))
						continue;
					parentTransitions.add(pt.getLabel().toLowerCase());
				}
			}
			parentsMatrix.put(transition.getLabel().toLowerCase(),
					parentTransitions);
		}

		return parentsMatrix;
	}

	public static void main(String[] args) {
		BehaviouralProfileEntryPoint bpep = new BehaviouralProfileEntryPoint();
		Hashtable<String, Hashtable> matrix = bpep.getMatrixRelations();

		System.out.print("	");
		Set<Transition> stransitions = bpep.bp1.getModel().getTransitions();
		/*
		 * ArrayList<Transition> transitions = new ArrayList<Transition>(
		 * stransitions); transitions.sort((t1, t2) ->
		 * t1.getLabel().compareTo(t2.getLabel())); for (Transition transition :
		 * transitions) { System.out.print(transition.getLabel().substring(0, 7)
		 * + "	"); }
		 * 
		 * for (Transition transition : transitions) { System.out.println();
		 * System.out.print(transition.getLabel().substring(0, 7) + "	"); for
		 * (Transition transition1 : transitions) { //
		 * System.out.println(transition1.getLabel());
		 * System.out.print(bpep.bp1.getRelationForEntities(transition,
		 * transition1) + "	 "); } } System.out.println(); System.out.println();
		 * System.out.println(); System.out.print("	");
		 * 
		 * // Hashtable<String, Hashtable> matrix = bpep.getMatrixRelations();
		 * 
		 * /* for (Transition transition : transitions) {
		 * System.out.print(transition.getLabel().substring(0, 10) + "	"); }
		 */
		/*
		 * ArrayList<String> keys = new ArrayList<String>(matrix.keySet());
		 * keys.sort((t, t1) -> t.compareTo(t1)); System.out.print("  "); for
		 * (String e : keys) { System.out.print(e.substring(0, 7) + "  "); } for
		 * (String e : keys) { // Do what you wish with e.getKey() and
		 * e.getValue() System.out.println(); System.out.print(e.substring(0, 7)
		 * + "     "); Hashtable<String, String> rel = matrix.get(e);
		 * ArrayList<String> keysM = new ArrayList<String>(rel.keySet());
		 * keysM.sort((t, t1) -> t.compareTo(t1)); // for (Entry<String, String>
		 * e1 : rel.entrySet()) { for (String km : keysM) { /*
		 * System.out.print("K:"+e1.getKey() + "	");
		 * System.out.print("v:"+e1.getValue() + "	");
		 *//*
			 * System.out.print(rel.get(km).substring(0, 3) + "      "); } }
			 * 
			 * // as its System.out.println(); System.out.println();
			 * System.out.println();
			 */
		System.out.println();
		System.out.println();
		System.out.print(" 	 ");
		for (String e : matrix.keySet()) {
			System.out.print(e.substring(0, 7) + "  ");
		}
		for (String e : matrix.keySet()) {
			// Do what you wish with e.getKey() and e.getValue()
			System.out.println();
			System.out.print(e.substring(0, 7) + "     ");
			Hashtable<String, String> rel = matrix.get(e);

			for (String km : rel.keySet()) {
				System.out.print(rel.get(km).substring(0, 3) + "      ");
			}
		}

		GatewayServer gatewayServer = new GatewayServer(
				new BehaviouralProfileEntryPoint());
		gatewayServer.start();
		System.out.println();
		System.out.println("Gateway Server Started");
	}

}
