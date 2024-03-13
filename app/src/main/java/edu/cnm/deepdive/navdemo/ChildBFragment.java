package edu.cnm.deepdive.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.navdemo.databinding.FragmentChildBBinding;


public class ChildBFragment extends Fragment {

  private FragmentChildBBinding binding;

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildBBinding.inflate(inflater, container, false);
    String content = ChildBFragmentArgs.fromBundle(getArguments()).getContent();
    binding.receivedContent.setText(content);
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    binding.navigateC.setOnClickListener((button) ->
        Navigation.findNavController(button).navigate(ChildBFragmentDirections.navigateToC()));
  }
}