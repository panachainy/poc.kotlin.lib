/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package poc.kotlin.lib

import poc.kotlin.lib.models.Product

public class Library {
    public fun someLibraryMethod(): Boolean {
        return true
    }

    public fun testLibraryMethod(): String {
        return "ทดสอบ"
    }

    public fun testLibraryModel(): Product {
        return Product("x", 2.2f)
    }
}
