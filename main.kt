fun main() {
    // Read input array from the user
    print("Enter comma-separated numbers: ")
    val input = readLine()
    val numbers = input?.split(",")?.map { it.trim().toInt() }?.toTypedArray()

    if (numbers == null) {
        println("Invalid input. Exiting program.")
        return
    }

    // Sort the array in ascending order
    val sortedAsc = numbers.sortedArray()
    println("Ascending order: ${sortedAsc.contentToString()}")

    // Sort the array in descending order
    val sortedDesc = numbers.sortedArrayDescending()
    println("Descending order: ${sortedDesc.contentToString()}")
}
