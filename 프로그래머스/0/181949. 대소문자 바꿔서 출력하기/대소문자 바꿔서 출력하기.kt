fun main(args: Array<String>) {
    // 입력받은 문자열을 s1 변수에 저장
    val s1 = readLine()!!

    // 변환된 문자열을 저장할 변수 result 초기화
    var result = ""

    // 입력 문자열의 각 문자에 대해 대소문자를 변환하여 result에 추가
    for (char in s1) {
        result += if (char.isUpperCase()) {
            char.toLowerCase()
        } else {
            char.toUpperCase()
        }
    }

    // 변환된 문자열 출력
    println(result)
}