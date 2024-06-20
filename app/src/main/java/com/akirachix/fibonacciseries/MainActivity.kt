package com.akirachix.fibonacciseries

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fibonacci = Fibonnacci()
        val fibonacciNumbers = fibonacci.numberSequence(100)
     binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val fibonacciAdapter = FibonacciAdapter(fibonacciNumbers)
        binding.rvNumbers.adapter = fibonacciAdapter

    }
}
class Fibonnacci {
    fun numberSequence(i: Int):List<Int>{
        var numberSeries = mutableListOf(0,1)
        var a = 0
        var b = 1
        while (numberSeries.size < i) {
            val param = a + b
            if (param<0){
                break
            }
            numberSeries.add(param)
            a = b
            b = param
        }
        return numberSeries
    }
}