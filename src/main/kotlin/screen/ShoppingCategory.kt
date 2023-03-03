package screen

class ShoppingCategory {
    fun showCategories() {
        val categories = arrayOf("패션", "반려동물용품", "전자기기")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하려면 #을 입력하세요.")

        var selectedCategory = readLine()
        while (selectedCategory.isNullOrBlank()) {
            println()
            selectedCategory = readLine()
        }
        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
        } else {
            if (categories.contains(selectedCategory)){
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            } else {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해주세요.")
        showCategories()
    }
}