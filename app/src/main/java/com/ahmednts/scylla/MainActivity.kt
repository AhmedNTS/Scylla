package com.ahmednts.scylla

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmednts.scylla.utils.AppLogger
import java.lang.Exception

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    AppLogger.e(Exception())
    AppLogger.d("asdasdlakshd ashdk ")
    AppLogger.d("asdasdlakshd ashdk ")
    AppLogger.d("asdasdlakshd ashdk ")

    Hakona().pop()
  }
}

class Hakona {
  fun pop() {
    AppLogger.d("asdasdlakshd ashdk ")
  }
}

