package screen

class ShoppingHome {

    fun start(){
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        println("안녕하세요. 당신의 이름은 무엇인가요? : ")
        val userName = readLine()
        println(
            """
            안녕하세요, $userName 님,
            만나뵙게 되어 영광입니다.
            원하시는 카테고리를 입력하세요.
            ================================================
        """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }
}