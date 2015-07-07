package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//1	2		3	4	5
//1 2,3,4,5
//1	2		3,4,5
//1	2		3		4,5
//1	2		3		4		5 
//--------------------------------------
//							5,{}
//					4,5
//					4,{}
//			3,4,5
//			3,4
//			3,5
//			3,{}
//		2,3,4,5
//		2,3,4
//		2,3,5
//		2,3
//		2,4,5
//		2,4
//		2,,5	
//		2,{}
//1,2,3,4,5
//1,2,3,4
//1,2,3,5
//1,2,3
//1,2,4,5
//1,2,5
//1,2
//1
//1,3,4,5
//1,3,4
//1,3,5
//1,3
//1,4
//1,4,5
//1,5


public class Subset {
	public static void main(String[] args) {

		// Initial set: it may contains repeated elements
		int[] members = { 1,2 };

		// The actual set
		ArrayList<Integer> set = new ArrayList<Integer>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		for(Integer m : members){
			set1.add(m);
		}
//		System.out.println("set1 = " + set1);

		// The repeated elements would not be inserted in the actual set.
		for (int n : members) {
			if (!set.contains(n)) {
				set.add(n);
			}
		}
//		System.out.println(set);

		// extracts the subset
//		ArrayList<ArrayList<Integer>> subSets = getSubsets(set);
//		System.out.println(subSets);
		
		Set<Set<Integer>> result = powerSet(set1);
		System.out.println(result);
		
	}
	
	// Extracts all subsets of the given set
		/*
		 * Remarks:
		 * 
		 * This method uses a recursive algorithm to find the subsets.
		 * 
		 * This is the algorithm: suppose we want to extract the subsets of
		 * 
		 * A = {a, b, c, ...}
		 * 
		 * First we separate the first element from A:
		 * 
		 * first-element: a
		 * B = {b, c, ...}
		 * 
		 * Now we use this recursive law:
		 * 
		 * The subsets of A are the collection of subsets of B,
		 * plus the collection of subsets of B once again, but this time
		 * the first element a is added to these subset:
		 * 
		 * Subsets-Of (A) = Subsets-Of (B) + ({a} + Subsets-Of (B))
		 * 
		 * For example, if A has only two members:
		 * 
		 * A = {a, b}
		 * 
		 * then
		 * 
		 * first-element = a
		 * B = {b}.
		 * 
		 * The subsets of B:
		 * {}, {b}
		 * 
		 * The subsets of B, a added:
		 * {a}, {a, b}
		 * 
		 * Now the whole collection is
		 * 
		 * Subsets of A: {}, {b}, {a}, {a, b}
		 * 
		 * If the set is an empty set {}, this function
		 * returns the only subset: {}, and recursion terminates here.
		 * 
		 * The input of this method, set, is an ArrayList<Integer>.
		 * It could be an ArrayList of any type because we have not 
		 * done any type specific operation on the elements.
		 * It could also be the generic type, E.
		 * 
		 * The output is an ArrayList of sets, That is the elements
		 * of ArrayList are ArrayList, themselves: ArrayList <ArrayList <E>>
		 * 
		 * */
	private static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
		// final set containing all the sets
		ArrayList<ArrayList<Integer>> subsetCollection = new ArrayList<ArrayList<Integer>>();
		//System.out.println("in function set before if-else subsetCollection " + set.size());
		if (set.size() == 0) {
			// add empty set
			subsetCollection.add(new ArrayList<Integer>());
			System.out.println("in function  if condition subsetCollection I" + subsetCollection);
		} else {
			ArrayList<Integer> reducedSet = new ArrayList<Integer>();
			
			reducedSet.addAll(set);
			System.out.println("in else function reducedSet " + reducedSet);

			int first = reducedSet.remove(0);
			System.out.println("in else function first " + first);
			
			ArrayList<ArrayList<Integer>> subsets = getSubsets(reducedSet);
			System.out.println("in else function subsets I " + subsets);
			
			subsetCollection.addAll(subsets);
			System.out.println("in else function subsetCollection II " + subsetCollection);
			
			subsets = getSubsets(reducedSet);
			System.out.println("in  else function subsets II " + subsets);
			
			for (ArrayList<Integer> subset : subsets) {
				subset.add(0, first);
			}

			subsetCollection.addAll(subsets);
		}

		return subsetCollection;
	}
	
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet){
		Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
		if(originalSet.isEmpty()){
			sets.add(new HashSet<Integer>());
			return sets;
		}
		List<Integer> list = new ArrayList<Integer>(originalSet);
		int head = list.get(0);
		System.out.println("head " + head);
		Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
		System.out.println("rest " + rest);
		for(Set<Integer> set : powerSet(rest)){
			System.out.println("set " + set);
			Set<Integer> newSet = new HashSet<Integer>();
			newSet.add(head);
			System.out.println("newSet.add(head) " + newSet);
			newSet.addAll(set);
			System.out.println("newSet.addall(set) " + newSet);
			sets.add(newSet);
			System.out.println("sets.add(newSet) " + sets);
			sets.add(set);
			System.out.println("sets.add(set); " + sets);
		}
		return sets;
	}

}
