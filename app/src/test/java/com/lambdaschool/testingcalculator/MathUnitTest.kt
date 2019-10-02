package com.lambdaschool.testingcalculator

import junit.framework.Assert.assertEquals
import org.junit.Test

class MathUnitTest {

    @Test
    fun testAddIntegers() {
        // Set up the conditions of the test
        val num1 = 1
        val num2 = 5
        val expected = 6
        val math = Math()

        // Execute the code under test
        val sum = math.addIntegers(num1, num2)

        // Make assertions on the result
        assertEquals(expected, sum)
    }

    @Test
    fun testMultiplyIntegers() {
        // Setup
        val num1 = 3
        val num2 = 7
        val expected = 21
        val math = Math()

        // Execute
        val product = math.multiplyIntegers(num1, num2)

        // Check
        assertEquals(expected, product)
    }

    @Test
    fun testMultiplyIntegersB() {
        // Setup
        val num1 = 45
        val num2 = 79
        val expected = 3555
        val math = Math()

        // Execute
        val product = math.multiplyIntegers(num1, num2)

        // Check
        assertEquals(expected, product)
    }
}