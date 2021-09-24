package august2021practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * write an algorithm to find the top 3-page sequence given a list of website request log entries
 * similar to this:
 * 
 * Time, Customer, Page
 * 
 * T0,C1,A
 * T0,C2,E
 * T1,C1,B
 * T1,C2,B
 * T2,C1,C
 * T2,C2,C
 * T3,C1,D
 * T3,C2,D
 * T4,C1,E
 * 
 * 
 * C1 -> A,B,C,D,E  : ABC, BCD, CDE
 * 
 * C2 -> E,B,C,D,A  : EBC, BCD, CDA
 *
 * Top page sequence is BCD as it appears twice.
 */
 

 
 public class TopThreePageSequence {
	 
	 public static class LogEntry {
 		public LogEntry(String time, String customer, String website) {
			super();
			this.time = time;
			this.customer = customer;
			this.website = website;
		}
		String time;
 		String customer;
 		String website;
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getCustomer() {
			return customer;
		}
		public void setCustomer(String customer) {
			this.customer = customer;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
	 }
	 
     private static int topPageSequenceCount = 0;
     private static String topPageSequence = "";
     
     // returns top 3 page sequence
     public static String topThreePageSequence(List<LogEntry> listOfLogEntries) {
    	          
         Map<String, List<String>> mapOfCustomerPageSequence = new HashMap<String, List<String>>();
         
         listOfLogEntries.forEach  (entry -> {
             if ( !mapOfCustomerPageSequence.containsKey(entry.getCustomer())) {
                 List<String> listOfPages = new ArrayList<String>();
                 listOfPages.add(entry.getWebsite());
                 mapOfCustomerPageSequence.put(entry.getCustomer(), listOfPages);
             } else {
                 List<String> listOfPages = mapOfCustomerPageSequence.get(entry.getCustomer());
                 listOfPages.add(entry.getWebsite());
                 mapOfCustomerPageSequence.put(entry.getCustomer(), listOfPages);
             }
             
         });
         
         Map<String, Integer> countOfPageSequences = new HashMap<String,Integer>();

         mapOfCustomerPageSequence.forEach ((key, listOfPages) -> {
             
            for (int i=0; i < listOfPages.size()-2; i++) {
                String sequence = listOfPages.get(i) + listOfPages.get(i+1) + listOfPages.get(i+2);
                if ( !countOfPageSequences.containsKey(sequence) ) {
                    countOfPageSequences.put(sequence, 1);
                } else {
                    countOfPageSequences.put(sequence, countOfPageSequences.get(sequence) + 1);
                }
            }
         });
         

         // loop through the countOfPageSequences and identify the top page sequence
         countOfPageSequences.forEach( (sequence, sequenceCount) ->  {
        	 if ( sequenceCount > topPageSequenceCount ) {
        		 topPageSequenceCount = sequenceCount;
        		 topPageSequence = sequence;
        	 }
         });
         return topPageSequence;
     }
     
     public static void main (String[] args) {
    	 
    	 List<LogEntry> listOfLogEntries = new ArrayList<LogEntry>();
    	 LogEntry entry1 = new LogEntry("T0","C1","A");
    	 LogEntry entry2 = new LogEntry("T0","C2","E");
    	 LogEntry entry3 = new LogEntry("T1","C1","B");
    	 LogEntry entry4 = new LogEntry("T1","C2","B");
    	 LogEntry entry5 = new LogEntry("T2","C1","C");
    	 LogEntry entry6 = new LogEntry("T2","C2","C");
    	 LogEntry entry7 = new LogEntry("T3","C1","D");
    	 LogEntry entry8 = new LogEntry("T3","C2","D");
    	 LogEntry entry9 = new LogEntry("T4","C1","E");
    	 listOfLogEntries.add(entry1);
    	 listOfLogEntries.add(entry2);
    	 listOfLogEntries.add(entry3);
    	 listOfLogEntries.add(entry4);
    	 listOfLogEntries.add(entry5);
    	 listOfLogEntries.add(entry6);
    	 listOfLogEntries.add(entry7);
    	 listOfLogEntries.add(entry8);
    	 listOfLogEntries.add(entry9);
    	 String topPageSeq = topThreePageSequence(listOfLogEntries);
    	 System.out.println(topPageSeq);
     }
 }