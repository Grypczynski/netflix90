package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class UniqueVideoCassetteCatalogTest {

    @Test
    public void shouldNotAddSameIdVideCassette() {

        //given
        VideoCassette videoCassette1 = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "TheRoom",
                new Director("v", "v", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "TheRoom",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        IVideoCassetteCatalog catalog = new UniqueVideoCassetteCatalog();

        //when
        catalog.addVideoCassette(videoCassette1, videoCassette2);

        //then
        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(1);


    }

}
