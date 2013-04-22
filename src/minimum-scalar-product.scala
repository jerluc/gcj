// https://code.google.com/codejam/contest/32016/dashboard#s=p0
// TODO: Finish dis shiz! :)

def vectorize(vs: String) = vs.split(" ").map(_.toInt).toList

def product(v1: List[Int], v2: List[Int]) = v1.zip(v2).map(x => x._1 + x._2).reduceLeft(_ + _)

io.Source.stdin.getLines
  .drop(1)
  .grouped(3)
  .map(t => (vectorize(t(1)), vectorize(t(2))))
  .foreach(_ match {
    case (v1, v2) => println(product(v1, v2))
  }) 
