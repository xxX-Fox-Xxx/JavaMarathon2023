package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Tame impala", 2007);
        MusicBand band2 = new MusicBand("The cure", 1976);
        MusicBand band3 = new MusicBand("The beatls", 1960);
        MusicBand band4 = new MusicBand("Gruppa skryptonite", 2018);
        MusicBand band5 = new MusicBand("Pompeya", 2006);
        MusicBand band6 = new MusicBand("Пасош", 2014);
        MusicBand band7 = new MusicBand("Jefferson Airplane", 1965);
        MusicBand band8 = new MusicBand("Jimi Hendrix", 1966);
        MusicBand band9 = new MusicBand("Keadr liv", 2008);
        MusicBand band10 = new MusicBand("Кровосток", 2003);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> musicBands2000 = new ArrayList<>();

        for (MusicBand band : musicBands){
            if(band.getYear()>2000)
                musicBands2000.add(band);
        }

        System.out.println(musicBands2000);
    }
}
