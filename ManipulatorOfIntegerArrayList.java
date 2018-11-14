import java.util.Scanner;
import java.util.ArrayList;
/**
 * Cover the basics of ArrayList for first day lecture.
 * 
 * @author      Susan King 
 * @author      Karina Patel 
 * @version     November 10, 2014
 * 
 * Students:  Look for three dots.  You write the code there.
 */
public class ManipulatorOfIntegerArrayList
{
    /**
     * Constructs objects of class ManipulatorOfIntegerArrayList.
     */
    // ... write the default constructor that has no code

    public ManipulatorOfIntegerArrayList()
    {
    }

    /**
     * Generates random numbers between -500 and 500.
     * The number of random numbers is itself a random number
     * between 0 and 20.
     * 
     * @return an ArrayList of random numbers
     */
    public ArrayList<Integer> generateData( )
    {
        ArrayList <Integer> data = new ArrayList <Integer>( );
        int len = (int)(Math.random( ) * 20);  // random number of numbers
        //... fill up the ArrayList with numbers between -500 and 500
        for (int i = 0; i < len; i++)
        {
            int k = (int)(Math.random() * 1001 - 500);
            data.add(k);
        }
        return data; 
    }

        /**
         * Outputs an ArrayList of Integers.
         * 
         * @param  numbers   an ArrayList of Integers
         */
        public void printData(ArrayList<Integer> numbers)
        { 
            if (numbers.size() == 0) // ... change if to test if ArrayList is empty
            {
                System.out.println("ArrayList is empty.");
                return;
            }
            // output the elements in the array
            for (int i=0; i < numbers.size(); i++ ) // ... finish the for statement
            {
                System.out.println("numbers\' " + i + " element = " + numbers.get(i));
            }
        }

        /**
         * Generates a summation of all the Integers in an ArrayList.
         * 
         * @param  nums   an ArrayList of Integers
         * @return sum of all numbers in an ArrayList
         */    
        public long sumOfData(ArrayList<Integer> nums)
        {
            long sum = 0; // ... correct this constant
            // ... sum the elements in ArrayList y
            for (int i = 0; i < nums.size(); i++)
            {
                sum += nums.get(i);
            }
            return sum;
        }

        /**
         * Generates a product of all the Integers in an ArrayList.
         * 
         * @param  numbs   an ArrayList of Integers
         * @return product of all numbers in an ArrayList. If the
         *         ArrayList is empty, return 0
         */       
        public long productOfData(ArrayList<Integer> numbs)
        {
            if (numbs.size() == 0)
            {
                return 0;
            }
            long product = 1; // ... correct this constant
            // ... generate the product of the elements in ArrayList b
            for (int i = 0; i < numbs.size(); i++)
            {
                product *= numbs.get(i);
            }
            return product;
        }   

        /**
         * Finds the maximum Integer in an ArrayList. If the ArrayList is
         * empty, the smallest integer value is returned.
         * 
         * @param  values   an ArrayList of Integers
         * @return maximum numbers in an ArrayList
         */     
        public int maxOfData(ArrayList<Integer> values)
        {
            int max = values.get(0); // ... correct this constant
            // ... find the maximum elements in ArrayList z 
            for (int i = 1; i < values.size(); i++)
            {
                if ( values.get(i) > max)
                {
                    max = values.get(i);
                }
            }   
            return max;
        }

        /**
         * Finds the minimum Integer in an ArrayList. If the ArrayList is
         * empty, the largest integer value is returned.
         * 
         * @param  vals   an ArrayList of Integers
         * @return minimum numbers in an ArrayList
         */       
        public int minOfData(ArrayList<Integer> vals)
        {
            int min = vals.get(0); // ... correct this constant
            // ... find the minimum elements in ArrayList z x
            for (int i = 1; i < vals.size(); i++)
            {
                if (vals.get(i) < min)
                {
                    min = vals.get(i);
                }
            }
            return min;
        } 

        /**
         * Turns all even Integer values in an ArrayList to the value of 7.
         * 
         * @param  numSeries   ArrayList of Integers
         */     
        public void replaceEvenWith7(ArrayList<Integer> numSeries)
        {
            // ... write the code to match the description of the method.
            Integer seven = new Integer(7);
            for (int i = numSeries.size() - 1; i >= 0; i--)
            {
                if (numSeries.get(i) % 2 == 0)
                {
                    numSeries.set(i, seven);
                }
            }
        }

        /**
         * Turns all Integer values to thier absolute values in an ArrayList.
         * 
         * @param  seriesOfNums   an ArrayList of Integers
         */      
        public void setAbsolute(ArrayList<Integer> seriesOfNums)
        {
            // ... write the code to match the description of the method.
            for (int i = seriesOfNums.size() - 1; i >= 0; i--)
            {
                if (seriesOfNums.get(i) < 0)
                {
                    seriesOfNums.set(i, Math.abs(seriesOfNums.get(i)));
                }
            }
        }

