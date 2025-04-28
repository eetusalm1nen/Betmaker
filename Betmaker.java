import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Betmaker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("anna kertoimet pilkuilla erotettuna");
        String[] lukujenSyote = scanner.nextLine().split(",");
        List<Double> luvut = new ArrayList<>();
        for (String luku : lukujenSyote){
            luvut.add(Double.parseDouble(luku.trim()));
        }

        System.out.println("panos?");
        double panos = scanner.nextDouble();

        double käänteistenSumma = 0.0;
        for (double luku : luvut){
            käänteistenSumma += 1.0 / luku;
        }
        
        System.out.println("panos jaettuna kertoimille:");
        for (double kerroin : luvut){
            double jaettuPanos = (1.0 / kerroin) / käänteistenSumma * panos;
            System.out.println(String.format("Kertoimelle %.2f: %.2f", kerroin, jaettuPanos));
        }

        scanner.close();
    }
}