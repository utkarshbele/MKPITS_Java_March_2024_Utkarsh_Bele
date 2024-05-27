package Assinment14.LinkedList.PM;
import java.util.Comparator;

public class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
            if(o1.getDuration()== o2.getDuration())
            {
                return 0;
            } else if (o1.getDuration()>o2.getDuration())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
