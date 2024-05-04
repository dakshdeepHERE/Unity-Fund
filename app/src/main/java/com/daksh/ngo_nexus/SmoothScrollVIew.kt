import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.HorizontalScrollView

class SmoothScrollView : HorizontalScrollView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun smoothScrollToX(targetX: Int, duration: Long) {
        val animator = ValueAnimator.ofInt(scrollX, targetX)
        animator.addUpdateListener { animation ->
            val value = animation.animatedValue as Int
            scrollTo(value, 0)
        }
        animator.interpolator = AccelerateDecelerateInterpolator()
        animator.duration = duration
        animator.start()
    }
}
