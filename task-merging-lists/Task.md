# Merging k Sorted Lists

<table>
   <tr>
      <th>Language</th>
      <th>Time limit</th>
      <th>Memory limit</th>
      <th>Input</th>
      <th>Output</th>
   </tr>
   <tr>
      <td width="1%">All languages</td>
      <td>1&nbsp;second</td>
      <td>10Mb</td>
      <td rowspan="5">standard input or <code>input.txt</code></td>
      <td rowspan="5">standard output or <code>output.txt</code></td>
   </tr>
   <tr>
      <td>
         <nobr>Oracle Java 7</nobr>
      </td>
      <td>1&nbsp;second</td>
      <td>20Mb</td>
   </tr>
   <tr>
      <td>
         <nobr>Node JS 8.9.4</nobr>
      </td>
      <td>1&nbsp;second</td>
      <td>20Mb</td>
   </tr>
   <tr>
      <td>
         <nobr>Oracle Java 8</nobr>
      </td>
      <td>1&nbsp;second</td>
      <td>20Mb</td>
   </tr>
   <tr>
      <td>
         <nobr>Kotlin</nobr>
      </td>
      <td>1&nbsp;second</td>
      <td>20Mb</td>
   </tr>
</table>
k sorted arrays of non-negative integers, each of which does not exceed 100, are given in non-decreasing order. It is required to construct the result of their merge: a sorted array in non-decreasing order containing all elements of the original k arrays.

The length of each array does not exceed 10 ⋅ k.

Try to make the solution work in time k ⋅ log(k) ⋅ n, assuming that the input arrays have length n.

Input Format
The first line of the input file contains a single number k, k ≤ 1024.

Each of the next k lines describes one array. The first number of each line is the length of the corresponding array, and the remaining
numbers in this line describe the values of the elements of this array. The elements of the arrays are non-negative integers and do not
exceed 100.

Output Format
The output file should contain a sorted array in non-decreasing order containing all elements of the original arrays.

Example
<table class="sample-tests">
  <thead>
     <tr>
        <th>Input</th>
        <th>Output</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td><pre>4
6 2 26 64 88 96 96
4 8 20 65 86
7 1 4 16 42 58 61 69
1 84
</pre></td>
        <td><pre>1 2 4 8 16 20 26 42
58 61 64 65 69 84 86
88 96 96 </pre></td>
     </tr>
  </tbody>
</table>