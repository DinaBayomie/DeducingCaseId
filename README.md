<h5>Source code associate the paper
<h1> Deducing Case IDs for Unlabeled Event Logs 
<h5>By Dina Bayomie , Iman Helal , Ahmed Hany

To run our code first: 
- run Behavioral profile 
  - get jbpt library from https://code.google.com/p/jbpt
  - see "https://code.google.com/p/jbpt/source/browse/trunk/jbpt-test/src/test/java/org/jbpt/test/tree/BCTreeTest.java" to add a process model.
- run _int.main in DCI using python 2.6 , with arguments
  - Unlabeled event log in (.txt or .csv) formats
  - Heuristic data in (.csv) format
  - Ranking score threshold

The output exists in 4 folders:
- labeledEventLog_txt
- labeledEventLog_csv
- labeledEventLog_xes
- otherEventLog_all [which will contain Noisy event logs and also event logs below thershold ]
