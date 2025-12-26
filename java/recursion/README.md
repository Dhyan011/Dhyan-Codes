## Recursion (Java)

Recursion is a programming technique where a method calls itself
to solve a problem by reducing it into smaller subproblems.

---

## Core Components
1. **Base Case**
   - Condition where recursion stops
   - Prevents infinite calls

2. **Recursive Case**
   - Function calls itself with a smaller input

---

## How Recursion Works
- Each function call is stored in the **call stack**
- Stack grows until base case is reached
- Stack unwinds while returning values

---

## Types (Basic)
- **Non-tail recursion**: Work after recursive call (factorial)
- **Tail recursion**: No work after recursive call (print)

---

## Examples Implemented
- Print numbers (ascending & descending)
- Factorial
- Sum of n numbers
- Fibonacci sequence

---

## Common Mistakes
- Missing base case → StackOverflowError
- Input not reducing toward base case
- Using recursion where iteration is simpler

---

## When to Use Recursion
- Tree and graph traversal
- Divide & conquer problems
- Backtracking problems
