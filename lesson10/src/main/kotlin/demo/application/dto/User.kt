package demo.application.dto

data class User(
    val age: Int,
    val name: String,
    val sex: Sex,
    val income: Long,
    val loans: List<Loan>,
) {

    enum class Sex {
        MALE, FEMALE
    }

    fun calculateMonthlyPayment(): Long {
        return loans.filterNot { it.isClosed }.sumOf { it.monthlyPayment }
    }

}