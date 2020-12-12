class Vehicle {
    String direction;

    Vehicle(String direction){
        this.direction = direction;
    }
}

class Road {
    public static void main(String[] args) throws FatalRoadAccidentException {
        Vehicle v1 = new Vehicle("North");
        Vehicle v2 = new Vehicle("South");

        if(!v1.direction.equals(v2.direction)){
            throw new FatalRoadAccidentException();
        }
    }
}

class FatalRoadAccidentException extends Exception{
    FatalRoadAccidentException(){
        System.out.print("The two vehicles are moving in opposite direction. Hence accident might occur.");
    }
}