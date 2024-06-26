# Generation of Parenthesis Sequences
<table>
  <tr>
    <td>Time Limit</td>
    <td>1 second</td>
  </tr>
  <tr>
    <td>Memory Limit</td>
    <td>20MB</td>
  </tr>
  <tr>
    <td>Input</td>
    <td>Standard input or <code>input.txt</code></td>
  </tr>
  <tr>
    <td>Output</td>
    <td>Standard output or <code>output.txt</code></td>
  </tr>
</table>
Given an integer 
𝑛
n, you are required to output all valid parentheses sequences of length 
2
⋅
𝑛
2⋅n, ordered lexicographically (see Lexicographic Order).

Only round parentheses are used in the task.

It is desirable to obtain a solution that works in time proportional to the total number of valid parentheses sequences in the output,
and uses memory proportional to
𝑛
n.

Input Format
The only line of the input file contains an integer
𝑛
n,
0
≤
𝑛
≤
11
0≤n≤11.

Output Format
The output file contains the generated valid parentheses sequences, ordered lexicographically.

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
        <td><pre>2
</pre></td>
        <td><pre>(())
()()
</pre></td>
     </tr>
  </tbody>
</table>
Example 2
<table class="sample-tests">
  <thead>
     <tr>
        <th>Input</th>
        <th>Output</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td><pre>3
</pre></td>
        <td><pre>((()))
(()())
(())()
()(())
()()()
</pre></td>
     </tr>
  </tbody>
</table>