fun main() {
    while_loop()
    do_while_loop()
}

fun while_loop(){
    var i = 0
    while (i<5){
        println("Perulangan ke-$i")
        i++
    }
}

fun do_while_loop(){
    var i = 0
    do {
        println("perulangan ke-$i")
        i++
    } while (i>2)
}