package edu.cnm.deepdive.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.navdemo.databinding.FragmentChildCBinding;

public class ChildCFragment extends Fragment {

  private FragmentChildCBinding binding;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildCBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

}