data class Usuario(
    val id: Int,
    val nome: String,
    val email: String
){
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id
}
