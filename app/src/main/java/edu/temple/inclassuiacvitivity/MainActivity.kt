package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        //val numberArray = Array Of Numbers
        val numberArray = Array<Int>(50) { (it+1)*2 };

        /* Step 2: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numberArray)
        spinner.adapter= TextSizeAdapter(this, numberArray)

        // Step 3: Change TextView's text size to the number selected in the Spinner */
        /*spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                displayTextView.textSize = (numberArray[position]);
            }*/

        }

    }
}