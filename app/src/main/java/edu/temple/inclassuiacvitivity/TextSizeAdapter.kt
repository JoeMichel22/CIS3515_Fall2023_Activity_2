package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes: Array<Int>): BaseAdapter()
{
    val context= _context
    val textSizes= _textSizes //collection of text sizes

    override fun getCount():Int
    {
        return textSizes.size
    }
    //for one line returns you can type functions like this
    //override fun getCount()= textSizes.size

    override fun getItem(p0: Int): Any
    {
        return textSizes[p0]
    }
    //override fun getItem(p0: Int)= textSizes[p0]

    override fun getItemId(p0: Int)= p0.toLong()

//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View{
//        val textView= TextView(context)
//        textView.textSize= textSizes[p0].toFloat()
//        textView.setPadding(10, 20, 0, 20)
//        textView.text= textSizes[p0].toString()
//
//        return textView
//    }

    //Making the spinner view recycle-able
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View
    {
        return (getDropDownView(p0, p1, p2) as TextView).apply{textSize= 22f}
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView

        //Setup step
        if(position == null)
        {
            textView= TextView(context)
            textView.setPadding(10, 20, 0, 20)
        } //Recycle step
        else
        {
            textView= convertView as TextView
        }
        textView.textSize= textSizes[position].toFloat()
        textView.text= textSizes[position].toString()
        return textView
    }

}//End TextSizeAdapter class