package com.example.android.myapplication;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int n =0;
    public void submitOrder(View view)
    {
        n++;
        display( n);
    }
    public void minimiseOrder(View view)
    {
        if(n!=0)
        {
            n--;
        }
        display(n);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int n)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + n);

    }
    public void price(View view)
    {
        int price=n*100;
        display1(price);
    }
    private void display1(int price)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.price_pizza);
        quantityTextView.setText("" + price);

    }

}