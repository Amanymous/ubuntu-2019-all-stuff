package com.amanymous;

public class hotelroom {
    int room;double rentalrate;
   void setRooms(int num){
       room=num;
   }
    int getRoom(){
       return room;
    }
    void setRentalrate(int r){
       rentalrate=r;
    }
    double getRentalrate(){
       return rentalrate;
    }
    public hotelroom(int room){
       this.room=room;
       if(room<=299){
           rentalrate=69.95;
           System.out.println("rooms are "+ rentalrate);
       }
       else{
           rentalrate=89.95;
           System.out.println("rooms are more than 299:"+rentalrate);
       }
    }
}
class suite extends hotelroom{
    public suite (int room)
    {
        super(room);
        rentalrate +=40;
    }


}




/*private int roomNumber;
	protected double rate;

	public void setroomNumber(int num)
	{
		roomNumber=num;
	}

	public int getroomNumber()
	{
		return roomNumber;
	}

	public void setRate (double r)
	{
		rate=r;
	}

	public double getRate()
	{
		return rate;
	}

	public HotelRoom(int room)
	{
		roomNumber=room;
		if(room <=299)
			rate=69.95;
		else
			rate=89.95;
	}

//I don't know if this next bit is correct
	 public void displayRate(int room)
	{
		 if(room<=299)
		JOptionPane.showMessageDialog(null,
				"The room will cost $69.95 per night.");
		 else
			 JOptionPane.showMessageDialog(null,
					 "The room will cost $89.95 per night.");
	}
}

	}
}*/