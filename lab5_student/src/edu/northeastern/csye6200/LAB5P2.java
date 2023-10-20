
package edu.northeastern.csye6200;

public class LAB5P2 {
	public static void main(String[] args){
		// TODO: write your code here
		RoomPeople roomA = new RoomPeople();
        RoomPeople roomB = new RoomPeople();
        //extra 
//        roomA.addOneToRoom(2);
//        roomB.addOneToRoom(3);
//   
        roomA.addOneToRoom();  // Add one to room a
        roomA.addOneToRoom();  // Add one to room a

        roomB.addOneToRoom();  // Add one to room b
        roomB.addOneToRoom();  // Add one to room b
        roomB.addOneToRoom();  // Add one to room b

        System.out.println("Add two to room a and three to room b");
        System.out.println("Room a holds " + roomA.getNumber());
        System.out.println("Room b holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());

        roomA.removeOneFromRoom();  // Remove one from room a
        roomA.removeOneFromRoom();  // Remove one from room a
        
        roomB.removeOneFromRoom();  // Remove one from room b
        roomB.removeOneFromRoom();  // Remove one from room b

        System.out.println("\nRemove two from both rooms");
        System.out.println("Room a holds " + roomA.getNumber());
        System.out.println("Room b holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());

     // Remove two from room a (should not change the values)

        roomA.removeOneFromRoom();         
        roomA.removeOneFromRoom();  
  
        System.out.println("\nRemove two from room a (should not change the values)");
        System.out.println("Room a holds " + roomA.getNumber());
        System.out.println("Room b holds " + roomB.getNumber());
        System.out.println("Total in all rooms is " + RoomPeople.getTotal());
        
        
    }
}

class RoomPeople {
    
	// TODO: write your code here
	int numberInRoom; 
	public static int totalNumber;
	
    //static getter
    public static int getTotal(){
    	// TODO: write your code here
    	return totalNumber;
    }
    // constructors 
    public RoomPeople() {
    	// TODO: write your code here
    	//initialize to 0 for every new instance 
    	this.numberInRoom = 0;
    }
    
    public void addOneToRoom(){
    	// TODO: write your code here
    	this.numberInRoom ++;
    	totalNumber ++; 
    }
    
    public void removeOneFromRoom(){
    	// TODO: write your code here
    	if (this.numberInRoom > 0) {
    		this.numberInRoom --;
    		totalNumber --; 
    		} 
    }
    
    //getter for given room 
    public int getNumber(){
    	// TODO: write your code here
        return this.numberInRoom;
    }
    
    // extra 
//    public void addOneToRoom(int num) {
//        this.numberInRoom += num;
//        totalNumber += num;
//    }

//    public void removeOneFromRoom(int num) {
//        if (this.numberInRoom >= num) {
//            this.numberInRoom -= num;
//            totalNumber -= num;
//        } else {
//            totalNumber -= this.numberInRoom;
//            this.numberInRoom = 0;
//        }
//    }
}   
