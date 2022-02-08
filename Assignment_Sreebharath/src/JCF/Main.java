package JCF;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{


	
	public static void main(String[] args) {
		////////////////First Question///////////////////////////////
		//Linked List Set
		LinkedList<Integer> inputList = new LinkedList<Integer>();
		inputList.add(0);
		inputList.add(1);
		inputList.add(2);
		inputList.add(3);
		inputList.add(4);
		inputList.add(5);
		inputList.add(6);
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("First Question: Enter the size of linked list");
	     int num = sc.nextInt();
	     inputList.clear();
	     while (num > 0) {
	    	 inputList.add(sc.nextInt());
	    	 num--;
	     }
	     
		ListCalculations<Integer> listObj = new ListCalculations<Integer>();
		var perfectNumbers = listObj.getPerfectNumbers(inputList);
		
		System.out.println("First Answer: The perfect numbers are");
		System.out.println(perfectNumbers);
		
		
		////////////////////Second One///////////////////
		
	     System.out.println("Second Question: Enter the size of linked list");
	     num = sc.nextInt();
	     inputList.clear();
	     while (num > 0) {
	    	 inputList.add(sc.nextInt());
	    	 num--;
	     }
	     System.out.println("Enter the value of k");
		var sumOfKNumbers = listObj.getSumOfNumbersWithK(inputList, sc.nextInt());
		System.out.println("Second Answer: The sum numbers are");
		System.out.println(sumOfKNumbers);
		
		
		//////////////////Third One///////////////////////////////////////
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 System.out.println("Third Question: Enter the size");
	     num = sc.nextInt();
	     while (num > 0) {
	    	 arrayList.add(sc.nextInt());
	    	 num--;
	     }
		 var maxNumber = listObj.getMaxOfList(arrayList);
		 System.out.println("Third Answer: The max number is");
		 System.out.println(maxNumber);
		 
		 
		 //////////////////////Fourth One///////////////////////////////////

		 ListCalculations<String> listObjString = new ListCalculations<String>();
		 ArrayList<String> arrayListOfString = new ArrayList<String>();
		 System.out.println("Fourth Question: Enter the size");
	     num = sc.nextInt();
	     while (num > 0) {
    		 arrayListOfString.add(sc.next());
	    	 num--;
	     }
		 var stringArrayOutput = listObjString.sortStringBasedOnLength(arrayListOfString);
		 System.out.println("Fourth Answer: The string result");
		 System.out.println(stringArrayOutput);
		 
		 
		 /////////////////////////Fifth One///////////////////////////////////////
		 
		 System.out.println("Fifth Question: Enter the String pattern");
		 System.out.println("Fifth Answer: "+listObjString.checkStringPattern(sc.next()));
		 
		 /////////////////////////Sixth One//////////////////////////////////////////
		 
		 Stack<Integer> stackInt = new Stack<Integer>();
		 System.out.println("Sixth Question: Enter the size");
		 num = sc.nextInt();
	     while (num > 0) {
	    	 stackInt.add(sc.nextInt());
	    	 num--;
	     }
	     var output = listObj.evenIntegers(stackInt);
	     System.out.println("Sixth Answer: The stack output");
		 System.out.println(output);
		 
		 
		 
		 ///////////////////////////Seventh One///////////////////////////////////////
		 Queue<String> queueStr = new LinkedList<String>();
		 System.out.println("Seventh Question: Enter the size");
		 num = sc.nextInt();
	     while (num > 0) {
	    	 queueStr.add(sc.next());
	    	 num--;
	     }
	     var output7 = listObj.binaryNumsQueue(queueStr);
	     System.out.println("Seventh Answer: The output");
		 System.out.println(output7);
		 
		 
		 
		 //////////////////////////Eighth One//////////////////////////////////////////
		 
		 Deque<Integer> deQueueInt = new LinkedList<Integer>();
		 System.out.println("Eighth Question: Enter the size");
		 num = sc.nextInt();
	     while (num > 0) {
	    	 deQueueInt.add(sc.nextInt());
	    	 num--;
	     }
	     var output8 = listObj.fetchSequenceAlternatives(deQueueInt);
	     System.out.println("Eighth Answer: The output");
		 System.out.println(output8);
		 
		 
		 
		 ///////////////////////////Ninth One////////////////////////////////////////////
		 
	
		 System.out.println("Ninth Question: Enter the size");
		 num = sc.nextInt();
		 Deque<Integer> deQueueInt2 = new LinkedList<Integer>();
	     while (num > 0) {
	    	 deQueueInt2.add(sc.nextInt());
	    	 num--;
	     }
	     output8 = listObj.seperateEvenOddNumbers(deQueueInt2);
	     System.out.println("Ninth Answer: The output");
		 System.out.println(output8);
		 
		 
		 
		 
		 ////////////////////////////////////Tenth One//////////////////////////////////////
		 
		 System.out.println("Tenth Question: Enter the size");
		 Deque<String> deQueueStr = new LinkedList<String>();
		 num = sc.nextInt();
		 deQueueInt.clear();
	     while (num > 0) {
	    	 deQueueStr.add(sc.next());
	    	 num--;
	     }
	     System.out.println("Enter the value of n");
	     var numberArray = sc.nextInt();

			int[] integerArray = new int[numberArray];
	
			for (int i=0;i<numberArray;i++)
			{
				integerArray[i]=sc.nextInt();
			}
			
			for (Integer item : integerArray) {
				listObj.stringDeletionBySize(deQueueStr,item);
			}

			String response = "";
			
			for (String string : deQueueStr) {
				response+=string;
			}
		    System.out.println("Tenth Answer: The output");
			System.out.println("\""+response+"\"");	

	}

}
