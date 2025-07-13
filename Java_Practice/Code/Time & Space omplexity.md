Great question!

If you're given a constraint like:

> **`1 ≤ n ≤ 10^k`**, where `k` can be 3, 4, 5, 6... etc.

Then you need to **choose algorithms based on how large `n` can get**.

---

## ✅ **Cheat Sheet: Which Time Complexity to Use Based on `n ≤ 10^k`**

| **Constraint (`n ≤`)** | **Safe Time Complexity**      | **Explanation / Reason**                      |
| ---------------------- | ----------------------------- | --------------------------------------------- |
| `10¹` = 10             | `O(n!)`, `O(2^n)`, `O(n²)`    | Very small, brute force is fine               |
| `10²` = 100            | `O(2^n)`, `O(n²)`             | Still small, try all combinations if needed   |
| `10³` = 1,000          | `O(n²)`, `O(n log n)`         | Sorting and nested loops are fine             |
| `10⁴` = 10,000         | `O(n log n)`, `O(n)`          | Linear and log-linear algorithms only         |
| `10⁵` = 100,000        | `O(n log n)`, `O(n)`          | Use efficient linear or sorting-based logic   |
| `10⁶` = 1,000,000      | `O(n log n)`, `O(n)`          | Up to \~20 million operations is safe         |
| `10⁷` = 10,000,000     | `O(n)` only (tight limit)     | Must be **highly optimized** linear code      |
| `10⁸` = 100,000,000    | `O(n)` or **constant time**   | Only for **very simple operations**           |
| `10⁹` = 1,000,000,000  | ❌ Avoid processing every item | Use math formulas, prefix sums, binary tricks |
| Infinite / theoretical | `O(log n)` or `O(1)`          | Algorithmic idea only; must reduce problem    |

---

### 🔄 **Visual Table Format**

| `n ≤`       | ❌ Not Allowed           | ✅ Allowed Time Complexities        | 🧠 Notes                      |
| ----------- | ----------------------- | ---------------------------------- | ----------------------------- |
| `10¹`       | –                       | `O(n!), O(2^n), O(n²)`             | Brute-force OK                |
| `10²`       | –                       | `O(2^n), O(n²), O(n log n)`        | Try all subsets               |
| `10³`       | `O(n³)`                 | `O(n²), O(n log n), O(n)`          | DPs, nested loops fine        |
| `10⁴`       | `O(n²)` (borderline)    | `O(n log n), O(n)`                 | Use efficient sorting         |
| `10⁵`       | `O(n²)`                 | ✅ Only `O(n log n), O(n)`          | Binary search, sliding window |
| `10⁶`       | `O(n²)`                 | ✅ `O(n log n), O(n)`               | Fast sorting, hashing         |
| `10⁷`       | ❌ `O(n log n)` (risky)  | ✅ `O(n)` (tight)                   | C++, C preferred              |
| `10⁸ – 10⁹` | ❌ Everything but `O(1)` | ✅ `O(1)`, `O(log n)` if math-based | Use formulas, no iteration    |

---

### 🔧 **Practical Guidelines by Language**

* In **Java/Python**, limit to \~**10⁶** iterations for tight `O(n)` performance.
* In **C/C++**, you might push up to **10⁷** with tight code and fast I/O.
* Anything above `10⁷` needs **constant time tricks**, **math**, or **segment trees/BITs**.

---

### ✅ Example Problems by n Constraint

| `n` Limit | ✅ Use Algorithms Like...                      |
| --------- | --------------------------------------------- |
| `n ≤ 10³` | Brute force, backtracking, recursion          |
| `n ≤ 10⁴` | DP with 1D/2D arrays, optimized loops         |
| `n ≤ 10⁵` | Hashing, sorting, two pointers, binary search |
| `n ≤ 10⁶` | Sliding window, prefix sums, greedy, heap     |
| `n ≤ 10⁸` | Math, formula, bitwise, constant operations   |

---

Would you like this as a **downloadable image or PDF format** for offline prep or revision?
