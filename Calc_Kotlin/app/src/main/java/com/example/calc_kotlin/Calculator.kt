package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import kotlin.math.*

class Calculator() :Parcelable {
  var firstnum: Float = 0.0f;
    public var  secnum:Float = 0.0f
     public var cnt  : Int = 0
    public var operation  :String  =""
    public  var otvet: Float =0.0f
    public var color: Int = 0;

    constructor(parcel: Parcel) : this() {
        firstnum = parcel.readFloat()
        secnum = parcel.readFloat()
        cnt = parcel.readInt()
        operation = parcel.readString().toString()
        otvet = parcel.readFloat()
        color = parcel.readInt()
    }

    constructor (  firstnum:Float ,  secnum:Float ,  operation:String ,  otvet:Float) : this() {


             this.firstnum = firstnum
              this.secnum = secnum;
             this.operation = operation;
             this.otvet = otvet;

    }
   // constructor (  ) {




    //}







    public fun calculus()
    {
        if (operation == "+")
            otvet = firstnum + secnum;
        else if (operation == "-")
            otvet = firstnum - secnum;
        else if (operation == "x")
            otvet = firstnum * secnum;
        else if (operation == "/")
            otvet = firstnum / secnum;
        else if (operation == ";")
            otvet = sqrt(firstnum);
        else if (operation == "-+")
            otvet = firstnum + secnum;
        else if (operation == "M-")
            otvet = firstnum - secnum;
        else if (operation == "mn") {

            otvet = firstnum.pow(secnum)

        }
        else if (operation == "fact") {
        otvet = 1f
        for ( i in 1..firstnum.toInt())
        otvet *= i;
    }
    else if (operation == "nsqrt")

        otvet = secnum.pow(1/firstnum);

        else if (operation == "sin") {
       firstnum *= (3.14f / 180)
        otvet = sin(firstnum)
    }

    else if (operation == "cos") {
        firstnum *= 3.14f / 180;
        otvet = cos(firstnum);
    }

    else if (operation == "tan") {


        firstnum *= 3.14f / 180;
        otvet = tan(firstnum);
    }
    else if (operation == "log")
        otvet =  log(firstnum,secnum)

    else if (operation == "ln") {

        otvet =log(10f,firstnum)
    }
    else if (operation == "per") {

        otvet = (firstnum*secnum) / 100;
    }




    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeFloat(firstnum)
        parcel.writeFloat(secnum)
        parcel.writeInt(cnt)
        parcel.writeString(operation)
        parcel.writeFloat(otvet)
        parcel.writeInt(color)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Calculator> {
        override fun createFromParcel(parcel: Parcel): Calculator {
            return Calculator(parcel)
        }

        override fun newArray(size: Int): Array<Calculator?> {
            return arrayOfNulls(size)
        }
    }


}
