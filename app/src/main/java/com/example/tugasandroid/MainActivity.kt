package com.example.tugasandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Notification>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.cars,
            R.drawable.icikiwir,
            R.drawable.roger,
            R.drawable.siimut,
            R.drawable.waduh
        )
        heading = arrayOf(
            "Mobil Biru menyebut anda dalam postingan yang kamu buat di Programer forum",
            "Icikiwir menyukai postingan yang kamu buat di Programer forum",
            "Roger Sumatera mengomentari postingan yang kamu buat di Programer forum",
            "Si Imut menyukai postingan yang kamu buat di Programer forum",
            "Kumalala menyukai postingan yang kamu buat di Programer forum"
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Notification>()
        getUserData()

    }

    private fun getUserData() {
        for (i in imageId.indices){
            val notification = Notification(imageId[i], heading[i])
            newArrayList.add(notification)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}