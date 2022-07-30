package entertainment.flags;

import androidx.fragment.app.Fragment;

public class ExtraGameActivity extends SingleFragmentActivity {
    @Override
    Fragment createFragment() {
        return new ExtraGameFragment();
    }
}
