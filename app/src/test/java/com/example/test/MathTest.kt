package com.example.test

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun doubleAdd(){
        assertEquals("5", math?.add("2.0", "3"))
    }

    @Test
    fun doubleHardAdd(){
        assertEquals("5.2", math?.add("2.2", "3"))
    }

    @Test
    fun doubleDotAdd(){
        assertEquals("Вы ввели две точки", math?.add("2..2", "3"))
    }

    @Test
    fun doubleSymbolAdd(){
        assertEquals("Не корректный ввод", math?.add("2asads2", "3"))
    }

    @Test
    fun doubleEmptyAdd(){
        assertEquals("Вы ввели пустое поле", math?.add("20", ""))
    }

    @Test
    fun doubleSpaceAdd(){
        assertEquals("слишком много пробелов", math?.add("20", "2  5"))
    }


    @Test
    fun simpleDivide(){
        assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun zeroDivide(){
        assertEquals("на 0 нельзя", math?.divide("8", "0"))
    }



    @After
    fun detach(){
        math = null
    }
}