package lv.zabarovski.m.rtu_sample4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.item_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemButton.setOnClickListener {
        val startList = Intent(this, activity_list::class.java)
        startActivity(startList)
        }

    }
}