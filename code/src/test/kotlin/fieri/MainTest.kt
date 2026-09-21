package fieri

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `이름을 포함한 인사말을 반환한다`() {
        assertEquals("Hello, fieri!", greeting("fieri"))
    }
}
