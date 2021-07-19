package study.android.myapplication


import android.os.Bundle
import android.transition.AutoTransition
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.start)
        Toast.makeText(this, "Расположите элементы так, как в презентации, и потом добавьте анимацию: при выборе размера должен меняться размер пиццы на тарелке, а при тапе на пиццу появляться ее описание", Toast.LENGTH_LONG).show()
    }
}