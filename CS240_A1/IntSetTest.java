
public class IntSetTest {


    public static void main(String[] args) {
    	
    	//initialize new linked lists
    	IntSet l1 = new IntSet();
		System.out.println(l1);
		
    	IntSet l2 = new IntSet();
		System.out.println(l1);

		// add elements
		l1.addElement(1);
		l1.addElement(2);
		l1.addElement(3);

		l2.addElement(2);
		l2.addElement(1);
		l2.addElement(3);
	
        // Case 1
        System.out.println("------");
        System.out.println("Case 1");
        System.out.println("------");


        System.out.println("Set 1 is: " + l1);
        System.out.println("The size of set 1 is: " + l1.size() + '\n');

        System.out.println("Set 2 is: " + l2);
        System.out.println("The size of set 2 is: " + l2.size() + '\n');

        System.out.println("set 1 contains 1: " + l1.contain(1));
        System.out.println("set 1 contains 4: " + l1.contain(1) + '\n');

        System.out.println("set 1 is a subset of set 2: " + 
l1.subsetOf(l2));
        System.out.println("set 2 is a subset of set 1: " + 
l1.subsetOf(l1) + '\n');

        System.out.println("set 1 is equal to set 2: " + l1.isEqual(l2));
        System.out.println("set 2 is equal to set 1: " + l2.isEqual(l1) + 
'\n');

        System.out.println("A union of set 2 is: " + l1.union(l2));
        System.out.println("A intersection set 2 is: " + 
l1.intersection(l2));
        System.out.println("A complement of set 2 is: " + 
l1.complement(l2) + '\n');

        System.out.println("Removing 1 to set 1");
        l1.remove(1);
        System.out.println("Set 1 is now: " + l1);
        System.out.println("The size of set 1 is: " + l1.size() + '\n');

        System.out.println("Removing 3 to set 1");
        l1.remove(3);
        System.out.println("Set 1 is now: " + l1);
        System.out.println("The size of set 1 is: " + l1.size() + '\n');

        System.out.println("Adding 1 to set 1 ");
        l1.addElement(1);
        System.out.println("Set 1 is now: " + l1);
        System.out.println("The size of set 1 is: " + l1.size() + '\n');

        System.out.println("Adding 2 to set 1");
        l1.addElement(2);
        System.out.println("set 1 is now: " + l1);
        System.out.println("The size of set 1 is: " + l1.size() + '\n');

        // Case 2 
        System.out.println("---------");
        System.out.println("Case 2 ");
        System.out.println("---------");

        IntSet l3 = new IntSet();
		System.out.println(l3);
		
    	IntSet l4 = new IntSet();
		System.out.println(l4);

		// add elements
		l1.addElement(1);
	

		l2.addElement(1);
		l2.addElement(2);
	

        System.out.println("Set 1 is: " + l3);
        System.out.println("The size of set 1 is: " + l3.size() + '\n');

        System.out.println("Set 2 is: " + l4);
        System.out.println("The size of set 2 is: " + l4.size() + '\n');

        System.out.println("Set 1 contains 1: " + l3.contain(1));
        System.out.println("Set 2 contains 5: " + l3.contain(5) + '\n');

        System.out.println("Set 1 is a subset of Set 2: " + 
l3.subsetOf(l4));
        System.out.println("Set 2 is a subset of Set 1: " + 
l4.subsetOf(l3) + '\n');

        System.out.println("Set 1 is equal to Set 2: " + l3.isEqual(l4));
        System.out.println("Set 2 is equal to Set 1: " + l4.isEqual(l3) + 
'\n');

        System.out.println("Set 1 union Set 2 is: " + l3.union(l4));
        System.out.println("Set 1 intersection Set 2 is: " + 
l3.intersection(l4));
        System.out.println("Set 1 complement Set 2 is: " + 
l3.complement(l4) + '\n');

        System.out.println("Removing 1 from set A: ");
        l3.remove(1);
        System.out.println("Set 1 is now: " + l3);
        System.out.println("The size of set 1 is: " + l3.size() + '\n');


        System.out.println("Adding 3 to set 1: " );
        l3.addElement(3);
        System.out.println("Set 1 is now: " + l3);
        System.out.println("The size of set 1 is: " + l3.size() + '\n');

        System.out.println("Adding 8 to set 2: ");
        l4.addElement(8);
        System.out.println("set 2 is now: " + l4);
        System.out.println("The size of set 1 is: " + l3.size() + '\n');

        // Case 3 
        System.out.println("------");
        System.out.println("Case 3");
        System.out.println("------");
        IntSet l5 = new IntSet();
		System.out.println(l5);
		
    	IntSet l6 = new IntSet();
		System.out.println(l6);

		// add elements
		l5.addElement(1);
		l5.addElement(2);
		l5.addElement(3);
	

		l6.addElement(2);
		l6.addElement(3);
		l6.addElement(4);
		l6.addElement(5);
	

        System.out.println("Set 1 is: " + l5);
        System.out.println("The size of set 1 is: " + l5.size() + '\n');

        System.out.println("Set 2 is: " + l6);
        System.out.println("The size of set 2 is: " + l6.size() + '\n');

        System.out.println("Set 1 contains 1: " + l5.contain(1));
        System.out.println("Set 2 contains 7: " + l6.contain(7) + '\n');

        System.out.println("Set 1 is a subset of Set 2: " + 
l5.subsetOf(l6));
        System.out.println("Set 2 is a subset of A: " + l6.subsetOf(l5) + 
'\n');

        System.out.println("Set 1 is equal to Set 2: " + l5.isEqual(l6));
        System.out.println("Set 2 is equal to Set 1: " + l6.isEqual(l5) + 
'\n');

        System.out.println("Set 5 union Set 6 is: " + l5.union(l6));
        System.out.println("Set 1 intersection Set 6 is: " + 
l5.intersection(l6));
        System.out.println("Set 1 complement Set 2 is: " + 
l5.complement(l6) + '\n');

        System.out.println("Removing 1 from set 1: ");
        l5.remove(1);
        System.out.println("Set A is now: " + l5);
        System.out.println("The size of set A is: " + l5.size() + '\n');

        System.out.println("Removing 5 from set 1: ");
        l5.remove(5);
        System.out.println("Set 1 is now: " + l5);
        System.out.println("The size of set a is: " + l5.size() + '\n');

        System.out.println("Adding 2 to set 1: ");
        l5.addElement(2);
        System.out.println("Set 1 is now: " + l5);
        System.out.println("The size of set A is: " + l5.size() + '\n');

        System.out.println("Adding 8 to to set 2: ");
        l6.addElement(8);
        System.out.println("set 2 is now: " + l6);
        System.out.println("The size of set 2 is: " + l6.size() + '\n');

        // Case 4 
        System.out.println("------");
        System.out.println("Case 4");
        System.out.println("------");
      
        IntSet l7 = new IntSet();
		System.out.println(l7);
		
    	IntSet l8 = new IntSet();
		System.out.println(l8);

		// add elements
		l7.addElement(1);
	

		l8.addElement(2);
		l8.addElement(3);
		
        System.out.println("Set 1 is: " + l7);
        System.out.println("The size of set 1 is: " + l7.size() + '\n');

        System.out.println("Set 2 is: " + l8);
        System.out.println("The size of set 2 is: " + l8.size() + '\n');

        System.out.println("Set 1 contains 1: " + l7.contain(1));
        System.out.println("Set 2 contains 7: " + l8.contain(7) + '\n');

        System.out.println("Set 1 is a subset of Set 2: " + 
l7.subsetOf(l8));
        System.out.println("Set 2 is a subset of A: " + l8.subsetOf(l7) + 
'\n');

        System.out.println("Set 1 is equal to Set 2: " + l7.isEqual(l8));
        System.out.println("Set 2 is equal to Set 1: " + l8.isEqual(l7) + 
'\n');

        System.out.println("Set 5 union Set 6 is: " + l7.union(l8));
        System.out.println("Set 1 intersection Set 6 is: " + 
l7.intersection(l8));
        System.out.println("Set 1 complement Set 2 is: " + 
l7.complement(l8) + '\n');

        System.out.println("Removing 1 from set 1: ");
        l7.remove(1);
        System.out.println("Set A is now: " + l7);
        System.out.println("The size of set A is: " + l7.size() + '\n');

        System.out.println("Removing 5 from set 1: ");
        l7.remove(5);
        System.out.println("Set 1 is now: " + l7);
        System.out.println("The size of set a is: " + l7.size() + '\n');

        System.out.println("Adding 2 to set 1: ");
        l7.addElement(2);
        System.out.println("Set 1 is now: " + l7);
        System.out.println("The size of set A is: " + l7.size() + '\n');

        System.out.println("Adding 8 to to set 2: ");
        l8.addElement(8);
        System.out.println("set 2 is now: " + l8);
        System.out.println("The size of set 2 is: " + l8.size() + '\n');

        // Case 5 - One is non-empty and the other empty
        System.out.println("------");
        System.out.println("Case 5");
        System.out.println("------");

        IntSet l9 = new IntSet();
		System.out.println(l9);
		
    	IntSet l10 = new IntSet();
		System.out.println(l10);

		// add elements
		l9.addElement(1);
		l9.addElement(2);
		l9.addElement(3);
	
		
        System.out.println("Set 1 is: " + l9);
        System.out.println("The size of set 1 is: " + l9.size() + '\n');

        System.out.println("Set 2 is: " + l10);
        System.out.println("The size of set 2 is: " + l10.size() + '\n');

        System.out.println("Set 1 contains 1: " + l9.contain(1));
        System.out.println("Set 2 contains 7: " + l10.contain(7) + '\n');

        System.out.println("Set 1 is a subset of Set 2: " + 
l9.subsetOf(l10));
        System.out.println("Set 2 is a subset of A: " + l10.subsetOf(l9) + 
'\n');

        System.out.println("Set 1 is equal to Set 2: " + l9.isEqual(l10));
        System.out.println("Set 2 is equal to Set 1: " + l10.isEqual(l9) + 
'\n');

        System.out.println("Set 5 union Set 6 is: " + l9.union(l10));
        System.out.println("Set 1 intersection Set 6 is: " + 
l9.intersection(l10));
        System.out.println("Set 1 complement Set 2 is: " + 
l9.complement(l10) + '\n');

        System.out.println("Removing 1 from set 1: ");
        l9.remove(1);
        System.out.println("Set A is now: " + l9);
        System.out.println("The size of set A is: " + l9.size() + '\n');

        System.out.println("Removing 5 from set 1: ");
        l9.remove(5);
        System.out.println("Set 1 is now: " + l9);
        System.out.println("The size of set a is: " + l9.size() + '\n');

        System.out.println("Adding 2 to set 1: ");
        l9.addElement(2);
        System.out.println("Set 1 is now: " + l9);
        System.out.println("The size of set A is: " + l9.size() + '\n');

        System.out.println("Adding 8 to to set 2: ");
        l10.addElement(8);
        System.out.println("set 2 is now: " + l10);
        System.out.println("The size of set 2 is: " + l10.size() + '\n');
    }
}
