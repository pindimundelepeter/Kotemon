import dresseur.Entraineur
import monstre.EspaceMonstre.EspeceMonstre
import monde.Zone

/** Entraineur
 */
val joueur = Entraineur(1,"Peter",100)
var rival = Entraineur(2, "Adam", 200)
val adrien = Entraineur(3,"Adrien",300)
val inferno = EspeceMonstre(1,"galum","Feu",700,300,500,1200,700,1500,2.5,1.5,3.5,5.5,3.4,5.2)
val zone  = Zone(2,"Terre",23)
fun main() {

    route1.zoneSuivante = route2
    route2.zonePrecedente = route1
    joueur.afficheDetail()
    rival.afficheDetail()
    adrien.afficheDetail()
    joueur.argents+=50
    print(inferno.afficheArt())
    joueur.afficheDetail()







    println(changeCouleur("Hello", "vert"))
    println(changeCouleur("World","bleu"))
    println("Hello ${changeCouleur("my","jaune")} World")
    println(changeCouleur("Truc","marron"))

}
/**
 * Change la couleur du message donné selon le nom de la couleur spécifié.
 * Cette fonction utilise les codes d'échappement ANSI pour appliquer une couleur à la sortie console. Si un nom de couleur
 * non reconnu ou une chaîne vide est fourni, aucune couleur n'est appliquée.
 *
 * @param message Le message auquel la couleur sera appliquée.
 * @param couleur Le nom de la couleur à appliquer (ex: "rouge", "vert", "bleu"). Par défaut c'est une chaîne vide, ce qui n'applique aucune couleur.
 * @return Le message coloré sous forme de chaîne, ou le même message si aucune couleur n'est appliquée.
 */

fun changeCouleur(message: String, couleur:String=""): String {
    val reset = "\u001B[0m"
    val codeCouleur = when (couleur.lowercase()) {
        "rouge" -> "\u001B[31m"
        "vert" -> "\u001B[32m"
        "jaune" -> "\u001B[33m"
        "bleu" -> "\u001B[34m"
        "magenta" -> "\u001B[35m"
        "cyan" -> "\u001B[36m"
        "blanc" -> "\u001B[37m"
        else -> "" // pas de couleur si non reconnu
    }
    return "$codeCouleur$message$reset"

}



