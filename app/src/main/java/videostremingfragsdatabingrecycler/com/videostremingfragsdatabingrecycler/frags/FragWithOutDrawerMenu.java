package videostremingfragsdatabingrecycler.com.videostremingfragsdatabingrecycler.frags;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import videostremingfragsdatabingrecycler.com.videostremingfragsdatabingrecycler.R;
import videostremingfragsdatabingrecycler.com.videostremingfragsdatabingrecycler.base.BaseFragment;
import videostremingfragsdatabingrecycler.com.videostremingfragsdatabingrecycler.databinding.FragWithoutDrawerBinding;

/**
 * Created by guestsAll on 1/12/2018.
 */

public class FragWithOutDrawerMenu extends BaseFragment {
    FragWithoutDrawerBinding fragWithoutDrawerBinding;
    @Override
    public String getTagText() {
        return null;
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (fragWithoutDrawerBinding==null){
            fragWithoutDrawerBinding= DataBindingUtil.inflate(inflater, R.layout.frag_without_drawer,container,false);
        }

        return fragWithoutDrawerBinding.getRoot();
    }
}
