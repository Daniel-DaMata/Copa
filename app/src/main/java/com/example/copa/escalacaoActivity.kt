package com.example.copa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.copa.adapter.ItemAdapter
import com.example.copa.Data.DataSource

class escalacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escalacao)


        val myDataSet = DataSource().loadCopa()
        val recyclerView = findViewById<RecyclerView>(R.id.recicler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)



    }

}