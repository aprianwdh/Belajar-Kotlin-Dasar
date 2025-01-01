fun main() {
//    Membuat tipe data range di kotlin
    val range = 1..10

    for (i in range) {
        println(i)
    }

//    macam macam operasi di range
//    1.count (jumlah dari data)
    println(" jumlah dari data = ${range.count()}")
//    2.countles
    println(" apakah 2 ada di range = ${range.contains(2)}")
    println(" apakah 100 ada di range = ${range.contains(100)}")
//    3.first
    println(" nilai pertama dari range = ${range.first}")
//    4.last
    println(" nilai terakhir dari range = ${range.last}")
//    5.step
    println(" step/penambahan dari range = ${range.step}")
//    6.membalik range
    val reverse = 10 downTo 1
    for (a in reverse) println(a)
//    7.mengatur step
    val ganjil = 1..10 step 2
    for (x in ganjil) println(x)
}