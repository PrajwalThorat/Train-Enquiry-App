public class Train {

    private String name;
    private int trainNo;
    private String source;
    private String destination;


    public Train(String name , int trainNo , String source , String destination){
        this.name = name;
        this.trainNo = trainNo;
        this.source = source;
        this.destination = destination;

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getTrainNo() {
        return trainNo;
    }


    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }


    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display(){
        System.out.println(name+" "+trainNo+" "+source+" "+destination);
    }


}