package pl.yellowduck.netflix90.resources;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class VideoCassetteCatalogTest {


    //test sprawdzenia czy utworzony katalog jets pusty
    @Test
    public void shouldCreateCatalogThatIsEmpty() {

        //when
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();

        //then
        assertThat(catalog.getVideoCassettes()).isEmpty();
    }


    @Test // org.juit.Test
    public void shouldAddVideoCassetteTo() {
        //given
        VideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette1 = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "TheRoom",
                new Director("v", "v", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette(
                "VID002",
                BigDecimal.valueOf(20),
                "TheRoom",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        //when
        catalog.addVideoCassette(videoCassette1, videoCassette2);


        //then
        assertThat(catalog.getVideoCassettes()).
                hasSize(2);

    }

}
