package pl.yellowduck.netflix90.resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassete {
    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category;
    private Set<Actor> actors;

    public VideoCassete(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

}
