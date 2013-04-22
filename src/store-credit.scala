// https://code.google.com/codejam/contest/dashboard?c=351101#s=p0
// Could probably be done more efficiently than using Array#combinations(Int), but look how pretty it is :)

io.Source.stdin.getLines
  .drop(1)
  .grouped(3)
  .map(t => (t(0).toInt, t(1).toInt, t(2).split(" ").map(_.toInt)))
  .zipWithIndex
  .foreach(_ match {
    case ((credit, inventory, items), index) => {
      val winningCombo = items
        .combinations(2)
        .filter(_.sum == credit)
        .map(combo => List(combo(0), combo(1)))
        .next
      println("Case #%s: %s %s".format(index + 1, items.indexOf(winningCombo(0)) + 1, items.lastIndexOf(winningCombo(1)) + 1))
    }
  })
