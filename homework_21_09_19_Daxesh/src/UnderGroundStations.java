import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class UnderGroundStations {
    public static void main(String[] args) {
        stations();
    }
    public static void stations() {
        //  ArrayList<String > lines = new ArrayList<>();
        String[] lines = {"Central", "Circle", "Hammersmith and City", "Metropolitan", "Bakerloo", "District", "Jubilee",
                "Northern", "Picadilly", "Victoria", "Waterloo and city", "DLR", "London overground", "Tram",
                "Tfl Rail"};
//        String[] station = {"Aldgate", "Aldgate East", "Angel", "Baker Street", "Bank", "Barbican", "Bayswater",
//                "Blackfriars", "Bond Street", "Borough", "Cannon Street LU", "Chancery Lane", "Charing cross",
//                "Covent Garden", "Earl's court", "Edgware road", "Elephant and castle", "Emabrkment", "Euston",
//                "Euston square", "Farringdon", "Gloucester Road", "Goodge street", "Great portland street",
//                "Green park"};
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Station name");
        String stationName = scr.nextLine();
        switch (stationName.toLowerCase()) {
            case "aldgate":
                System.out.println(lines[1]);
                System.out.println(lines[3]);
                break;
            case "aldgate east":
                System.out.println(lines[2]);
                System.out.println(lines[4]);
                break;
            case "angel":
            case "borough":
                System.out.println(lines[7]);
                break;
            case "baker street":
                System.out.println(lines[3]);
                System.out.println(lines[4]);
                System.out.println(lines[1]);
                System.out.println(lines[6]);
                System.out.println(lines[2]);
                break;
            case "bank":
                System.out.println(lines[10]);
                System.out.println(lines[7]);
                System.out.println(lines[0]);
                break;
            case "barbican":
                System.out.println(lines[3]);
                System.out.println(lines[0]);
                System.out.println(lines[2]);
                break;
            case "bayswater":
            case "cannon street":
            case "blackfriars":
                System.out.println(lines[5]);
                System.out.println(lines[1]);
                break;
            case "bondstreet":
                System.out.println(lines[0]);
                System.out.println(lines[6]);
                break;
            case "chancery lane":
                System.out.println(lines[0]);
                break;
            case "charing cross":
            case "elephant and castle":
                System.out.println(lines[4]);
                System.out.println(lines[7]);
                break;
            case "covent garden":
                System.out.println(lines[8]);
                break;
            case "edgware road":
                System.out.println(lines[4]);
                System.out.println(lines[2]);
                System.out.println(lines[1]);
                System.out.println(lines[5]);
                break;
            case "embarkment":
                System.out.println(lines[7]);
                System.out.println(lines[4]);
                System.out.println(lines[5]);
                System.out.println(lines[1]);
                break;
            case "euston":
                System.out.println(lines[7]);
                System.out.println(lines[9]);
                break;
            case "euston square":
            case "great portland street":
            case "farringdon":
                System.out.println(lines[1]);
                System.out.println(lines[2]);
                System.out.println(lines[3]);
                break;
            case "french":

            case "goodge street":
                System.out.println(lines[7]);
                System.out.println(lines[4]);
                break;
            case "gloucester road":
                System.out.println(lines[1]);
                System.out.println(lines[5]);
                System.out.println(lines[8]);
                break;
            case "green park":
                System.out.println(lines[6]);
                System.out.println(lines[8]);
                System.out.println(lines[9]);
                break;
            default:
                System.out.println("This station is not included in the list");
        }
    }
}
