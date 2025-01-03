fun main() {
    var i = 1

//    1.break
    while (true){
        println("Halo $i")
        i++

        if (i > 5){
            break
        }
    }

    var x = 1
//    2.continue
    while (x<10){
        if (x%2 == 1){
            x++
            continue
        }

        println(x)
        x++
    }
}