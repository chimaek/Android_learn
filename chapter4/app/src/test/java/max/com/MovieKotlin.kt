package max.com

import android.graphics.Movie

class MovieKotlin {
    var leading: List<ActorKolin?>? = null

    class ActorKolin {
        var realname: String? = null
        var stagename: String? = null
        var age: Int = 0
        var gender: String? = null
        var actedMovies: List<Movie?>? = null
    }

    var support: List<ActorKolin?>? = null

    var title: String? = null

    var showAge: Int = 0
    var genre: String? = null

    fun castiting(movies: List<MovieKotlin?>?): MutableList<ActorKolin> {
        var recommand = mutableListOf<ActorKolin>()

        movies.forEach { movie ->
            if (movie?.title?.contains("도시") == true) {
                movie.leading?.filter {
                    it?.gender == "W" && it.age >= 20 && it.age < 30 && (it.actedMovies?.size ?: 0)
                }
            }
        }
    }
}