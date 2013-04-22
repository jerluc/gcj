// https://code.google.com/codejam/contest/dashboard?c=351101#s=p1

io.Source.stdin.getLines
  .drop(1)
  .map(_.split(" ").reverse)
  .zipWithIndex
  .foreach(_ match {
    case (reversed, index) => println("Case #%s: %s".format(index + 1, reversed.mkString(" ")))
  })
