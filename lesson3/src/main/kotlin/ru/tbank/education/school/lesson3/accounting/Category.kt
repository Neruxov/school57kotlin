package ru.tbank.education.school.lesson3.accounting

/**
 * @author <a href="https://github.com/Neruxov">Neruxov</a>
 */
abstract class Category(
    val name: String,
    var products: MutableList<Product>
) {

    fun findProducts(request: String): List<Product> {
        return products.filter {
            it.name.contains(request, ignoreCase = true) || name.contains(
                request,
                ignoreCase = true
            )
        }
    }

    fun inventoryManagement() {
        products = products.groupBy { it.name }
            .map { (_, products) ->
                products.reduce { p1, p2 -> p1 + p2 }
            }.toMutableList()
    }

}
