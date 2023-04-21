package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick", 65));
        members1.add(new MusicArtist("Marty Balin", 60));
        members1.add(new MusicArtist("Paul Kantner", 40));

        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 50));
        members2.add(new MusicArtist("Paul McCar", 45));
        members2.add(new MusicArtist("Ringo Harrison", 34));

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transfer(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
