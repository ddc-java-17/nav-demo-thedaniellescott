package edu.cnm.deepdive.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.navdemo.databinding.FragmentMainBinding;
import org.jetbrains.annotations.NotNull;

public class MainFragment extends Fragment {

  private FragmentMainBinding binding;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    binding = FragmentMainBinding.inflate(inflater, container, false);
    View root = binding.getRoot();
    return root;
  }

  @Override
  public void onViewCreated(@NonNull @NotNull View view,
      @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    NavController navController = Navigation.findNavController(binding.getRoot());
    //noinspection DataFlowIssue
    binding.navigateB.setOnClickListener((v) ->
        navController
            .navigate(MainFragmentDirections.navigateToB(binding.content.getText().toString())));
    binding.navigateC.setOnClickListener((v) ->
        navController
            .navigate(MainFragmentDirections.navigateToC()));
    binding.navigateD.setOnClickListener((v) ->
        navController
            .navigate(MainFragmentDirections.navigateToD()));
  }

}