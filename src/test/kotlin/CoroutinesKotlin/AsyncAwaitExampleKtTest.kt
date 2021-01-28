package CoroutinesKotlin

import org.junit.Assert
import org.junit.Test



class AsyncAwaitExampleKtTest{

    @Test
    fun addition_isCorrect(){
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun `changefnfor data`(){
        val changeFn = AsyncAwaitExample().changeFn()
        Assert.assertEquals("Kotlin",changeFn)
    }



}