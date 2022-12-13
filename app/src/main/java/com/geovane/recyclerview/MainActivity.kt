package com.geovane.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // criar uma instancia do meu adptar, fazendo referencia ao meu adpter
    // leteinit avisa pro sistema que ele vai ser inicizalizado em algum momento
    private lateinit var profileAdpter: ProfileAdpter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criar funcao com mais facilidade init (option + enter)

        initAdpter()
        populateItems()
    }

    private fun populateItems() {
        val dataSource = DataSource.createDataSet()
        profileAdpter.setDataSet(dataSource)
    }

    private fun initAdpter() {
       profileAdpter = ProfileAdpter()
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = profileAdpter
    }
}