package com.example.recyclerview;
//this is called structured class
//Yaha pr hame utne variables chahiye jitne hame run time m us view ko set krne ke liye chahiye like
// image , contact number and contact har bar change hoga so un teen ko define krna hai
public class Contact_model
{
public int img;
public String name;
   public String number;
   //make sure to make it public in order to use it in recyclerContactAdapter.java
public Contact_model(int img ,String name , String number){
    this.name = name;
    this.number = number;
    this.img = img ;
}


}
