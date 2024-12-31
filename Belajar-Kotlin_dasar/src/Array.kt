// Latihan Arrat di Kotlin

fun main() {
//    membuat array di kotlin

    val names : Array<String> = arrayOf("Budi","Satria","Megioslodon","Ambawick")

//    mengambil nilai dari array
    println(names[0])
    val satria = names[1]
    println(satria)
    val ambawick = names[3]
    println(ambawick)

//    menghitung panjang array
    println(names.size)

//    merubah nilai dari array
    names[1] = "Ambarawa"
    names[0] = "Ambajawir"
    println(names[0])
    println(names[1])

//    membuat arrat nullabel
    val anime :Array<String?> = arrayOfNulls(3)
    anime[0] = "Gembok Biru"

    for (i in anime){
        println("isi array = $i")
    }

}
