package com.test;

import com.google.gson.Gson;
import datamodel.RCB;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MakeTeam {
    RCB rcb;
    @BeforeTest
    public void readFileData(){
        Gson gson = new Gson();
        try {
            rcb = gson.fromJson(
                    new FileReader("" + System.getProperty("user.dir") + "/src/main/resources/RCB.json"),
                    RCB.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Make The team with max 4 foreign players and should be one wicket keeper")
    public void makeTeam(){
        int foreignPlayer=0;
        int wicketkeeper=0;
        for(int i=0;i<rcb.getPlayer().size();i++){
             if(!rcb.getPlayer().get(i).getCountry().equalsIgnoreCase("india") ){
                 foreignPlayer++;
             }
             if(rcb.getPlayer().get(i).getRole().equals("Wicket-keeper")){
                 wicketkeeper++;
             }
        }
        Assert.assertTrue("foreignPlayer should not be grater than four ",foreignPlayer<=4);
        Assert.assertTrue("should be have one wicket keeper",wicketkeeper>=1);
    }
}
