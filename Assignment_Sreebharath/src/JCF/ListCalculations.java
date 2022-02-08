package JCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListCalculations<T> {

	public LinkedList<T> getPerfectNumbers(LinkedList<T> list) {
		try {
			LinkedList returnList = new LinkedList();
			
			list.forEach((item)->{
				int i = 0;
				int sum = 0;
				T number = item;
				for(i = 1 ; i < (int)number ; i++) {
					if((int)number % i == 0)  {
						sum = sum + i;
					}
				}
				if ((int)sum == (int)number) {
					returnList.add((int)number);			
				}
			});
			return returnList;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	
	public LinkedList<LinkedList<T>> getSumOfNumbersWithK(LinkedList<T> list, int k) {
		try {
			LinkedList returnList = new LinkedList();
			int i = 0;
			for(i = 0; i < list.size(); i++) {
				LinkedList<T> linkedListInner = new LinkedList<T>();
				
				if(list.size() != (i+1) && ((int)list.get(i) + (int)list.get(i+1)) == k) {
					linkedListInner.add(list.get(i));
					linkedListInner.add(list.get(i+1));
					returnList.add(linkedListInner);
				}
			}
			return returnList;
		}
		
	
		catch(Exception ex) {
			throw ex;
		}
	}
	
	
	public int getMaxOfList(ArrayList<T> list) {
		try {
			 int max = Integer.MIN_VALUE;
			 int n = (int)list.size();
			  
	        for (int i = 1; i < n; i++) {
	            if ((int)list.get(i) > max) {
	            	max = (int)list.get(i);
	            }
	        }
			return max;
		}
		
		catch(Exception ex) {
			throw ex;
		}
	}
	
	
	
	public ArrayList<T> sortStringBasedOnLength(ArrayList<T> list) {
		try {
			
			ArrayList<String> returnList = new ArrayList<String>();
			  Comparator comparator = new Comparator<String>()
			    {
			        public int compare(String s1, String s2) {
			            return Integer.compare(s1.length(), s2.length());
			        }
			    };
			Collections.sort((ArrayList<String>)list, comparator);
			return list;
			
	        }
		
		catch(Exception ex) {
			throw ex;
		}
	}

	
	public char getOppositeSymbol(char symbol) {
		if(symbol == ']') {
			return '[';
		}
		else if(symbol == ')') {
			return '(';
		}
		else if (symbol == '}') {
			return '{';
		}
		return 's';
	}
	
	
	public boolean checkStringPattern(String pattern) {
		try {
			 if ((pattern.length() % 2) == 1) {
				 return false;
			 } 
			 else {
			    Stack<Character> finalArray = new Stack<>();
			    for (char character : pattern.toCharArray()) {
			        switch (character) {
			        case '{': finalArray.push('}'); break;
			        case '(': finalArray.push(')'); break;
			        case '[': finalArray.push(']'); break;
			        default :
			          if (finalArray.isEmpty() || character != finalArray.peek()) { return false;}
			          finalArray.pop();
			      }
			    }
			
			    return finalArray.isEmpty();
			  }

		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public ArrayList<Integer> evenIntegers(Stack<Integer> stackInput) {
		try {
			ArrayList<Integer> intArray = new ArrayList<Integer>();
			for (int i=stackInput.size()-1;i>=stackInput.size()/2;i--) {
				intArray.add(stackInput.get(i));
				} 
				for (int i=0;i<stackInput.size()/2;i++) {
					intArray.add(stackInput.get(i));			
				}
				return intArray;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public int binaryNumsQueue(Queue<String> stringQueue) {
		try {
			String outputStr = "";
			for (String bin : stringQueue) {
				outputStr += bin;
			}
			return Integer.parseInt(outputStr, 2);
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	
	public ArrayList<Integer> fetchSequenceAlternatives(Deque<Integer> dequeInt){
		
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		while(!dequeInt.isEmpty()) {
			returnList.add(dequeInt.pollLast());
			if(!dequeInt.isEmpty()) {
				returnList.add(dequeInt.pollFirst());
			}
		}
		return returnList;
	}
	
	
	public ArrayList<Integer> seperateEvenOddNumbers (Queue<Integer> intQueue){		
		try {
			ArrayList<Integer> returnArray = new ArrayList<Integer>();
	
			int length = intQueue.size() % 2 == 0 ? (intQueue.size() / 2) : (intQueue.size() / 2 + 1);
	
			for (int i=0;i<length;i++) 
			{ 
				int first = intQueue.poll();
				int second = -1;
				second = intQueue.poll();
				if (first % 2 != 0 && second % 2 == 0) {
					returnArray.add(second);
					if (second != -1) {
						returnArray.add(first);
					}
				} 
				else {
					returnArray.add(first);
					if (second != -1) {
						returnArray.add(second);
					}	
				}
			}
			return returnArray;
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	public String stringDeletionBySize(Deque<String> dequeString, int size) {
		try {
			String output = new String();
			if(size == 1) {
				output = dequeString.poll();
			}
			else {			
				if(output != "" && output != null) {
					dequeString.addFirst(output);
					output="";
				}
			}
			return output;
		}
		catch(Exception ex) {
			throw ex;
		}	
	}


}
