// 실습 1. 사용자 정보 저장하고 출력하기
fun main(args: Array<String>) {
    println("안녕하세요. 당신의 이름은 무엇인가요? : ")
    val userName = readLine()
    println("""
        안녕하세요, $userName 님,
        만나뵙게 되어 영광입니다.
    """.trimIndent())
}