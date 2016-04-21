package jam.study.a5waystomakeeggs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chong on 4/21/2016.
 */
public class StartingFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.starting_frag, container, false);
        return v;
    }

    /**
     *  Creating an instance for class StartingFragment
     * @return The instance of StartingFragment
     */
    public static StartingFragment newInstance() {

        StartingFragment f = new StartingFragment();

        return f;
    }
}