        /**
         * Removes all odd Integer values from an ArrayList.
         * 
         * @param  seriesOfNumbers   an ArrayList of Integers
         */   
        public void removeOdds(ArrayList<Integer> seriesOfNumbers)
        {
            // ... write the code to match the description of the method.
            // HINT:  go through the ArrayList from the last index to
            // zero.  This avoids skipping over entries.
            for (int i = seriesOfNumbers.size() - 1; i >= 0; i--)
            {
                if (Math.abs(seriesOfNumbers.get(i) % 2) == 1)
                {
                    seriesOfNumbers.remove(i);
                }
            }
        }

        /**
         * Removes one of two neighboring twin Integer values from an ArrayList.
         * 
         * @param  quantities   an ArrayList of Integers
         * @postcondition   Identical neighboring values in the ArrayList 
         *                  are removed
         */     
        public void removeOneNeighboringTwin(ArrayList<Integer> quantities)
        {
            // ... write the code to match the description of the method.
            for (int i = quantities.size() - 1; i > 0; i--)
            {
                if (quantities.get(i) == quantities.get(i - 1))
                {
                    quantities.remove(i - 1);
                }
            }
        }

        /**
         * Duplicates all Integer values that are a multiple of three
         * in an ArrayList.
         * 
         * @param  quans   an ArrayList of Integers
         * @postcondition   Duplicates all Integer values that are a 
         *                  multiple of 3 in an ArrayList
         */      
        public void doubleUp(ArrayList<Integer> quans)
        {
            // ... finish the code to match the description of the method.
            // ... This can be tricky.
            for (int i = quans.size() - 1; i >= 0; i--)
            {
                if (quans.get(i) % 3 == 0)
                {
                    quans.add(i, quans.get(i));
                }
            }
        }

        /**
         * Removes all of neighboring Integer value that are the same
         * from an ArrayList.
         * 
         * @param  collectionOfNumbers   an ArrayList of Integers
         * @postcondition   All of neighboring Integer value that are the same
         *                  from an ArrayList are removed
         */   
        public void removeAllNeighboringTwins(ArrayList<Integer> collectionOfNumbers)
        {
            // ... finish the code to match the description of the method.
            // ... This can be tricky.
            int index = collectionOfNumbers.size() - 1;
            while (index > 0)
            {
                if (collectionOfNumbers.get(index) == collectionOfNumbers.get(index - 1))
                {
                    int store = collectionOfNumbers.remove(index);
                    index--;
                    while (index >= 0 && collectionOfNumbers.get(index) == store)
                    {
                        collectionOfNumbers.remove(index);
                        index--;
                    }
                    index = Math.min(index + 1, collectionOfNumbers.size() - 1);
                }
                else
                {
                    index--;
                }
            }
        }

        /**
         * Prints the menu for the user to read.
         */
        public void printMenu()
        {
            System.out.println("Enter option: ");
            System.out.println(" 1 - generate new random data in ArrayList \n" +
                " 2 - print ArrayList \n" +
                " 3 - print sum, product, max, min \n" +
                " 4 - replace even numbers with 7 \n" +
                " 5 - make all numbers absolute \n" +
                " 6 - remove all odd numbers \n" +
                " 7 - double up \n" +
                " 8 - remove one neighboring twin \n" +
                " 9 - remove all neighboring twins \n" +
                "10 - quit");
        }

        /**
         * Allows the user to select what action he or she wishes to 
         * make.  The desired action is then executed.
         */
        public void interactWithUser( )
        {
            Scanner in = new Scanner(System.in);
            ArrayList <Integer> testData = generateData( );
            int choice = 0;
            printData(testData);
            while (choice != 10)
            {
                printMenu();
                choice = in.nextInt();
                // clear the input buffer
                in.nextLine();

                if(choice == 1)
                {
                    testData = generateData( ); 
                }
                else if (choice == 2)
                {
                    printData( testData );
                }
                else if (choice == 3)
                {
                    System.out.println( "Sum = " + sumOfData(testData) );
                    System.out.println( "Product = " + productOfData(testData) );        
                    System.out.println( "Max = " + maxOfData(testData) );        
                    System.out.println( "Min = " + minOfData(testData) );
                }
                else if (choice == 4)
                {
                    replaceEvenWith7( testData);
                }
                else if (choice == 5)
                {
                    setAbsolute( testData);
                }  
                else if (choice == 6)
                {
                    removeOdds( testData);
                }
                else if (choice == 7)
                {
                    doubleUp( testData);
                }  
                else if (choice == 8)
                {
                    removeOneNeighboringTwin(testData);
                }  
                else if (choice == 9)
                {
                    removeAllNeighboringTwins(testData);
                }  
                else if (choice == 10)
                {
                    System.out.println("Good bye");
                }
            }
        }

        /**
         * Tests the code for ManipulatorOfIntegerArrayList.  The code is designed
         * to build skills with ArrayLists.
         * 
         * @param args   information passed from the user via the command line
         */
        public static void main(String[]args)
        {
            ManipulatorOfIntegerArrayList learner = new ManipulatorOfIntegerArrayList( );
            learner.interactWithUser( );
        }
    }

