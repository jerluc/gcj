// https://code.google.com/codejam/contest/dashboard?c=351101#s=p2

val t9 = Map(
  'a' -> 2, 'b' -> 22, 'c' -> 222,
  'd' -> 3, 'e' -> 33, 'f' -> 333,
  'g' -> 4, 'h' -> 44, 'i' -> 444,
  'j' -> 5, 'k' -> 55, 'l' -> 555,
  'm' -> 6, 'n' -> 66, 'o' -> 666,
  'p' -> 7, 'q' -> 77, 'r' -> 777, 's' -> 7777,
  't' -> 8, 'u' -> 88, 'v' -> 888,
  'w' -> 9, 'x' -> 99, 'y' -> 999, 'z' -> 9999,
  ' ' -> 0
) 

io.Source.stdin.getLines
  .drop(1)
  .map(_.toCharArray.map(c => t9(c).toString).reduceLeft((l, r) => if (l.last == r.head) l + " " + r else l + r))
  .zipWithIndex
  .foreach(_ match {
    case (codes, index) => println("Case #%s: %s".format(index + 1, codes))
  })
