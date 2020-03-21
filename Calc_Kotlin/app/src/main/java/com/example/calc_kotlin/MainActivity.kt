package com.example.calc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SimpleCursorAdapter
import android.widget.TextView
import com.example.myapplication.Calculator
import java.lang.Math.log
import java.lang.Math.round

class MainActivity : AppCompatActivity() {
    lateinit var cal: Calculator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cal =  Calculator()

        setContentView(R.layout.activity_main);
    }
    public override fun onRestoreInstanceState(savedInstanceState:Bundle ) {

        var res:TextView = findViewById(R.id.display);
        res.setText(savedInstanceState.getString("GG"));
        if (savedInstanceState != null) {
            cal = savedInstanceState.getParcelable("G1")!!;
        } else {
            cal = Calculator();
        }

    }
    protected override fun onSaveInstanceState(outState: Bundle) {
        var res:TextView = findViewById(R.id.display);
        outState.putString("GG", res.getText() as String?);

        outState.putParcelable("G1",cal);
        super.onSaveInstanceState(outState);

    }


    public fun button16_sin( gg: View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length.equals(0)) {

            res.setText("ERROR!");
        }else {
            cal.firstnum = comps.toFloat()
            cal.operation = "sin";
            cal.calculus()
            if ((cal.otvet % 1).toString() =="0")
                res.setText(round(cal.otvet))
            else {
                res.setText(cal.otvet.toString());
            }

        }
    }
    public fun button16_ln( gg:View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length.equals(0)) {

        } else {
            cal.firstnum = comps.toFloat()
            if (comps.length.equals(0)) {

                res.setText("ERROR!");
            } else {
                cal.otvet = 56f////////////log(10,45) as Float///////////cal.firstnum) as Float

                if ((cal.otvet % 1).toString() =="0")
                    res.setText(round(cal.otvet))
                else {
                    res.setText(cal.otvet.toString());
                }

            }
        }

    }
    public fun button16_sqrt( gg:View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length.equals(0)) {

        } else {
            cal.firstnum = comps.toFloat()
            cal.operation = ";";
            cal.calculus();
            if ((cal.otvet % 1).toString() =="0")
                res.setText(round(cal.otvet))
            else {
                res.setText(cal.otvet.toString());
            }

        }
    }

    public fun button16_tan( gg:View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length.equals(0)) {

        } else {
            cal.firstnum = comps.toFloat()
            cal.operation = "tan";
            cal.calculus();
            if ((cal.otvet % 1).toString() =="0")
                res.setText(round(cal.otvet))
            else {
                res.setText(cal.otvet.toString());
            }

        }
    }
    public fun button16_cos( gg:View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length.equals(0)) {

        } else {
            cal.firstnum = comps.toFloat();
            cal.operation = "cos";
            cal.calculus();
            if ((cal.otvet % 1).toString() =="0")
                res.setText(Math.round(cal.otvet));
            else {
                res.setText(cal.otvet.toString());
            }

        }
    }
    public fun button16_fact( gg:View) {
        var res:TextView = findViewById(R.id.display);
         val comps:String = res.getText().toString()
        if (comps.length == (0)) {

        } else {
            cal.firstnum = comps.toFloat()
            cal.operation = "fact";
            cal.calculus();
            if ((cal.otvet % 1).toString() == "0")
                res.setText(round(cal.otvet));
            else {
                res.setText(cal.otvet.toString());
            }

        }
    }
    public fun button18_x2( gg:View) {
        var res:TextView = findViewById(R.id.display);
         var comps:String = res.getText().toString()
        if (comps.length == 0) {

        } else {
            val comp:Int = comps.toInt()
            res.setText((comp * comp).toString());
        }

    }
    public fun button12_m_n( gg:View) {

        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "mn";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

        }
        else {
            cal.firstnum = comp.toFloat()

            cal.operation = "mn";
            res.setText("");
        }
        cal.cnt++;

    }
    public fun button12_sqrtn( gg:View) {

        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "sqrtn";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

        }
        else {
            cal.firstnum = comp.toFloat()

            cal.operation = "sqrtn";
            res.setText("");
        }
        cal.cnt++;

    }
    public fun button12_per( gg:View) {

        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "per";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

        }
        else {
            cal.firstnum = comp.toFloat()

            cal.operation = "per";
            res.setText("");
        }
        cal.cnt++;

    }
    public fun button12_log( gg:View) {

        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "log";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

        }
        else {
            cal.firstnum = comp.toFloat()

            cal.operation = "log";
            res.setText("");
        }
        cal.cnt++;

    }


    public fun button12_minus( gg:View) {
        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "-";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

        }
        else {
            cal.firstnum = comp.toFloat()

            cal.operation = "-";
            res.setText("");
        }
        cal.cnt++;


    }

    public fun button13_Plus( gg:View) {
        var res:TextView = findViewById(R.id.display);

        var comp:String= res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "+";
            res.setText("");
        }
        else if ( (comp.length) == 0 && cal.cnt ==0) {

  }
        else {
            cal.firstnum =comp.toFloat()

            cal.operation = "+";
            res.setText("");
        }
        cal.cnt++;

    }

    public fun button14_multiple( gg:View) {
        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "x";
            res.setText("");
        }
        else

            if ((comp.length) == 0) {

            } else {
                cal.firstnum = comp.toFloat()

                cal.operation = "x";
                res.setText("");
            }

        cal.cnt++;
    }

    public fun button15_divide( gg:View) {
        var res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if(cal.cnt >=1){
            cal.operation = "/";
            res.setText("");
        }
        else

            if ((comp.length) == 0) {

            } else {
                cal.firstnum = comp.toFloat()

                cal.operation = "/";
                res.setText("");
            }

        cal.cnt++;
    }

    public fun button14_equal( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ((comp.length) == 0)
                {


                }
        else {
            if (comp.contains("0") && cal.operation == "/" || (comp.length).equals(1) && ( comp.toInt() < 1 )) {
                res.setText("ERROR!");
            }
            else if(cal.firstnum.toString() == "0" || cal.operation =="ln")
            {
                res.setText("ERROR!");
            }


            else {
                comp= res.getText().toString()
                cal.secnum = comp.toFloat()

                cal.calculus();

                if ((cal.otvet % 1).toString() =="0")
                    res.setText(round(cal.otvet));
                else {
                    res.setText(cal.otvet.toString());
                }

            }
        }
        cal.cnt = 0;

    }

    public fun button5_Click( gg:View) {

        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "5";
            res.setText(number);
        }
    }

    public fun button8_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "8";
            res.setText(number);
        }
    }

    public fun button7_Click( gg:View) {
        val res:TextView = findViewById(R.id.display);
       var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") res.setText("") else if (comp.contains("0") and  comp.length.equals(1)) res.setText("") else {
            var number :String=  comp + "7";
            res.setText(number);
        }
    }

    public fun button9_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "9";
            res.setText(number);
        }
    }

    public fun button6_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "6";
            res.setText(number);
        }
    }

    public fun button4_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "4";
            res.setText(number);
        }
    }

    public fun button3_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "3";
            res.setText(number);
        }
    }

    public fun button2_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

            res.setText("");


        } else {
            var number :String=  comp + "2";
            res.setText(number);
        }

    }

    public fun button1_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        var comp:String = res.getText().toString()
        if ( comp  == "ERROR!") {
            res.setText("");
        } else if (comp.contains("0") and  comp.length.equals(1)) {

                res.setText("");


        } else {
             var number :String=  comp + "1";
            res.setText(number);
        }

    }

    public fun button0_Click( gg:View) {
        var res:TextView = findViewById(R.id.display)

        var number:String  = res.getText() as String
          var comp:String = res.getText().toString()
        if ((comp.contains("0")) and comp.length.equals(1))
         {

        } else {

            number =  comp + "0"
            res.setText(number);


        }
    }
    public fun buttonZapitaya_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);
        if (0 == ( res.getText()).length) {

        } else {

            var number:String  = res.getText() as String;
           var zapa:Boolean= number.contains(".");
            if (zapa == false && number != "")
                res.setText(number + ".");

        }
    }

    public fun buttonDelete_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);

        var number :String= res.getText() as String
        if (0 == number.length) {

        } else {
            if (number == "ERROR!") {
                number = "";
                res.setText(number);
            } else {
                number = number.substring(0, (number.length - 1));
                res.setText(number);

            }
        }

    }
    public fun buttonC_Click( gg:View) {
        var res:TextView = findViewById(R.id.display);

        cal.firstnum = 0f;
        cal.secnum = 0F;
        res.setText("");
        cal.operation ="";


    }
}



