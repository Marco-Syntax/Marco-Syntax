fun main() {
    println("Hallo wie heißt du?")
    var name = readln()
    println("Hallo $name")

    println("$name wie viel Kilogramm wiegst du")
    var Gewicht = readln().toDouble()

    println("Wie groß bist du in cm")
    var Größe = readln().toDouble()
    var BMI = Gewicht / (Größe * Größe)
    println("BMI=$BMI")




    /*Frage den Benutzer nach seinem Namen.
    Sprich den User mit seinem Namen an und frage nach seinem Gewicht in Kilogramm.
    Frage den Benutzer zudem nach seiner Körpergröße in Metern.
    Berechne den BMI mit der Formel: BMI = Gewicht / (Körpergröße * Körpergröße)
    Gib den berechneten BMI aus.*/


}