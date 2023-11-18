fun main() {
    val graph = listOf(
            setOf(6, 7), // 0
            setOf(2, 3, 5),
            setOf(1),
            setOf(1, 6), // 3
            setOf(6),
            setOf(1, 7), // 5
            setOf(0, 3, 4, 7), // 6
            setOf(0, 5, 6) // 7
    )
    val result = getShortestWaySimple(graph, 0, 5)
    println(result)
}
