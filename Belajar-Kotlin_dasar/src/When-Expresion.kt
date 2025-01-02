fun main() {
    val nilai = "Z"
    when (nilai) {
        "A" -> println("lulus brow")
        "B" -> println("lulus aja")
        "C" -> println("lulus mepet")
        else -> println("ke kantor saya ya")
    }

    when (nilai){
        "A","B" -> {
            println("makan makan brow")
        }
        else -> {
            println("Yaah nggak diajak kamu")
        }
    }

    val pass_value = arrayOf("A","B","c")

    when (nilai) {
        in pass_value -> println("sigma")
        !in pass_value -> println("skibidi")
    }

//    penting
    val anime_goat = arrayOf("Bleach","Naruto","Wanpis")
    val anime = "AOT"
    when{
        anime in anime_goat -> println("GOATED")
        anime !in anime_goat -> println("MEDIOKER")
    }
}