import java.io.*;
import java.util.*;
 
class Project3 {
  public static void main(String[] args) throws IOException
  {
    if (args.length < 1) {
        System.out.println("Error: Directory name is missing");
        System.out.println("Usage: java scoreProcess directory_name");
        return;
    }
    File directory = new File(args[0]); // args[0] contains the directory name
    File[] files = directory.listFiles(); // get the list of files from that directory
   
    HashTable hash = new HashTable();
    Scanner input;
 
    // process the arguments stores in args
    for (int i = 0; i < files.length; i++)
    {
      input = new Scanner(files[i]);
     
      String key;
      Double value;
      while (input.hasNext())
      {
        key = "";
        while (!input.hasNextDouble())
        {
                key += input.next() + " ";
        }
        value = new Double(input.next());
        //hash and store the keys and values
        hash.put(key, value);
      }
    }
   
       
    //ask for user input until user enters exit
    String name;
 
    Scanner kb = new Scanner(System.in);
    do
    {
        System.out.print("Enter name (enter exit to exit program): ");
        name = kb.nextLine();
        if(name.toLowerCase().equals("exit"))
        {
                System.out.println("Program will now exit.");
                continue;
        }
        if (!hash.check(name))
        {
                continue;
        }
        System.out.print(name + ": Avg: ");
        System.out.printf("%.3f", hash.average(name));
        System.out.println(" # Scores: " + hash.scores(name));
    }
	while (!name.toLowerCase().equals("exit"));
    	kb.close();
    }
}
