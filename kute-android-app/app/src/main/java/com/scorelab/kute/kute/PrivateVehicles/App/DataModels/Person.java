package com.scorelab.kute.kute.PrivateVehicles.App.DataModels;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by nipunarora on 10/06/17.
 */

public class Person implements Serializable {
    /***************** Defing Properties ***********/
    //Add provision for vehicle
    //Make these variables private
    public String id,name,img_url,occupation,other_details,contact_phone,vehicle;
    //Implement in some other way public Boolean is_friend; // This will indicate whether the given person is users friend
    public ArrayList<Route> route_list;
    /*********** Properties Defined *******/
     public Person() {
     }

     /****************** This constructor will configure for the list item
     ****************** rest detail will be filled later when person detail activity is called *******/

    public Person(String name,String id,String img_url)   //Add id and img_url(Not being added right now because we dont have the backend for now)
    {
        this.name=name;
        this.img_url=img_url;
        this.id=id;
    }

    /************** This method will be invoked when we load personDetail Activity **********/

    public void completePersonDetail(String occupation,ArrayList<Route>list,String other_details,String phone,String vehicle)
    {
        this.occupation=occupation;
        this.route_list=list;
        this.other_details=other_details;
        this.contact_phone=phone;
        this.vehicle=vehicle;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        /*this.occupation="--";
        this.vehicle="--";
        this.contact_phone="--";
        this.other_details="--";
        this.route_list=null;*/
    }
}