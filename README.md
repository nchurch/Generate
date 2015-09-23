# Generate
A generalization of iterate.  Calling with f + N arguments will generate an infinite sequence where the next item consists of f called on the last N arguments of the sequence so far.
Thus for instance

```clojure
(generate + 1 1) will create the Fibonacci sequence.
```

Called on one argument the result is the same as iterate.
