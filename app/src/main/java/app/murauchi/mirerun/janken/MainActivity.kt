package app.murauchi.mirerun.janken

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            Player.text = "あなたの手はグーです" //あなた=Player
            val number: Int = Random.nextInt(3) //0~2

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo) //相手＝cpuの手はグーです
                    result.text = "引き分けです"
                    result.setTextColor(Color.rgb(0, 255, 0 ))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの勝ちです"
                    //result.setTextColor(Color.parseColor("f44336"))
                    result.setTextColor(Color.rgb(255, 0, 0 ))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.rgb(0, 0, 255 ))
                }
            }
        }

        chokiButton.setOnClickListener {
            Player.text = "あなたの手はチョキです"
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.rgb(0, 0, 255 ))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "引き分けです"
                    result.setTextColor(Color.rgb(0, 255, 0 ))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.rgb(255, 0, 0 ))

                }
            }
        }

        paaButton.setOnClickListener {
            Player.text = "あなたの手はパーです"
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.rgb(255, 0, 0 ))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.rgb(0, 0, 255 ))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "引き分けです"
                    result.setTextColor(Color.rgb(0, 255, 0 ))
                }
            }
        }
    }
}