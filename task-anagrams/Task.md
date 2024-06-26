# Anagrams

<table>
  <tr>
    <td>Time limit</td>
    <td>1 second</td>
  </tr>
  <tr>
    <td>Memory limit</td>
    <td>20Mb</td>
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
Two strings consisting of lowercase Latin letters are given. It is required to determine whether these strings are anagrams, i.e., if they differ only in the order of characters.

Input Format
The input file contains two strings of lowercase Latin characters, each no longer than 100,000 characters. The strings are separated by
a newline character.

Output Format
The output file should contain a one if the strings are anagrams, and zero otherwise.

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
        <td><pre>qiu
iuq
</pre></td>
        <td><pre>1
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
        <td><pre>zprl
zprc
</pre></td>
        <td><pre>0
</pre></td>
     </tr>
  </tbody>
</table>