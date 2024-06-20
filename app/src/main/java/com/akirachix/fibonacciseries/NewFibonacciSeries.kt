package com.akirachix.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FibonacciAdapter(private val fibonacciNumbers: List<Int>) :
    RecyclerView.Adapter<FibonacciAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_numbers_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fibonacciNumbers[position])
    }

    override fun getItemCount(): Int {
        return fibonacciNumbers.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textView2: TextView = view.findViewById(R.id.textView2)

        fun bind(fibonacciNumber: Int) {
            textView2.text = fibonacciNumber.toString()
        }
    }
}

