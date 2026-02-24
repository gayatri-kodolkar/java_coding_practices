//remove duplicate
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class arraylist4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 3, 2, 5, 1));
        Set<Integer> seen = new LinkedHashSet<>();
        seen.addAll(list);
        List<Integer> result = new ArrayList<>(seen);
        System.out.println(result); // [3,5,2,1]
    }
}

// 1. Creation of the original list
// List<Integer> list = new ArrayList<>(Arrays.asList(3,5,3,2,5,1));

// Arrays.asList(3,5,3,2,5,1) creates a fixed-size list containing the elements
// in that order: [3,5,3,2,5,1].

// Then new ArrayList<>( … ) makes a modifiable ArrayList containing the same
// six values in that same order. So list is now:

// index: 0 1 2 3 4 5
// value: [3, 5, 3, 2, 5, 1]

// Note: The list has duplicates: the value 3 appears twice (positions 0 and 2)
// and 5 appears twice (positions 1 and 4).

// 2. Creation of a LinkedHashSet and adding all list elements
// Set<Integer> seen = new LinkedHashSet<>();
// seen.addAll(list);

// A LinkedHashSet<Integer> is created. Key points about LinkedHashSet:

// It implements the Set interface → so duplicates are not allowed (i.e., add(e)
// will fail if e is already present).

// Unlike a plain HashSet, a LinkedHashSet maintains insertion order when
// iterating. That means the order in which elements were first inserted is
// preserved.
// Oracle Docs
// +2
// GeeksforGeeks
// +2

// Under the hood, LinkedHashSet uses a LinkedHashMap (or similar structure)
// that keeps a doubly-linked list of entries so insertion order can be
// iterated.
// javaconceptoftheday.com
// +2
// GeeksforGeeks
// +2

// When you do seen.addAll(list), this is equivalent to, internally:

// for (Integer e : list) {
// seen.add(e);
// }

// So the elements from list are added one by one, in the list’s order.

// Let’s step through the additions:

// Add 3 → seen becomes [3].

// Add 5 → not present yet, so seen → [3, 5].

// Add 3 again → since 3 is already present in the set, the add call does
// nothing (it will return false, but we’re not checking). Duplicates are
// skipped. The insertion order remains unchanged; the existing 3 stays where it
// was.

// Add 2 → new, so seen → [3, 5, 2].

// Add 5 again → already present, so ignored; order stays [3, 5, 2].

// Add 1 → new, so seen → [3, 5, 2, 1].

// At the end of this step, seen is a set containing {3, 5, 2, 1} in that
// insertion-order: [3, 5, 2, 1].

// 3. Converting the set back into a list
// List<Integer> result = new ArrayList<>(seen);

// We pass the seen collection to new ArrayList<>(…).

// The ArrayList constructor that takes a Collection<? extends E> c will iterate
// over c in its iteration order and add the elements in that order to the new
// list.

// Since seen is a LinkedHashSet and preserves insertion order, the iteration
// will produce: 3 → 5 → 2 → 1.

// Therefore result becomes the ArrayList [3, 5, 2, 1].

// 4. Printing the result
// System.out.println(result); // [3,5,2,1]

// As expected, the printed list is [3, 5, 2, 1] exactly.

// 5. Summary of why you got that output

// The original list had duplicates and an order: 3 (first), 5, 3 (duplicate),
// 2, 5 (duplicate), 1.

// By inserting into a LinkedHashSet, you eliminated duplicates while preserving
// the first-seen insertion order.

// Converting back into a list retains that order.

// Hence you get [3, 5, 2, 1].

// 6. Additional points worth mentioning (for interview readiness)

// Why not simply use a HashSet?
// Because HashSet does not guarantee iteration order. If you used new
// HashSet<>(list), the order you get when you iterate might be unpredictable
// (depends on hash codes, capacity, load factor) — so you might get something
// like [1, 2, 3, 5] or any variation. By using LinkedHashSet, you ensure the
// order is “insertion order”.
// GeeksforGeeks
// +1

// Complexity considerations:

// ArrayList addAll(...) is roughly O(n) for n elements.

// LinkedHashSet.add(...) is (amortized) O(1) for each element (plus the cost of
// maintaining the linked list pointers) — so overall O(n).

// Converting back to ArrayList is O(m) where m is the size of seen.

// Trade-offs / memory overhead:
// Because LinkedHashSet keeps the linked list for insertion order, there is a
// small overhead compared to HashSet. But in many real-world uses (such as
// “remove duplicates while preserving order”), the overhead is acceptable.

// Edge cases & behaviour:

// If the list had null values and the set supports null (which LinkedHashSet
// does), you’d also keep the first null and ignore subsequent nulls.

// If you re-insert an element already present in LinkedHashSet (i.e. you call
// add(e) when contains(e) is true), the insertion order is not changed. From
// the Javadoc: “Note that insertion order is not affected if an element is
// re-inserted into the set.”
// Oracle Docs

// Why convert back to a list?
// Because sets don’t support duplicates and sometimes you want List semantics
// (ordered, indexable, allows duplicates if you want). In your case, you used
// the ArrayList<>(seen) as a convenient way to get a list of the unique
// elements in the original insertion order.