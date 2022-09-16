fun main() {
    println("안녕하세요. 당신의 이름은 무엇인가요? : ")
    val userName = readLine()
    println("""
        안녕하세요, $userName 님,
        만나뵙게 되어 영광입니다.
        원하시는 카테고리를 입력하세요.
        ================================================
    """.trimIndent())

    val categories = arrayOf("패션", "반려동물용품", "전자기기")
    for (category in categories){
        println(category)
    }
    println("=> 장바구니로 이동하려면 #을 입력하세요.")

    var selectedCategory = readLine()
    while (selectedCategory.isNullOrBlank()){
        println()
        selectedCategory = readLine()
    }
    if (selectedCategory == "#"){
        // TODO 1. 장바구니 이동
    } else {
        // TODO 2. 카테고리 상품 목록 보여주기
        // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
    }



}