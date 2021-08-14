public class TrainDatabase {

    private static Train[] trains;


    static{
        trains = new Train[]{
                new Train("ABC", 108, "AMT", "PUNE"),
                new Train("DEF", 101, "MUM", "BAD"),
                new Train("GEF", 102, "BNG", "HYD"),
                new Train("XYZ", 103, "PUNE", "MUM"),
                new Train("PQR", 104, "DELHI", "CHE"),
                new Train("WXY", 105, "MUM", "CEN")
            };
    }

    public static Train[] getTrainDetails(){
        return trains;
    }
    
}
