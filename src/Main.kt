/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNum(): Int {
    val min = 1
    val max = 100
    while (true) {
        try {
            print("Introduce un número entre 1 y 100: ")
            val num = readln().toInt()
            if (num in min..max) {
                return num

            } else {
                print("**Error** Número no válido (pulse Enter para continuar...)")
                readln()
            }
        } catch (e: NumberFormatException){
            print("**Error** Número no válido (pulse Enter para continuar...)")
            readln()
        }

    }
}
/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta(): Boolean {
    while (true){
        print("¿Desea generar otra tabla de multiplicación? (s/n)")
        val siono = readln()
        if (siono != "s" && siono != "n"){
            print("**Respuesta no válida** (pulse Enter para continuar...)")
            readln()
        } else {
            return siono == "s"
        }
    }
}
fun tablas(num:Int){
    println("La tabla de multiplicar del número $num es:")
    val tabla = Array(10) { i -> num * (i+1) }
    for (i in tabla.indices){
        println("${i+1} -> $num x ${i+1} = ${tabla[i]}")
    }
}

fun main() {
    //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
    //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"

    do {
        val num = pedirNum()
        tablas(num)
    } while (pregunta())
}