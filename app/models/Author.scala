package models

case class Author(name: String)

object Author {
	// get the currently running application
	import play.api.Play.current
	// import the AnormCypher library
	import org.anormcypher._

	// configure the server without auth
	Neo4jREST.setServer("localhost", 7474, "/db/data/")

	def create() {
		// create a node
		Cypher("""CREATE (Author {name:"Connor"})""").execute()
	}
}