package com.lambdaschool.testingcalculator

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class MathUnitTest {

    @Test
    fun calculatorAddition() {
        // Setup
        val num1 = 10
        val num2 = 17
        val expected = 27

        val math = mock(Math::class.java)
        `when`(math.addIntegers(num1, num2)).thenReturn(expected)
        val calculator = Calculator(math)

        // Execute
        val sum = calculator.add(num1, num2)

        // Check
        assertEquals(expected, sum)
    }



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