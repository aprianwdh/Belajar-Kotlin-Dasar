fun main() {
    ForUntukRange()
    For_Untuk_Array()
    

}

fun ForUntukRange(){
    //    for untuk range
    var JumlahNilai = 0
    for (i in 0..10){
        println(i)
        JumlahNilai ++
    }
    println("Jumlah Nilai = $JumlahNilai")
}

fun For_Untuk_Array(){
    //    foor untuk array
    val anime_list = arrayOf("Bleach","Naruto","Gembok  Biru","AOT")

    var index = 0
    for (i in anime_list){
        println("Anime ke -${index+1} = $i")
        index++
    }
}
