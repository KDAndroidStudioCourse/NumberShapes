package com.cj.darra.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number {
        int number;

        public boolean isTriangular() {
            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {
                x++;

                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void testNumber(View view) {
        Log.i("Info", "Button pressed!");

        EditText numberText = (EditText) findViewById(R.id.numberEditText);

        if (numberText.getText().toString().isEmpty()) {
            Toast.makeText(this, "You haven't inserted a number", Toast.LENGTH_SHORT).show();
        } else {
            Number MyNumber = new Number();

            MyNumber.number = Integer.parseInt(numberText.getText().toString());

            if (MyNumber.isSquare() && MyNumber.isTriangular()) {
                Toast.makeText(this, "The number is both square and triangular", Toast.LENGTH_SHORT).show();
            } else if (MyNumber.isSquare()) {
                Toast.makeText(this, "The number is square", Toast.LENGTH_SHORT).show();
            } else if (MyNumber.isTriangular()) {
                Toast.makeText(this, "The number is triangular", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "The number is neither square nor triangular", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
