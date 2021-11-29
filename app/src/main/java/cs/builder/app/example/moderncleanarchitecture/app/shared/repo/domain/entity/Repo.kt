package cs.builder.app.example.moderncleanarchitecture.app.shared.repo.domain.entity

/** */
data class Repo(
    val id: Long,
    val name: String,
    val description: String,
    val url: String,
    val language: String,
    val createdAtUnix: Long,
    val updatedAtUnix: Long,
)
