public class HashTable
{
        private Node[] array;
        private final int SIZE = 103;

       
        public class Node
        {
                private String name;
                private double score;
                private Node next;
               
                public Node(String s, double i, Node n)
                {
                        name = s;
                        score = i;
                        next = n;
                }
               
                public Node() {}
               

                public String getName()
                {
                        return name;
                }
 
                public double getScore()
                {
                        return score;
                }
 
                public Node getNext()
                {
                        return next;
                }
 
                public void setName(String n)
                {
                        this.name = n;
                }
 
                public void setScore(double s)
                {
                        this.score = s;
                }
 
                public void setNext(Node newNext)
                {
                        this.next = newNext;
                }
        }
       

        public HashTable()
        {
                array = new Node[SIZE];
        }
       
        static int hashCode(String s)
        {
                int hash = 0;
                for (int i = 0; i < s.length(); i++)
                {
                        hash = (hash << 5) | (hash >>> 27); 
                        hash += (int) s.charAt(i);
                }
                  return hash;
        }

        static int sortedHash(int k)
        {
                k++;
                return k % 103;
        }
       
        //makes sure code is positive
        public int compress(int hash)
        {
                if (hash < 0)
                        hash = -hash;
                return hash % SIZE;
        }
       
        public void put(String key, double score)
        {
                //handle space after key
                key = key.substring(0, key.length()-1);
                int k = compress(hashCode(key));
               
                //place key to open table
                if (array[k] == null)
                {
                        array[k] = new Node(key, score, null);
                }
               
                //add collided key to linked list
                else if (array[k].getName().equals(key))
                {
                        Node v = array[k];
                        array[k] = new Node(key, score, v);
                }
               
                else
                {
                        //find first empty space or matching key
                        do
                        {
                                k = sortedHash(k);
                        }while (array[k] != null && !array[k].getName().equals(key));
                       
                        //if empty, create new node
                        if (array[k] == null)
                        {
                                array[k] = new Node(key, score, null);
                        }
                       
                        //add to the top of SLL
                        else
                        {
                                Node v = array[k];
                                array[k] = new Node(key, score, v);
                        }
                }
        }
       
        public double average(String key)
        {
                double average = 0;
                int count = 0;
                int k;
                //find key
                for (k = 0; k < array.length; k++)
                        if (array[k] != null)       
			if (array[k].getName().equals(key))
                            break;
                Node v = array[k];
                //add all scores
                do
                {
                 average += v.getScore();
                 v = v.getNext();
                     count++;
                }while (v != null);
                return (average / count);
        }
 
  
       
        public int scores(String key)
        {
                int count = 0;
                int k;
                //find key
                for (k = 0; k < array.length; k++)
                        if (array[k] != null)
                        if (array[k].getName().equals(key))
                            break;
                Node v = array[k];
                //number of elements in linked list
                do
                {
                 v = v.getNext();
                 count++;
                }while (v != null);
                return count;
        }
       

       

        public boolean check(String key)
        {
                //check to see if key exists in array
                for (int i = 0; i < array.length; i++)
                        if (array[i] != null)
                        if (array[i].getName().equals(key))
                return true;
                
                System.out.println(key + " not found.");
                return false;
        }
       
}
