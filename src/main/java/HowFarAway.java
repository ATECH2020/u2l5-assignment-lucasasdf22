import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        double sLatitude = in.nextDouble();

        System.out.print("Enter the longitude of the starting location: ");
        double sLongitude = in.nextDouble();

        System.out.print("Enter the latitude of the ending location: ");
        double eLatitude = in.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        double eLongitude = in.nextDouble();

        GeoLocation geoL = new GeoLocation(sLatitude, sLongitude);
        GeoLocation geoL2 = new GeoLocation(eLatitude, eLongitude);

        double distance = geoL.distanceFrom(geoL2);

        System.out.println("The distance is " + distance + " miles.");
    }
}