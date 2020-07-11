package pl.yellowduck.netflix90.resources;

//katalog dodaje i zwraca liste dostepnych video cassete

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class VideoCassetteCatalog implements IVideoCassetteCatalog {

    private final List<VideoCassette> cassettes = new ArrayList<>();


    @Override
    public void addVideoCassette(VideoCassette videoCassette) {
        cassettes.add(videoCassette);

    }

    @Override
    public void addVideoCassette(VideoCassette... videoCassette) {
        for (VideoCassette cassette : videoCassette) {
            addVideoCassette(cassette); //reużycie metody addVideoCassette
        }
    }

    @Override
    public List<VideoCassette> getVideoCassettes() {

        return cassettes;
    }
}
