# Removing Duplicates

<table>
  <tr>
    <th>Language</th>
    <th>Time Limit</th>
    <th>Memory Limit</th>
    <th>Input</th>
    <th>Output</th>
  </tr>
  <tr>
    <td width="1%">All languages</td>
    <td>1 second</td>
    <td>10Mb</td>
    <td rowspan="5">standard input or <code>input.txt</code></td>
    <td rowspan="5">standard output or <code>output.txt</code></td>
  </tr>
  <tr>
    <td>
       <nobr>Oracle Java 7</nobr>
    </td>
    <td>1 second</td>
    <td>20Mb</td>
  </tr>
  <tr>
    <td>
       <nobr>Node JS 8.9.4</nobr>
    </td>
    <td>1 second</td>
    <td>20Mb</td>
  </tr>
  <tr>
    <td>
       <nobr>Oracle Java 8</nobr>
    </td>
    <td>1 second</td>
    <td>20Mb</td>
  </tr>
  <tr>
    <td>
       <nobr>Kotlin</nobr>
    </td>
    <td>1 second</td>
    <td>20Mb</td>
  </tr>
</table>
Given an array of 32-bit integers sorted in non-decreasing order, remove all duplicate elements.

The solution should ideally not read the entire input file into memory, meaning it should use a constant amount of memory during its
operation.

Input Format
The first line of the input file contains a single integer n, where n ≤ 1,000,000.

The next n lines contain the integers, each on a separate line. These integers are sorted in non-decreasing order.

Output Format
The output file should contain the unique elements of the input array in non-decreasing order.

Example 1
<table class="sample-tests">
  <thead>
     <tr>
        <th>Input</th>
        <th>Output</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td><pre>5
2
4
8
8
8
  </pre></td>
        <td><pre>2
4
8
  </pre></td>
     </tr>
  </tbody>
</table>
Example 2
<table>
  <thead>
     <tr>
        <th>Input</th>
        <th>Output</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td><pre>5
2
2
2
8
8
  </pre></td>
        <td><pre>2
8
  </pre></td>
     </tr>
  </tbody>
</table>