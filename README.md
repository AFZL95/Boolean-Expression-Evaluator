###Boolean Value
**"BooleanValue"** might not be the fanciest and the most efficient implementation of an interpreter. but it's a fine try. the trick is to parse and evaluate a boolean expression. refering to a boolean expression described by this EBNF grammar:
```
<expression>::=<term>{<or><term>}
<term>::=<factor>{<and><factor>}
<factor>::=<constant>|<not><factor>|(<expression>)
<constant>::= false|true
<or>::='|'
<and>::='&'
<not>::='!'
```

in my case i describe a boolean expression as:
```
*An <expression> composed by a <term> and eventually a repetition of <or> and <term>.

*A <term> is composed by a <factor> and eventually repetition of <and> and <factor>.

*A <factor> is composed by a <constant> or a <not><factor> or an <expression> (delimited by parenthesis).

*A <constant> can be false or true and lastly we have the symbolic definition for <or>, <and> and <not>.
```

in this code i have used a programmatically method that help us to parse, using a Recursive Descent Parser, a boolean expression and let us build an Abstract Syntax Tree for the given grammar and then, using the Intepreter Pattern, interpret it.
it parses the input from Left to right, performing Leftmost derivation of the sentence if it uses k tokens of lookahead when parsing a sentence.

Here is an example for execution argument and result:
```
(true & ((true | false) & !(true & false)))
AST: (true & ((true | false) & !(true & false)))
RES: true
```
You can execute BooleanEvaluator by providing a text file from your shell or interactively.

##future works:
beat a bigger deal and develop to a complete interpreter.
