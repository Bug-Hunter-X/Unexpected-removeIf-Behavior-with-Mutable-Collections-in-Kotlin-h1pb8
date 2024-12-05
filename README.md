# Kotlin Mutable Collection removeIf() Behavior

This repository showcases a subtle difference in the `removeIf()` function's behavior when used with `MutableList`, `MutableSet`, and `MutableMap` in Kotlin.  The example demonstrates that while `removeIf()` works intuitively for lists and sets, its behavior with maps may not be immediately obvious.

The `bug.kt` file contains the original code, highlighting the unexpected output with maps. The solution provides a more comprehensive and arguably clearer approach to achieve the intended result.