fun main() {
//    Belajar Tipe Data di Kotlin

//    1.var (mutabble/dapat dirubah)
    var nama_depan : String = "Aprian"
    var nama_belakang = "Widhi"

    println("$nama_depan $nama_belakang")

    nama_depan = "KIng"
    nama_belakang = "Arthur"

    println("$nama_depan $nama_belakang")


//    2.val (imuttable/tidak dapat dirubah)
    val Jenis_kelamin : String = "Man"
    val Status = "Belum Menikah"

//    Jenis_kelamin = "man" -> akan error
    println("$Jenis_kelamin\n$Status")


//    3.nullable
    var Agama : String?
    Agama = null

    println(Agama)
    Agama = "Islam"
    println(Agama)

    println("ini adalah CONST = $COUNT")
}

// 4. Variable Const (Variable Global Scope yang immutable)
const val COUNT : Int = 0