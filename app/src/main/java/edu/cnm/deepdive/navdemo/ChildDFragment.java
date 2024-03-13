package edu.cnm.deepdive.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.navdemo.databinding.FragmentChildDBinding;

public class ChildDFragment extends Fragment {

  private FragmentChildDBinding binding;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildDBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

}