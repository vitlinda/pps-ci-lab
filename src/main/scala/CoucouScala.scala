
case class CoucouScala() {
  var name = ""

  def getName: String = name

  def getMessage: String = {
    if (name eq "") return "Salut!"
    "Salut " + name
  }

  def setName(name: String): Unit = {
    this.name = name
  }
}
