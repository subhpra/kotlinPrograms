fun main () {
    val choices = listOf("rock", "paper", "scissors");
    var userPoints = 0;
    var computerPoints = 0;

    println("Welcome to this Rock, Paper, Scissor Game");
    println("Press return to start playing");
    readln();

    while (true) {
        print("Enter Rock / Paper / Scissors or Q to quit: ");
        val userChoice = readln().lowercase();
        val computerChoice = choices.random();

        if (userChoice == "q") break
        if (userChoice !in choices) println("invalid input")
        else {
            if (userChoice == computerChoice) println("that's a draw")
            else if (userChoice == "rock" && computerChoice == "scissors") {
                println("that's a smash, you won");
                userPoints++
            } else if (userChoice == "paper" && computerChoice == "rock") {
                println("that's a wrap, you won");
                userPoints++
            } else if (userChoice == "scissors" && computerChoice == "paper") {
                println("that's a cut, you won");
                userPoints++
            } else {
                println("uh huh, com won this time");
                computerPoints++
            }
        }

    }

    println();
    println("You won $userPoints time(s), so you got ${userPoints * 5} points");
    println("Computer won $computerPoints time(s), so computer got ${computerPoints * 5} points");
}