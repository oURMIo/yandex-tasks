# Longest Sequence of Consecutive Ones

<table>
  <tr>
    <td>Time limit</td>
    <td>1 second</td>
  </tr>
  <tr>
    <td>Memory limit</td>
    <td>64Mb</td>
  </tr>
  <tr>
    <td>Input</td>
    <td>standard input or <code>input.txt</code></td>
  </tr>
  <tr>
    <td>Output</td>
    <td>standard output or <code>output.txt</code></td>
  </tr>
</table>
You need to find the length of the longest sequence of consecutive ones in a binary vector and print this length.

It is desirable to obtain a solution that works in linear time, processing the input array only once.

Input Format
The first line of the input contains a single integer n, where n ≤ 10000. Each of the next n lines contains exactly one integer — the
consecutive elements of the array.

Output Format
Output a single integer — the length of the longest sequence of consecutive ones in the input array.

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
        <td><pre>5
1
0
1
0
1
</pre></td>
        <td><pre>1
</pre></td>
     </tr>
  </tbody>
</table>