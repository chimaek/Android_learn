package max.com;

import java.util.ArrayList;
import java.util.List;

public class MA {
    public static class Movie {
        public List<Actor> leadingActors;

        public List<Actor> supportActors;

        public String title;

        public int showAge;

        public String genre;


        public static class Actor {
            public String realName;
            public String stageName;
            public int age;
            public String gender;
            public List<Movie> actedMoveis;

        }

        public static List<Actor> casting(List<Movie> movies) {
            List<Actor> actors = new ArrayList<>();

            for (Movie movie : movies) {
                if (movie.title.contains("도시")) {
                    for (Actor actor : movie.leadingActors) {
                        if (actor.gender.equals("W")
                                && actor.actedMoveis.size() >= 5
                                && actor.age >= 20
                                && actor.age < 30) {
                            actors.add(actor);
                        }
                    }
                    for (Actor actor : movie.supportActors) {
                        if (actor.gender.equals("M") && actor.age >= 30 && actor.age < 40) {
                            for (Movie actedmovie : actor.actedMoveis) {
                                if (actedmovie.genre.equals("공포")) {
                                    actors.add(actor);
                                }
                            }
                        }
                    }
                }
            }
            return actors;
        }
    }
}
