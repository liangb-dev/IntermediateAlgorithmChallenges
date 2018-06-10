# IntermediateAlgorithmChallenges
These algorithms, with exception of the second method in DiffTwoArrays and SequenceBreaker.java, come from freeCodeCamp.com, and were originally intended for javascript I believe. Here I have solved them using Java for practice. 

<h2>Index</h2>
<ul>
  <li><a href=src/DiffTwoArrays.java>DiffTwoArrays.java</a></li>
  <li><a href=src/SequenceBreaker.java>SequenceBreaker.java</a></li>
  <li><a href=src/SumAllNumbersInRange.java>SumAllNumbersInRange.java</a></li>
</ul>

<h2><a href=src/DiffTwoArrays.java>DiffTwoArrays</a></h2>
The original goal of this algorithm was to find the difference between two provided arrays of any data types. I first implemented it using 'int' arrays, and then tried to tweak it to take generic arrays but ran into a problem with primitive values. <br>
<br>
<h4>Spoilers:</h4> 
My method is to merge the two arrays and compare each element with every other element in the merged array. When a duplicate is found, I eliminate the duplicate while keeping the original for the purpose of finishing the iteration in case there are more duplicates. By the end of the iteration, I eliminate the original IF there were duplicates during the entire iteration (using a boolean flag, 'found'). The resulting array, after this operation is done to each and every element in O(N^2), the result are the differences. <br> 
<br>
<h4> Adaptation:</h4> 
I adapted this algorithm to solve a recent coding exercise I almost successfully completed. In the exercise, you are provided a String and asked to find the first non-duplicate letter. Therefore, creating method2(), I performed the same operations as before but on a String. The resulting String in the end is one with all letters that had duplicates. For example, "tooth" becomes "h" and "yellow" becomes "yeow". The first letter is naturally the first non-dupliate letter. <br>


<h2><a href=src/SequenceBreaker.java>SequenceBreaker</a></h2>
The SequenceBreaker also comes from a coding challenge I had figured out but ran out of time implementing. Basically there's a sequence, that follows the following pattern:<br>
It starts with 0 -> '0' <br>
Increment each value by 1 and append to original value -> '01' <br>
repeat -> '0112'<br>
repear -> '01121220'<br>
etc. <br>
(Keep in mind the incrementation follows this pattern 0-1-2-0 - no numbers above 2)<br>
The question is, provided an index, write an algorithm that finds the value in the sequence that corresponds to the given index. <br>
<br>
<h4> Spoilers:</h4> 
Clearly there's a pattern, and with a pattern it's always possible to find an algorithm. <br>
It's worth noting that the sequence generation follows two patterns:<br>
  1. It copies and doubles itself each time - it grows by a factor of 2. <br>
  2. Every time it copies itself, the copied numbers are subsequently incremeneted by 1. <br>
<br>
This means each number in the latter half of the sequence has a corresponding 'predecessor' in the former half, whose value is itself <i>decremented</i> by 1. The same pattern follows subsequently in each half, the latter as well as the former. Therefore if one keeps finding the 'predecessor' of the inquired index, until you reach the mother of all numbers in the sequence, e.g. 0, you will have retraced how many times 0 incremented in order to become the value correposnding to the inquired index. <br>
<br>
I find the 'predecessor' by first finding the smallest power of 2 that is larger than the inquired index because you need to know how many positions to shift by - 2^(k)/2 - half the lenght the sequence is after it doubled itself. Subtract 2^(k)/2 from the inquired index and you have the first 'predecessor'. Keep iterating the same process (emphasis <strong>smallest power of 2</strong>) until you get to index 0. By keeping count of each time I 'devolved' the sequence, I kenw exactly how many times initial value 0 of index 0 had incremented. That, and modulo(3), then gives will give the final answer. <br>
<br>

<h2><a href=src/SumAllNumbersInRange.java>SumAllNumbersInRange</a></h2>
