# Kotlin List removeIf and removeAll Unexpected Behavior

This repository demonstrates a subtle but important difference in the behavior of Kotlin's `removeIf` and `removeAll` functions when used with predicates to remove elements from a list.

The `Bug.kt` file shows how both functions seem to achieve the same result in a simple scenario. However, their behavior can differ significantly in more complex situations, potentially leading to unexpected results.

The `BugSolution.kt` file provides a clear explanation and clarifies the correct usage of both functions.

## Key Difference

- `removeIf`: Removes elements from the list *in place*. It iterates over the list and removes elements that satisfy the condition.
- `removeAll`: Removes elements from the list *in place*. It creates a temporary set of elements to be removed, and then performs the removal operation. The difference in performance and behavior compared to `removeIf` is not always substantial.