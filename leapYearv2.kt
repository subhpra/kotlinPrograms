fun main () {
    print("Enter a Year: ");
    val inputtedYear: Int = readln().toInt();

    if ((inputtedYear % 4 == 0 && inputtedYear % 100 != 0) || inputtedYear % 400 == 0) println("\nThis is a Leap Year\n")
    else {
        println("\nThis is not a Leap Year\n");

        var nextYear: Int = inputtedYear + 1;

        while (true) {
            if ((nextYear % 4 == 0 && nextYear % 100 != 0) || nextYear % 400 == 0) {
                println("$nextYear is next Leap Year");
                break
            }
            nextYear++
        }
    }
}