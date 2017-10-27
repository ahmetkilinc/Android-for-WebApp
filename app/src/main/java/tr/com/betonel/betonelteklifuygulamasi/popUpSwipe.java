package tr.com.betonel.betonelteklifuygulamasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class popUpSwipe extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_swipe);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }
}
