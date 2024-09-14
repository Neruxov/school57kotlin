package ru.tbank.education.school.lesson1

/**
 * Сумма четных чисел.
 */
fun sumEvenNumbers(numbers: Array<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 != 0) continue
        sum += number
    }

    return sum
}
