package com.example.attendance;
//package edu.oakland.myrecipedbnov14;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;

public class DBHelper extends AppCompatActivity {
    public static SQLiteDatabase db;
    //DBHelper myDbHelper;


    Button searchBtn;
    EditText searchTxt;
    String txt = "";

    TextView noResult;

    ListView myList;
    //MyCustomAdapter myCustomAdapter;

    Spinner categorySpinner;

    ArrayAdapter<String> mySpinnerAdapter;

    String[] categoryArr = {"All", "Main Dish", "Side Dish", "Salad",
            "Soup", "Dessert", "None", "Sort By Rating"};

    ArrayList<Integer> RIdList;
    ArrayList<String> RNameList;
    ArrayList<String> RIngredientsList;
    ArrayList<String> RPreparationList;
    ArrayList<String> RImageList;
    ArrayList<Float> RRating;

    //we need array order index because id in DB is different than the array index
    // when certain category was chosen
    int arrayIndex = -1;

    boolean first = true;
    String AllQuery = "";

    Intent foodDetails;
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int i, long l) {
                String cat = categoryArr[i];
                String catQuery = AllQuery;
                String orderByRatingQuery = "select * from recipe order by rating DESC";
                if (i != 0 && i != 6 && i != 7)
                    catQuery = "select * from recipe where category='" + cat + "'";

                if (i != 6) getResult(catQuery);
                // if (!first && i != 6) getResult(catQuery);
                // if (first) first = false;

                if (i == 7) getResult(orderByRatingQuery);

                if (i != 6)  //6 is the search option
                    searchTxt.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt = searchTxt.getText().toString();
                String searchQuery = "select * from recipe where ingredients like '%"
                        + txt + "%'";
                getResult(searchQuery);

                //to hide the soft keyboard after pressing the search button
                hideSoftKeyboard();

                categorySpinner.setSelection(6);
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                foodDetails.putExtra("foodId", RIdList.get(i));
                foodDetails.putExtra("foodName", RNameList.get(i));
                foodDetails.putExtra("foodIngredients", RIngredientsList.get(i));
                foodDetails.putExtra("foodPreparation", RPreparationList.get(i));
                foodDetails.putExtra("foodImage", RImageList.get(i));
                foodDetails.putExtra("foodRating", RRating.get(i));

                //We need this code to update the rating in the array with the right
                // index after the user updated it and come back
                // from the food Details view
                arrayIndex = i;
                //we need to get the result of the  Rating update
                MainActivity.this.startActivityForResult(foodDetails, 123);

            }
        });

        Intent myIntent = getIntent();
        int DeletedItemId = myIntent.getIntExtra("itemId", 0);

    }

    public void deleteItemFromDB(int id) {
        boolean result = true;
        String q = "DELETE FROM recipe WHERE id=" + id;
        db.execSQL(q);

        //return result;
    }

    public void getResult(String q) {
        Cursor result = db.rawQuery(q, null);
        result.moveToFirst();
        int count = result.getCount();
        Log.i("count=", String.valueOf(count));
        //arrays for name, ingredients and preparation for each recipe
        RIdList = new ArrayList<Integer>();
        RNameList = new ArrayList<String>();
        RIngredientsList = new ArrayList<String>();
        RPreparationList = new ArrayList<String>();
        RImageList = new ArrayList<String>();
        RRating = new ArrayList<Float>();
        //just to give number for each recipe
        int foodNumber = 1;
        if (count >= 1) {
            noResult.setVisibility(View.GONE);
            myList.setVisibility(View.VISIBLE);
            do {
                RIdList.add(result.getInt(0)); // 0 is the first id column
                RNameList.add(foodNumber + ". " + result.getString(1));
                RIngredientsList.add(result.getString(2));
                RPreparationList.add(result.getString(3));
                RImageList.add(result.getString(5));
                RRating.add(result.getFloat(6));

                foodNumber++;
            } while (result.moveToNext());


            for (int i = 0; i < RNameList.size(); i++)
                if (RImageList.get(i) == null)
                    RImageList.set(i, "no_image.png");

            myCustomAdapter = new MyCustomAdapter(MainActivity.this,
                    RNameList, RImageList, RIdList);
            myList.setAdapter(myCustomAdapter);

        } else {
            myList.setVisibility(View.GONE);
            noResult.setVisibility(View.VISIBLE);
        }
    }//end of getResult

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        float r = 1f;
        // Check which request we're responding to
        if (requestCode == 123) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                r = data.getFloatExtra("newRating", 1);

                //update the RRating array.In this example, we don't need to load
                // the data from the database again.
                // We just need to updates the rating in the array with the right
                // index
                if (arrayIndex != -1)
                    RRating.set(arrayIndex, r);
            }
        }

    }

    public void createDB() {
        myDbHelper = new DBHelper(this);
        try {
            myDbHelper.createDataBase();

        } catch (IOException ioe) {

            throw new Error("Unable to create database");
        }

        try {

            myDbHelper.openDataBase();

        } catch (SQLException sqle) {

        }
        db = myDbHelper.getWritableDatabase();
    }

    public void hideSoftKeyboard() {

        if (getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    } */
}
