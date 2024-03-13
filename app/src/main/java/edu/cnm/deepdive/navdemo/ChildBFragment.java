package edu.cnm.deepdive.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.navdemo.databinding.FragmentChildBBinding;


public class ChildBFragment extends Fragment {

  private FragmentChildBBinding binding;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildBBinding.inflate(inflater, container, false);
    String content = ChildBFragmentArgs.fromBundle(getArguments()).getContent();
    binding.receivedContent.setText(content);
    return binding.getRoot();
  }

}