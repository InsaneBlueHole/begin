fun main() {
  val visitedCountries = arrayOf(
    "Russia", "USA", "Poland",
    "The Netherlands", "Romania", "Greece",
    "Germany", "Spain", "Portugal",
    "Serbia", "Hungary", "Austria"
  )

  val rangeFromZerotoTen :IntRange = 0..10
  println(rangeFromZerotoTen)

  val exclusiveRange :IntRange = 0 until 10
  println(exclusiveRange)

  for (index :Int in rangeFromZerotoTen) {
    println(index)
  }

  println("")
}