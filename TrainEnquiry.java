public class TrainEnquiry {
    private Train[] trains;

    public  TrainEnquiry(){
        trains = TrainDatabase.getTrainDetails();
    }

    public Train search(String trainName){
        for(Train train:trains){
            if(train.getName().equals(trainName)){
                return train;
            }
        }
        return null;
    }
    public Train search(int trainNumber){
        for(Train train:trains){
            if(train.getTrainNo()==trainNumber){
                return train;
            }
        }
        return null;
    }
    public Train[] search(String source , String destination){
        int count =0 ;
        for(Train train:trains){
            if(train.getSource().equals(source) && train.getDestination().equals(destination)){
                count++;
            }
        }
        Train[] searchTrain = new Train[count];
        int index = 0;
        for(Train train:trains){
            if(train.getSource().equals(source) && train.getDestination().equals(destination)){
                searchTrain[index] = train;
                index++;
            }
        }
        return searchTrain ;
    }
}
