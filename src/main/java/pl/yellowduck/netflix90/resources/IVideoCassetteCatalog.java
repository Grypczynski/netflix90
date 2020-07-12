package pl.yellowduck.netflix90.resources;

import java.util.List;

public interface IVideoCassetteCatalog {


    void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException;

    void addVideoCassette(VideoCassette... videoCassette) throws CassetteAddException;

    List<VideoCassette> getVideoCassettes();
}
