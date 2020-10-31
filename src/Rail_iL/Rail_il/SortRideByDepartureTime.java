package Rail_il;

import java.util.Comparator;

public class SortRideByDepartureTime implements Comparator <Ride> {
    public int compare(Ride f , Ride s){
        if (f.getDepartureClock().timeToCompare() > s.getDepartureClock().timeToCompare())
            return 1;
        else if (f.getDepartureClock().timeToCompare() < s.getDepartureClock().timeToCompare())
            return -1;
        else return 0;
    }
    
}

