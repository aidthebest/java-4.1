public class BonusMilesService {
    public int calculate (int price){
        int oneBonusMileCost = 20;
        int miles = price / oneBonusMileCost;
        return miles;
    }
}
